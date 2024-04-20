/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class SinhVien {
    static Scanner snScanner=new Scanner(System.in);
    private String hoTen;
    private Date ngaySinh=new Date();
    private Mon[] monHoc;
    private float diemThi;
    int n;

    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, Mon[] monHoc, float diemThi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.monHoc = monHoc;
        this.diemThi = diemThi;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Mon[] getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(Mon[] monHoc) {
        this.monHoc = monHoc;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    
    public void Nhap(){
        System.out.print("Nhap ho ten: ");
        hoTen=snScanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh.nhap();
        System.out.print("Nhap so mon hoc: ");
        n=snScanner.nextInt();
        monHoc=new Mon[n];
        for (int i = 0; i < n; i++) {
            monHoc[i]=new Mon();
            monHoc[i].nhap();
            System.out.print("Nhap diem thi:");
            monHoc[i].diemThi=snScanner.nextFloat();
        }
    }
    
    public void Xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh.toString());
        System.out.printf("%20s %20s %20s %20s %n ","Ten mon","So hoc trinh","Hoc ky","Diem thi");
        for (int i = 0; i < n; i++) {
            System.out.printf("%20s %20s %20s %20.2f %n",monHoc[i].tenMon,monHoc[i].soHocTrinh,monHoc[i].hocKy,monHoc[i].diemThi);
        }
    }
    public void xapsep(){
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j >i; j--) {
                if(monHoc[j-1].diemThi<monHoc[j].diemThi){
                    Mon tg=monHoc[j];
                    monHoc[j]=monHoc[j-1];
                    monHoc[j-1]=tg;
                }
            }
        }
    }
}
