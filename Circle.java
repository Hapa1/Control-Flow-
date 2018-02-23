package progressBar;

public class Circle {
	
	/**
	 * Class Circle made for CMPE 187 Control Flow assignment
	 */
	
	private Color blue = Color.BLUE; //Represents empty
	private Color red = Color.RED; //Represents progress of circle
	
	/**
     * Creates a new empty grid of size 101x101
     */
	
	public Color[][] getGrid(){
		Color[][] grid = new Color[101][101];
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				grid[i][j] = blue;
			}
		}
		return grid;
	}
	
	/**
     * Outputs a string representation of the loading circle
     */
	
	public void outputGrid(Color[][] grid){ 
		for(int i = 0; i < grid.length; i++){
			System.out.println("");
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j].toString() == "BLUE"){
					System.out.print("*");
				}
				else System.out.print("X");
			}
		}
	}
	
	/**
     * Renders a given percentage of a circle give a grid 
     */
	
	public Color[][] fillGrid(int percent, Color[][] grid){
		for(double deg = 0; deg < (int)(3.6*percent); deg = deg + .1){ //degree increments by .1 for maximum print accuracy
			for(int i = 0; i < 50; i++){
				double x1 = 50+(i*(Math.sin(Math.toRadians(deg))));
				double y1 = 50+(i*(Math.cos(Math.toRadians(deg))));
				grid[(int)x1][(int)y1] = red;
			}
		}
		outputGrid(grid);
		return grid;
	}
	
	/**
     * Given a certain percentage state of a circle and point coordinates, determines the 
     * color of the point. 
     */
	
	public String getColor(int p, int x, int y){
		Color c = Color.BLUE;
		Color[][] grid = getGrid();
		grid = fillGrid(p, grid);
		String s = "Color of ("+x+","+y+")"+" is "+ grid[x][y].toString();
		return s;
	}

	public static void main(String[] args) {
		
		Circle c = new Circle();
        System.out.println(c.getColor(100, 25, 25));
	}

}
