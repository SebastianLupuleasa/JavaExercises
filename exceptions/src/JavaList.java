import java.util.Scanner;

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> numere = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            numere.add(scan.nextInt());

        int x,y;
        int m = scan.nextInt();

        for(int j=0;j<m;j++)
        {
            String query = scan.next();
            if(query.contains("Insert"))
            {
                x = scan.nextInt();
                y = scan.nextInt();
                numere.add(x,y);
            }
            else
            {
                x = scan.nextInt();
                numere.remove(x);
            }

        }

        scan.close();

    for(Integer element : numere)
    {
        System.out.print(element+" ");
    }
    }
}
