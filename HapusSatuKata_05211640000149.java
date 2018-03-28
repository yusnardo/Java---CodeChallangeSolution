
import java.util.Scanner;

public class HapusSatuKata_05211640000149 {
   public static void main (String[]args){
        Scanner in = new Scanner (System.in);   
        String a=in.nextLine();
        String b=in.nextLine();
        int c=0;
        
        if(a.length()-1 == b.length()){
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)==a.charAt(i)){
                    c=c+1;
                }
                else if(b.charAt(i)==a.charAt(i+1)){
                    c=c+1;
                }
                else
                    System.out.println("Tidak");
            }
        }
        else
            System.out.println("Tidak");
        if(c==b.length()){
            System.out.println("Bisa");
        }
   } 
}
