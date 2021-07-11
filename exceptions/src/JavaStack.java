import java.util.*;
class JavaStack{

    public static void main(String []argh) {
        Stack<String> stk = new Stack<String>();
        Scanner sc = new Scanner(System.in);

        int j;

        Map<String, String> map = new HashMap<String, String>();
        map.put("{", "}");
        map.put("(", ")");
        map.put("[", "]");

        int flag=0;

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            stk.push(input);
        }
        sc.close();


        for (int i = 0; i < stk.size(); i++)
         for(int g =0 ; g<stk.get(i).length(); g++)
        {

           if(map.get(stk.get(i).charAt(g)) == null)
           {System.out.println("false");
               flag=1;
               break;
           }

           j = stk.search(map.get(stk.get(i)));

           if (j == -1) {
                flag=1;
                System.out.println("false");
                break;
            } else if ((j - i) % 2 == 0) {
                flag=1;
                System.out.println("false");
                break;
            }
            stk.remove(j);
        }

        if(flag==0)
        {
            System.out.println("true");}

    }

}



