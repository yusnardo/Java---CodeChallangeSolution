
import java.util.Scanner;

public class AngkaTerbilang_05211640000149 {
    String[] nomina={"","satu","dua","tiga","empat","lima","enam",
                        "tujuh","delapan","sembilan","sepuluh","sebelas"};
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        int data [] = new int [100];
        for(int i=0;i<n;i++){
            Scanner st = new Scanner (System.in);
            data [i] = st.nextInt();
        }
        for(int j=0;j<n;j++){
            System.out.println( new AngkaTerbilang_05211640000149().syarat(data[j]));
        }
    }
    public String syarat(double angka)
    {
        if(angka<12)
        {
          return nomina[(int)angka];
        }
        
        if(angka>=12 && angka <=19)
        {
            return nomina[(int)angka%10] +" belas ";
        }
        
        if(angka>=20 && angka <=99)
        {
            return nomina[(int)angka/10] +" puluh "+nomina[(int)angka%10];
        }
        
        if(angka>=100 && angka <=199)
        {
            return "seratus "+ syarat(angka%100);
        }
        
        if(angka>=200 && angka <=999)
        {
            return nomina[(int)angka/100]+" ratus "+syarat(angka%100);
        }
        
        if(angka>=1000 && angka <=1999)
        {
            return "seribu "+ syarat(angka%1000);
        }
        
        if(angka >= 2000 && angka <=999999)
        {
            return syarat((int)angka/1000)+" ribu "+ syarat(angka%1000);
        }
        
        if(angka >= 1000000 && angka <=999999999)
        {
            return syarat((int)angka/1000000)+" juta "+ syarat(angka%1000000);
        }
        
        return "";
    }
}
