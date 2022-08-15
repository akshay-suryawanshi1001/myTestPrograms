
public class ChessBoard {

	public static void main(String[] args) {
		int[][] chess = new int[8][8];
		for(int i=0 ; i < 8 ; i++) {
			for(int j = 0 ; j<8 ; j++) {
				//chess[i][j] = 10;
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
	}
}
