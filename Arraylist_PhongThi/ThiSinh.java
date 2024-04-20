import java.util.*;
public class ThiSinh {
    private String sbd;
    private String tenThiSinh;
    private float toan,ly,hoa;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String tenThiSinh, float toan, float ly, float hoa) {
        this.sbd = sbd;
        this.tenThiSinh = tenThiSinh;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getTenThiSinh() {
        return tenThiSinh;
    }

    public void setTenThiSinh(String tenThiSinh) {
        this.tenThiSinh = tenThiSinh;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }
    
    public void Nhap(){
        Scanner sn= new Scanner (System.in);
        System.out.print("Nhap SBD: ");
        sbd= sn.nextLine();
        while(sbd==null){
            System.out.print("Nhap lai SBD: ");
            sbd= sn.nextLine();
        }
        System.out.print("Nhap ten thi sinh: ");
        tenThiSinh= sn.nextLine();
        while(tenThiSinh==null){
            System.out.print("Nhap lai ten thi sinh: ");
            tenThiSinh= sn.nextLine();
        }
        
        System.out.print("Nhap diem toan,ly,hoa: ");
        toan=sn.nextFloat();
        ly=sn.nextFloat();
        hoa=sn.nextFloat();
        while(10<toan & toan<0 &10<ly & ly<0&10<hoa & hoa<0){
            System.out.print("Nhap diem toan,ly,hoa: ");
            toan=sn.nextFloat();
            ly=sn.nextFloat();
            hoa=sn.nextFloat();
        }
    }
    
    public void inTD(){
        System.out.printf("%15s %30s %15s %15s %15s %n","SBD","Ten thi sinh","Diem toan","Diem ly","Diem hoa");
    }
    
    public void inDL(){
        System.out.printf("%15s %30s %15.2f %15.2f %15.2f %n",sbd,tenThiSinh,toan,ly,hoa);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThiSinh other = (ThiSinh) obj;
        return Objects.equals(this.sbd, other.sbd);
    }
    
    public float diemTB(){
        return (toan+ly+hoa)/3;
    }
    
}
