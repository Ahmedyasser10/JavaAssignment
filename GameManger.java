import java.util.Scanner;

public class GameManger {
    static int turn = 0;
    public static void main(String argv[]) {
        Player a, b;
        XOBoard board = new XOBoard(3);
        Scanner in = new Scanner(System.in);
        String s;
        System.out.println("Enter Your name Player x: ");
        s = in.next();
        a = new Player(s, 'x');
        System.out.println("Enter Your name Player o: ");
        s = in.next();
        b = new Player(s,'o');

        while (true){
            board.displayBoard();
            Move move = new Move();
            if(turn == 0){
                System.out.println("Enter your move Player " + a.getName());
                a.getMove(move);
                while (!board.updateBoard(move.x,move.y, 'x')){
                    System.out.println("Invalid input");
                    System.out.println("Enter your move Player " + a.getName());
                    a.getMove(move);
                }

                if (board.isWinner('x')){
                    System.out.println("Player " + a.getName() + " Won!");
                    break;
                }
                if(board.isDraw()){
                    System.out.println("In Draw");
                    break;
                }
                turn = 1;

            }
            else{
                System.out.println("Enter your move Player " + b.getName());
                b.getMove(move);
                while (!board.updateBoard(move.x,move.y, 'o')){
                    System.out.println("Invalid input");
                    System.out.println("Enter your move Player " + b.getName());
                    b.getMove(move);
                }
                if (board.isWinner('o')){
                    System.out.println("Player " + b.getName() + " Won!");
                    break;
                }
                if(board.isDraw()){
                    System.out.println("In Draw");
                    break;
                }
                turn = 0;
            }
        }
    }
}
