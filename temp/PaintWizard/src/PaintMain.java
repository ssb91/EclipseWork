import java.util.*;

public class PaintMain {

	public static double cover(double pArea, double pVol) {
		
		return pArea*pVol;
		
	}

	public static double nTins(double pArea, double pVol, double rmArea) {
		
		return rmArea/(pArea*pVol);
		
	}
	


	
	public static void main(String[] args) {

		
		Paint cheapomax = new Paint(10, 20, 19.99);
		Paint averagejoe = new Paint(11, 15, 17.99);
		Paint duluxourous = new Paint(20, 10, 25);

		Paint p = new Paint(10,20,19.99);
		
		System.out.println(cheapomax);
		System.out.println(averagejoe);
		System.out.println(duluxourous);
		
		System.out.println(cover(4,3.32));

		System.out.println(nTins(10, 20, 40));
		
	}
	
}
