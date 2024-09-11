package fullMapGenerator;

public class SudokuMap {
	
	private int[][] map;
	private int[][][][] threeByThree; // first two index is for the position of big nine
									  // squares, last two is for store the actual value
	
	public SudokuMap() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.map[i][j] = 0;
			}
		}
		this.convert();
	}
	
	private void convert() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					for()
				}
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++ ) {
				System.out.print(this.map[i][j]);
			}
			System.out.println();
		}
	}
}
