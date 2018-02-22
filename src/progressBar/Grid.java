package progressBar;

import java.text.NumberFormat;
public class Grid {
	
	public static void f(int p, int x, int y){
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);

		String[][] a = new String[99][99];
		for(int j = 0; j < a.length; j++){
			System.out.println("");
			for(int k = 0; k < a[j].length; k++){
				a[j][k] = "  ";
				//System.out.print(a[j][k]);
			}
		}
		
		
		for(int b = 0; b < 100; b++){
			double theta = b * 10;
			for(int i = 0; i < 25; i++){
				double x1 = 50+(i*(Math.cos(Math.toRadians(theta))));
				double y1 = 50+(i*(Math.sin(Math.toRadians(theta))));
				double xRound = Math.round(x1 * 100.0) / 100.0;
				double yRound = Math.round(y1 * 100.0) / 100.0;
			
				a[(int)x1][(int)y1] = "[]";
				for(int j = 0; j < a.length; j++){
				
					for(int k = 0; k < a[j].length; k++){
						a[(int)xRound][(int)yRound] = "[]";
					
					}
				}
				//System.out.println(i+": ("+xRound+","+yRound+")");
			
			}
		}
		
		
		for(int j = 0; j < a.length; j++){
			System.out.println("");
			for(int k = 0; k < a[j].length; k++){
				String print = a[j][k];
				System.out.print(print);
				
			}
		}
		
	}
	
	public static void show(int[][] arr){
		
	}
	
	private static double truncate(double x)
	{
	    long y=(long)(x*100);
	    return (double)y/100;
	}
	
	public static void main(String[] args) {
	
		f(1,1,1);
	
		
	}

}
