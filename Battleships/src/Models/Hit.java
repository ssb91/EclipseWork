package Models;

public class Hit extends Battleships {

	private boolean hit1(int x1, int y1) {		

		if (B1[x1][y1] == 1) {return true;}
		else {return false;}
		}
	
	private boolean hit2(int x2, int y2) {		

		if (B2[x2][y2] == 1) {return true;}
		else {return false;}
		}
	
}
