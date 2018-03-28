import java.util.Scanner;
public class BilanganPangkat_05211640000149 {
   public static void main(String[ ] args){ 
    int hasil = 1; 
    int a, b;
    Scanner in=new Scanner(System.in);
    a=in.nextInt();
    b=in.nextInt();
        for(int i=1;i<=b;i++){ 
        
        hasil=hasil*a; 
    }  
        System.out.println(hasil);
   }
}
