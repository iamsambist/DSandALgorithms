

public class NQueen {
    static int row;  
    public static void main(String[] args) {
        int [][] board={{0,0,0,0},{0,0,0,0},
                        {0,0,0,0},{0,0,0,0}};
                        row=board.length;

                        NQueen run=new NQueen();
                        run.solveNQueen(board,0);

    }
    /**
     * @param board
     * @param ro
     * @return
     */
    private void solveNQueen(int[][] board, int ro) {
      

        if(solveNQueenUntil(board,0)){
                printSolution(board);
        }
        else{
            System.out.println("Unsloved");
        }
    }
    private void printSolution(int[][] board) {
        for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++)
				System.out.print(
					" " + board[i][j] + " ");
			System.out.println();
		}
    }
    private boolean solveNQueenUntil(int[][] board, int N) {
            if(N >= row){
                return true;
            }
            if()

        return false;
    }
}
