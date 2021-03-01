
public class Student {
    private String Ten;
    private String MSSV;
    private int Diem;
    
    public Student(String Ten,String MSSV,int Diem)
    {
        this.Ten=Ten;
        this.MSSV=MSSV;
        this.Diem=Diem;
    }
    public String getTen()
    {
        return Ten;
    }
    public void setTen(String value)
    {
        this.Ten=value;
    }
    public String getMSSV()
    {
        return MSSV;
    }
    public void setMSSV(String value)
    {
        this.MSSV=value;
    }
    public int getDiem()
    {
        return Diem;
    }
    public void setDiem(int Diem){
        this.Diem=Diem;
    }
    
    
}
