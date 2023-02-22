public class Board {
    private int n;
    char grid[][];
    public Board(int n){
        this.n = n;
        grid = new  char[n][n];

    }
    public boolean updateBoard(int x, int y, char symbol) {
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return false;
        }
        if(grid[x][y] == 'o' || grid[x][y] == 'x') {
            return false;
        }
        grid[x][y] = symbol;
        return true;
    }
    public void displayBoard(){
        for(char[] i: grid){
            for(char e: i) {
                if(e != 'x' && e != 'o')
                    System.out.print(" | " + "_" + " | ");
                else {
                    System.out.print(" | " + e + " | ");
                }
            }
            System.out.println();
        }

    }
    public boolean isWinner(char x) {
        //columns
        boolean flag = true;
        for (int i = 0; i < grid.length; i++) {
            flag = true;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != x) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }

        //rows

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                flag = true;
                if (grid[j][i] != x) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                return true;
            }
        }

        //positive diagonal
        for (int i = 0, j = 0; i < n; i++, j++) {
            flag = true;
            if(grid[i][j] != x){
                flag = false;
                break;
            }
        }

        if (flag) {
            return true;
        }

        // negative diagonal
        for (int i = n-1, j = n-1; i >= 0; i--, j--) {
            flag = true;
            if(grid[i][j] != x){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public boolean isDraw(){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] != 'x' && grid[i][j] != 'o')
                    return false;
            }
        }
        return true;
    }
}

