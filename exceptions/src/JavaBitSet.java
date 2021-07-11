import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.*;


public class JavaBitSet {

    public static int count(int [] arr)
    { int c=0;
        for(int i : arr)
            if(i==1)
                c++;
        return c;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,m;
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        m= scan.nextInt();

        int [] B1 = new int[n];
        int [] B2 = new int[n];


        int a,b;
        String querry;

        for(int i=0;i<m;i++)
        {
            querry = scan.next();

            if(querry.equals("SET"))
            {
                a= scan.nextInt();
                b= scan.nextInt();

                if(a==1)
                    B1[b]=1;
                else
                    B2[b]=1;
            }

            if(querry.equals("FLIP"))
            {
                a= scan.nextInt();
                b= scan.nextInt();

                if(a==1)
                {  if(B1[b]==1)
                    B1[b]=0;
                else
                    B1[b]=1;
                }
                else{
                    if(B2[b]==1)
                        B2[b]=0;
                    else
                        B2[b]=1;
                }

            }

            if(querry.equals("OR"))
            {
                a= scan.nextInt();
                b= scan.nextInt();

                if(a==1)
                {  for(int j=0;j<n;j++)
                {
                    if(B2[j]==1)
                        B1[j]=1;
                }
                }
                else{
                    for(int j=0;j<n;j++)
                    {
                        if(B1[j]==1)
                            B2[j]=1;
                    }
                }

            }

            if(querry.equals("XOR"))
            {
                a= scan.nextInt();
                b= scan.nextInt();

                if(a==1)
                {  for(int j=0;j<n;j++)
                {
                    if(B2[j]==1 && B1[j]==0 || B2[j]==0 && B1[j]==1)
                        B1[j]=1;
                    else
                        B1[j]=0;
                }
                }
                else{
                    for(int j=0;j<n;j++)
                    {
                        if(B2[j]==1 && B1[j]==0 || B2[j]==0 && B1[j]==1)
                            B2[j]=1;
                        else
                            B2[j]=0;
                    }
                }

            }

            if(querry.equals("AND"))
            {
                a= scan.nextInt();
                b= scan.nextInt();

                if(a==1)
                {  for(int j=0;j<n;j++)
                {
                    if(B1[j]==1 && B2[j]==1)
                        B1[j]=1;
                    else
                        B1[j]=0;
                }
                }
                else{
                    for(int j=0;j<n;j++)
                    {
                        if(B1[j]==1 && B2[j]==1)
                            B2[j]=1;
                        else
                            B2[j]=0;
                    }
                }

            }

            System.out.println(count(B1) + " " + count(B2));


        }
        scan.close();
    }
}
