import java.util.Scanner;

class Move{
     int x, y;
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

}
public class Player {
    private String name;
    private char symbol;
    Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }
    public void getMove(Move m){
        Scanner in = new Scanner(System.in);
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        m.set(x,y);

    }
    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }


}
