
import java.util.Scanner;

public class PalindromPadaKalimat_05211640000149 {
   public static void main(String[]args){
        Scanner in = new Scanner (System.in);   
        String a=in.nextLine();
        String b="";
        int c=0;
        
        
        for (int i=0; i<a.length(); i++){
            char x = a.charAt(i);
            if(x != ' ')
            {
                b = b + x;
            }
            else{
                boolean result = false;
                String rev = "";
                for(int j = (b.length() - 1) ; j >= 0; j --)
                {
                    char ch = b.charAt(j);
                    rev = rev + ch;
                }
                b = b.toUpperCase();
                rev = rev.toUpperCase();
                result = b.equals(rev);
                if(result==true)
                {
                    c = c+1;
                    System.out.println(rev);
                }
                b = "";
            }
        }
        System.out.println(c);
        
   } 
}
