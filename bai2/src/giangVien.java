
public abstract class giangVien {
    String Ma;
    String HoTen;
    String DiaChi;
    
    public giangVien()
    {
        
    }
    public giangVien(String Ma,String HoTen,String DiaChi)
    {
        this.Ma=Ma;
        this.HoTen=HoTen;
        this.DiaChi=DiaChi;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
   public abstract void Nhap();
  
   public abstract void Hien();
   
    
}
