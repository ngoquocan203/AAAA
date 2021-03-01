
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class LopHoc {
    private String tenLop;
    private int soSV;
    private Student[] dSachSV;
    
    public LopHoc()
    {
        this.tenLop="None";
        this.soSV=0;
    }
    public LopHoc(String tenLop,int soSV)
    {
        this.tenLop="tenLop";
        this.soSV=0;
    }
    public String gettenLop()
    {
        return this.tenLop;
    }
    public void settenLop(String value)
    {
        this.tenLop=value;
    }
    public int getsoSV()
    {
        return this.soSV;
    }
    public void setsoSV(int value)
    {
        this.soSV=value;
    }
    public void setdSachSV(Student[] dSachSV)
    {
        this.dSachSV=dSachSV;
    }
    public void scanInfo()
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Ten lop:");
        settenLop(a.nextLine());
        System.out.print("So SV:");
        setsoSV(a.nextInt());
        a.nextLine(); 
        setdSachSV(new Student[getsoSV()+1]);
        for(int i=1;i<=getsoSV();i++)
        {
            System.out.print("SV"+i+":");
            System.out.print("Ten:");
            String Ten = a.nextLine();a.nextLine();
            System.out.print("MSSV:");
            String MSSV = a.nextLine();
            System.out.print("Diem:");
            int Diem = a.nextInt();
            a.nextLine();
            dSachSV[i]=new Student(Ten,MSSV,Diem);
        }
    }
    public void PrintInfo()
    {
        System.out.print("STT\t "+"MSSV\t"+"TenSV\t"+"Diem\n"); 
        for(int i=1;i<=getsoSV();i++)
        {
            System.out.print(i+"\t");
            System.out.print(dSachSV[i].getMSSV()+"\t");
            System.out.print(dSachSV[i].getTen()+"\t");
            System.out.print(dSachSV[i].getDiem()+"\n");
        }
    }
        
}
