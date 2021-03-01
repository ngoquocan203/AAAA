
import java.util.Scanner;


public class canBo extends giangVien {
    private String ChucVu;
    private double HeSo;
    static Scanner a = new Scanner(System.in);  
    

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public double getHeSo(){
        return HeSo;
    }

    public void setHeSo(double HeSo){
        this.HeSo = HeSo;
    }
    
     public canBo()
    {
        
    }
    public canBo(String Ma, String HoTen, String DiaChi,double HeSo,String ChucVu) {
        super(Ma, HoTen, DiaChi);
        this.ChucVu=ChucVu;
        this.HeSo=HeSo;
    }
    
   @Override
    public void Nhap()
    {
        System.out.print("Ma:"); String Ma = a.nextLine();
        System.out.print("Ten:"); String Ten = a.nextLine();
        System.out.print("DiaChi:"); String DiaChi = a.nextLine();
        System.out.print("Chuc Vu:");    String ChucVu = a.nextLine();
        System.out.print("He So:");  double HeSo = a.nextDouble();a.nextLine();
        this.setMa(Ma);
        this.setHoTen(HoTen);
        this.setDiaChi(DiaChi);
        this.setChucVu(ChucVu);
        this.setHeSo(HeSo);
    } 
    @Override
    public void Hien()
    {
        System.out.println("|"+this.getMa()+"|"+this.getHoTen()+"|"+this.getDiaChi()+"|"+this.getChucVu()+"|");
       
    }
    public boolean KiemTra(String HoTen)
    {
        if(this.getHoTen().equals(HoTen))
            return true;
        else
            return false;
    }

    
    
    

    
}