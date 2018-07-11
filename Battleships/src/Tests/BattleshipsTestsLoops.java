package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BattleshipsTestsLoops {

	
//	public boolean c(int x, int y) {	
//	boolean H;
//	}
	
/*	
	public boolean hittest(int x, int y) {	
	boolean H;
	if (B1[x][y] == 1) {H = true;}
	else {H = false;}
	B1[x][y] = B1[x][y] - 1;

	}
*/
	
	
	
	@Test
	void test() {		
		
		int B1[][] = {	
				
				{0,1,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,1,1},
				{0,1,0,0,0,0,0,0},
				{0,1,0,0,0,0,0,0},
				{0,1,0,0,0,1,1,1},
				{0,1,0,0,0,0,0,0},
				{0,0,0,1,1,1,0,0},
			
			};		

//		hittest(2,3);
		
		
				
		for (int i = 0; i < B1.length; i++) {
			for (int j = 0; j < B1[i].length; j++) {
				
			if (B1[i][j] == 1) {
					

			B1[i][j] = B1[i][j] - 1;

			for (int k = 0; k < B1.length; k++) {
			for (int l = 0; l < B1[k].length; l++) {
			System.out.print(B1[k][l]);}
			System.out.println();}
			System.out.println(" ");			
			}			
			else {}		
			}			
			}


		/*	*/
		
		
		
		
		int x = 0; int y = 1;

		for (int i = 0; i < B1.length; i++) {
			for (int j = 0; j < B1[i].length; j++) {
				
			if (i == x && j == y) {					

			B1[i][j] = B1[i][j] - 1;

			for (int k = 0; k < B1.length; k++) {
			for (int l = 0; l < B1[k].length; l++) {
			System.out.print(B1[k][l]);}
			System.out.println();}
			System.out.println(" ");			
			}			
			else {}		
			}			
			}
		

		
		
}

}