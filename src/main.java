import java.util.Hashtable;


public class main {
    public static void main(String[] args){
        Hashtable <Character,Integer> h = new Hashtable();
        String R = "MMXX";

        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int a =0,b=0;
        int number = h.get(R.charAt(R.length()-1));

        for (int i = R.length()-1; i!=0 ;i--){
            char KeyA = R.charAt(i-1);
            char KeyB = R.charAt(i);
            a = h.get(KeyA);
            b = h.get(KeyB);
            System.out.println(a+ " " + b);
            if(a < b){
                number-= a;
            }
            else{
                number += a;
            }

        }

        System.out.print(number);
    }
}
