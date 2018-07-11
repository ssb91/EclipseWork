package Models;

public class ShipHandler extends Battleships {


	int xb;
	int yb;
	int l;	
	
	public ShipHandler(int xb, int yb, int l) {
		
		this.xb;
		this.yb;
		this.l;	
	
	}
	
	
	public int ShipHandler(int[] list, int xb, int yb, int l) {
				
		
	for (int i = yb; i <= yb + l; i++) {	
		if (list[xb][yb + i] == 0) {list[xb][yb+i] = 1; }
		else {break; }
	}
	
	
	}
	
}
