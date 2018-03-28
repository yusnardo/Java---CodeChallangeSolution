
import java.util.Scanner;

public class CariBiner_05211640000149 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        if(n>1){
            Biner(n);
        }
    }
    public static void Biner(int n){
        int a;
        if(n<=1){
            System.out.print(n);
            return;
        }  
        a=n%2;
        Biner(n >> 1);
        System.out.print(a);
    }
}
