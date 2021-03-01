
import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
     Scanner a = new Scanner(System.in);
     canBo[] dscb=new canBo[100];
     char tiep='y';int k=0;
     while(tiep=='y')
     {
         canBo cb = new canBo();
         cb.Nhap();
         dscb[k]=cb;
         k++;
         System.out.print("Nhap tiep(y/n)");
         tiep=a.next().charAt(0);
         String s1 = a.nextLine();
         
     }
         
     for(int i=0;i<k;i++)
     {
         canBo cb = new canBo();
         cb = dscb[i];
         cb.Hien();
     }
     System.out.print("Nhap ho ten can bo can tim:");
     String HoTen = a.nextLine();
     for(int i=0;i<k;i++)
     {
         canBo cb = new canBo();
         cb = dscb[i];
         if(cb.KiemTra(HoTen))
             cb.Hien();
     }
    }
}
