/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DKiXe;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class DKiXe {
    static Scanner snScanner= new Scanner(System.in);
    private String tenCX;
    private String loaiXe;
    private int dungTich;
    private float triGia;

    public String getTenCX() {
        return tenCX;
    }

    public void setTenCX(String tenCX) {
        this.tenCX = tenCX;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }
    public void Nhap(){
        snScanner.nextLine();
        System.out.print("Nhap ten chu xe: ");
        tenCX=snScanner.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe=snScanner.nextLine();
        System.out.print("Nhap dung tich: ");
        dungTich=snScanner.nextInt();
        System.out.print("Nhap tri gia: ");
        triGia=snScanner.nextFloat();
    }
    public float thue(){
        if(dungTich<100)
            return triGia*1/100;
        else if(dungTich>200)
            return triGia*5/100;
        else
            return triGia*3/100;
    }

    public class TenCXComparator implements Comparator<DKiXe> {
    @Override
        public int compare(DKiXe x1, DKiXe x2) {
            return x1.getTenCX().compareToIgnoreCase(x2.getTenCX());
        }
    }
    
    public static void main(String[] args) {
        int n;
        System.out.printf("Nhap so xe: ");
        n=snScanner.nextInt();
        DKiXe []a=new DKiXe[n];
        for (int i = 0; i < n; i++) {
            a[i]=new DKiXe();
            a[i].Nhap();
        }
        
        
        System.out.printf("%20s %20s %20s %20s %20s %n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
        for (int i = 0; i < n; i++) {
            System.out.printf("%20s %20s %20s %20.2f %20.2f %n",a[i].tenCX,a[i].loaiXe,a[i].dungTich,a[i].triGia,a[i].thue());
            System.out.println();
        }
        
        
        System.out.println("Sap xep danh sach theo ten chu xe:");
        Arrays.sort(a,new DKiXe().new TenCXComparator());
        System.out.printf("%20s %20s %20s %20s %20s %n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
        for (int i = 0; i < n; i++) {
            System.out.printf("%20s %20s %20s %20.2f %20.2f %n",a[i].tenCX,a[i].loaiXe,a[i].dungTich,a[i].triGia,a[i].thue());
            System.out.println();
        }
        
        
        System.out.println("Xe phai nop thue nhieu nhat la:");
        float max =a[0].thue();
        int maxIndex=0;
        for (int i = 1; i < n; i++) {
            if(a[i].thue()>max){
                max=a[i].thue();
                maxIndex=i;
            }
        }
        System.out.printf("%20s %20s %20s %20s %20s %n","Ten chu xe","Loai xe","Dung tich","Tri gia","Thue phai nop");
        System.out.printf("%20s %20s %20s %20.2f %20.2f %n",a[maxIndex].tenCX,a[maxIndex].loaiXe,a[maxIndex].dungTich,a[maxIndex].triGia,a[maxIndex].thue());
        
    }
}

