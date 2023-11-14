import java.util.Scanner;

public class Human extends Player
{
    public Human(String name, char mark)
    {
        this.name = name;
        this.mark = mark;
    }

    void makeMove()
    {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        do
        {
            System.out.println("Enter the Row and Col");
             row = sc.nextInt();
             col = sc.nextInt();
        }
        while (!isValidMove( row, col));

        TicTacToe.palcemark(row,col,mark);
    }

}
