package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import Models.Board1;

class BattleshipsTests {	

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
	
	System.out.println(B1[0][1]);
	
	for (int i = 0; i < B1.length; i++) {
	for (int j = 0; j < B1[i].length; j++) {
	System.out.print(B1[i][j]);
	}
	System.out.println();
	}
		
	System.out.println(B1[7][7]);

	assertEquals(0,B1[3][5]);

	
	boolean H;
	int x = 2; int y = 3;
	if (B1[x][y] == 1) {H = true;}
	else {H = false;}
	B1[x][y] = B1[x][y] - 1;

	assertEquals(false,H);
	
//	assertEquals(true, Battleships.hit(3, 5));
	
	}

}
