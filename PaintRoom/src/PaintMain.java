import java.util.*;

public class PaintMain {

	public static double cover(double pArea, double pVol) {
		
		return pArea*pVol;
		
	}

//		nTins*pArea*pVol = rmArea
	
	public static double nTins(double pArea, double pVol, double rmArea) {
		
		return rmArea/(pArea*pVol);
		
	}
	
/*	pCost*nTins*pArea*pVol = (total) cost
	pCost*(rmArea/nTins) = (total) cost
	
public static double cost(double pArea, double pVol, double rmArea) {
	
	return pCost*(rmArea/nTins);
	
}

*/
		
	public static void main(String[] args) {

/*		
		Paint cheapomax = new Paint(10, 20, 19.99);
		Paint averagejoe = new Paint(11, 15, 17.99);
		Paint duluxourous = new Paint(20, 10, 25);

		Paint p = new Paint(10,20,19.99);

		
		System.out.println(cheapomax);
		System.out.println(averagejoe);
		System.out.println(duluxourous);
*/
		
		System.out.println("Area covered per tin: " + cover(4,3.32));

		System.out.println("Number of tins: " + nTins(2, 5, 40));
		
	}
	
}
