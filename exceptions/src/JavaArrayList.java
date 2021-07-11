import java.io.*;
import java.util.*;

public class JavaArrayList{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> numere = new ArrayList<Integer>();

        int m,l,x,y;

        for(int i=0;i<n;i++)
        {
            m = scan.nextInt();
            numere = new ArrayList<Integer>();
            for(int j=0;j<m;j++) {
                numere.add(scan.nextInt());
            }
            arr.add(numere);
        }

        l= scan.nextInt();

        for(int i=0;i<l;i++)
        {
            x= scan.nextInt();
            y= scan.nextInt();

            try{
                System.out.println(arr.get(x-1).get(y-1));
            }catch (Exception e)
            {
                System.out.println("ERROR!");
            }
        }

    }}