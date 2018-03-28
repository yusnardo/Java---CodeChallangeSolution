
import java.util.Scanner;

public class CariPola_05211640000149 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int c=in.nextInt();
        int n = 0;
        for(int a=1;a<=c;a++){
            for(int b=1;b<=a;b++){
                System.out.print(n);
                n++;       
            }
            System.out.println();
        }
    }
}
