
import java.util.Scanner;

public class NilaiKebenaran_05211640000149 {
    public static void main (String[]args){
        int a =0;
        int b=0;
        String f="";
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        String data [] = new String [100];
        String data1[] = new String[100];
        for(int i=0;i<n;){
            Scanner st = new Scanner (System.in);
            data [i] = st.nextLine();
            if(data[i].charAt(a)!='-'){
                f=f+data[i].charAt(a);
                a++;
            }
            else if(data[i].charAt(a)=='-'&&data[i].charAt(a)=='T'){
                f=f+"F";
                a++;
            }
            else if(data[i].charAt(a)=='-'&&data[i].charAt(a)=='F'){
                f=f+"T";
                a++;
            }
            else if(data[i].charAt(a)!=' '){
                i++;
                data1[b]=f;
                f="";
                System.out.println(data[b]);
                b++;
                
            }
        }
        
    }
}
