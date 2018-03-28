
import java.util.Scanner;

public class SegitigaSikuSiku_05211640000149 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        
        int d = a*a;
        int e = b*b;
        int f = c*c;
        
        if(d+e==f||e+f==d||d+f==e){
            System.out.println("Siku-Siku");
        }
        else
            System.out.println("Tidak");
    }
}
