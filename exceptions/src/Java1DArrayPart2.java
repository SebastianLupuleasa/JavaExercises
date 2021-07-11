import java.util.*;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        int n=game.length;
        int i=0;
        int flag=0;
        int j = -1;

        if(i+leap>=n || i+1==n)
            return true;

        while(i+leap<n && i+1<n)
        {
            if( game[i+leap]==0)
            {
                j = i;
                i += leap;
            }
            else if(game[i+1]==0 && flag==0)
            {
                i++;
            }
            else if(i>0 && game[i-1] == 0 && i-1 != j)
            {
                i--;
                flag=1;
            }
            else
                break;

            if(i+leap>=n || i+1==n)
                return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );

        }
        scan.close();
    }
}
