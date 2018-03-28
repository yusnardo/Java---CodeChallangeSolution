
import java.util.Scanner;

public class LompatAngka_05211640000149 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        in.close();
        if(x>y){
            for(int i=x; i>0; i--){
                if(i%y!=0){
                    System.out.println(i);
                }
                else if(i%y==0){
                    System.out.print("");
                }
            }
        }
    }
}
