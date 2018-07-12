import java.util.*;

public class Paint extends PaintWizard {
	
	public Paint(double pArea, double pVol, double pCost) {

		this.pArea = pArea;
		this.pVol = pVol;
		this.pCost = pCost;		

}
	
	public String toString( ) {
		
		return "Area per litre: " + pArea + ", Volume per tin: " + pVol + ", Cost per tin: " + pCost;
			
	}
	
}

	