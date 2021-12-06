package exerciseone;
public class HollowsquarestarFive{
    static void Squarestar(int r, int c) {
        int a, b;

        for (a = 1; a <= r; a++)
        {
            for (b = 1; b <= c; b++)
            {
                if (a == 1 || a == r || b == 1 || b == c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row = 5 ;
        int column = 5 ;
        Squarestar(row, column);

    }

}
