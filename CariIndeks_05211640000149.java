
import java.util.Scanner;

public class CariIndeks_05211640000149 {
    public static void main (String[]args){
        int a=0;
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int data [] = new int [n];
        for(int i=0;i<n;i++){
            Scanner st = new Scanner (System.in);
            data [i] = st.nextInt();
        }
        
        int x= in.nextInt();
        int data1 [] = new int [x];
        for(int j=0;j<x;j++){
            Scanner st = new Scanner (System.in);
            data1 [j] = st.nextInt();
        }
        for(int k=0;k<x;k++){
            for(int l=0;l<n;l++){
                if(data1[k]==data[l]){
                    System.out.println(l);
                }
            }
            if(data1[k]!=data[a++]){
                System.out.println("-1");
            }
        }
    }
}
