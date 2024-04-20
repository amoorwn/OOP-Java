
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PhongThi {
    static Scanner sn= new Scanner (System.in);
    public static final int soCho =50;
    private String maPT;
    private String diadiem;
    private int soLuongTS;
    public ArrayList<ThiSinh> thiSinh=new ArrayList<ThiSinh>();
    
    public void Nhap(){
        
        System.out.print("Nhap ma phong thi: ");
        maPT= sn.nextLine();
        System.out.print("Nhap dia diem thi: ");
        diadiem= sn.nextLine();
        try{
            System.out.print("Nhap so luong thi sinh: ");
            soLuongTS= sn.nextInt();
        }
        catch (Exception e){
            System.out.print("So thi sinh nhieu hon so cho!!");
            System.out.print("Nhap lai!");
            System.out.print("Nhap so thi sinh: ");
            soLuongTS= sn.nextInt();
        }
        ThiSinh[] ts=new ThiSinh[soLuongTS];
        for(int i=0; i<soLuongTS;i++){
            ts[i] = new ThiSinh();
            ts[i].Nhap();
            thiSinh.add(ts[i]);
        }
    }

    
    public void Xuat(){
        System.out.printf("%15s %30s %15s %15s %n","Ma phong thi","Dia diem thi","So luong ","So cho");
    
        System.out.printf("%15s %30s %15s %15s  %n",maPT,diadiem,soLuongTS,soCho);
        
        ThiSinh xSinh=new ThiSinh();
        xSinh.inTD();
        for (int i = 0; i < thiSinh.size(); i++) {
            thiSinh.get(i).inDL();
        }
        
    }
    
    public void Xoa(){
        sn.nextLine();
        System.out.print("Nhap SBD thi sinh can xoa: ");
        String sbdX=sn.nextLine();
        ThiSinh x =new ThiSinh();
        x.setSbd(sbdX);
        for (int i = 0; i < thiSinh.size(); i++) {
            if (!thiSinh.contains(x)){
                System.out.print("Khong co thi sinh nao co sbd nay");
            }else
                thiSinh.remove(x);
        }
    }
    
    
    public void Sua(){
        sn.nextLine();
        System.out.print("Nhap SBD thi sinh can sua: ");
        String sbdS=sn.nextLine();
        ThiSinh x =new ThiSinh();
        x.setSbd(sbdS);
            if (!thiSinh.contains(x)){
                System.out.print("Khong co thi sinh nao co sbd nay");
            }else{
              int vt=thiSinh.indexOf(x);
              x.Nhap();
              thiSinh.set(vt, x);
            }
                
        
    }
    

    public void Search(){
        sn.nextLine();
        System.out.print("Nhap SBD thi sinh can tim kiem: ");
        String sbdS = sn.nextLine();

        ThiSinh x = new ThiSinh();
        x.setSbd(sbdS);

        Collections.sort(thiSinh, new ComparatorTheoSBD());
        int pos = Collections.binarySearch(thiSinh, x, new ComparatorTheoSBD());
        if (pos >= 0) {
        System.out.print("Thi sinh co SBD " + sbdS + " duoc tim thay: ");
        System.out.println(thiSinh.indexOf(x)+1);
        } else {
            System.out.println("Khong tim thay thi sinh co SBD " + sbdS);
        }
    }
    
    public void SapXep(){
        Collections.sort(thiSinh, new ComparatoTheoTen());
        Xuat();
    }
    
    public void Min(){
        ThiSinh xSinh=Collections.min(thiSinh,new ComparethTheoDiemTB());
        xSinh.inTD();
        xSinh.inDL();
    }
    
    public void Max(){
        ThiSinh xSinh=Collections.max(thiSinh,new ComparethTheoDiemTB());
        xSinh.inTD();
        xSinh.inDL();
    }
    
}