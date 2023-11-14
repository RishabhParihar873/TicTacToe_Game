public class Main {
    public static void main(String[] args)
    {
        TicTacToe t = new TicTacToe();
        t.inboard();
        Human p1 = new Human("bob",'X');
        AiPlayer p2 = new AiPlayer("TapAi",'O');

        Player cp;
        cp = p1;
        while(true)
        {
            System.out.println(cp.name + "'s turn");
            cp.makeMove();
            TicTacToe.displayBoard();
            if (TicTacToe.rowWin() || TicTacToe.diaWin() || TicTacToe.colWin() ||TicTacToe.checkDraw())
            {
                System.out.println(cp.name + " has Won");
                break;
            }
            else if(TicTacToe.checkDraw())
            {
                System.out.println("It is a Draw");
                break;
            }
            else
            {
                if (cp == p1)
                {
                    cp = p2;
                } else
                {
                    cp = p1;
                }
            }
        }

    }
}