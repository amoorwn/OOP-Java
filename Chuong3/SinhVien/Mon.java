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
public class Mon {
    static Scanner snScanner=new Scanner(System.in);
    protected String tenMon;
    protected int soHocTrinh;
    protected String hocKy;
    float diemThi;

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoHocTrinh() {
        return soHocTrinh;
    }

    public void setSoHocTrinh(int soHocTrinh) {
        this.soHocTrinh = soHocTrinh;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    
    
    public void nhap(){
        System.out.print("Ten mon: ");
        tenMon=snScanner.nextLine();
        System.out.print("So hoc trinh: ");
        soHocTrinh=snScanner.nextInt();
        snScanner.nextLine();
        System.out.print("Hoc ky: ");
        hocKy=snScanner.nextLine();
    }
}
