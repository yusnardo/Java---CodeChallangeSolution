
import java.util.Scanner;

public class PesanTerbalik_05211640000149 {
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);   
        String a=in.nextLine();
        StringBuilder sb = new StringBuilder(a);
        String b="";
        int panjang = a.length();
        for(int j=0;j<panjang;j++){
            if(a.charAt(j)=='u'){
                sb.setCharAt(j, 'a');
            }
            else if (a.charAt(j)=='e'){
                sb.setCharAt(j, 'i');
            }
            else if (a.charAt(j)=='o'){
                sb.setCharAt(j, 'u');
            }
            else if (a.charAt(j)=='a'){
                sb.setCharAt(j, 'e');
            }
            else if (a.charAt(j)=='i'){
                sb.setCharAt(j, 'o');
            }
        }
        
        for(int i=panjang-1;i>=0;i--){
            b=b+sb.charAt(i);
        }
        System.out.println(b);
    }
}
