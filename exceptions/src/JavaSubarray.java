import java.io.*;
import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i]= scan.nextInt();
        scan.close();

        int sum = 0;
        int count =0;
        int e,j;

        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
                count++;
            e=n-1;

            while(e>i)
            {
                j=e;
                sum=a[i];
                while(j>i)
                {
                    sum = sum + a[j];
                    j--;
                }
                e--;
                if(sum<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
