public abstract class Board {
     int n;
    char grid[][];
    public Board(int n){
        this.n = n;
        grid = new  char[n][n];

    }
    public abstract boolean updateBoard(int x, int y, char symbol);
    public abstract void displayBoard();
    public abstract boolean isWinner(char x);
    public abstract boolean isDraw();

}

