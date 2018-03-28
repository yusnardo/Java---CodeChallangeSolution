import java.util.Scanner;

public class CariFPB_05211640000149 {
    public static void main(String[ ] args){
    int hasil = 1; 
    int a, b;
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
    
    System.out.println(FPB(a,b));
    }
    public static int FPB(int x, int y){
        if((y <= x)&&(x%y==0))
            return y;
        else if(x<y)
            return FPB(y,x);
        else
            return FPB(y, x%y);
    }
}
