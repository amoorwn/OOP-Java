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
public class Date {
    static Scanner snScanner=new Scanner(System.in);
    protected int ngay;
    protected int thang;
    protected int nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public void nhap(){
        ngay=snScanner.nextInt();
        thang=snScanner.nextInt();
        nam=snScanner.nextInt();
    }
    @Override
    public String toString() {
        return   ngay + "/" + thang + "/" + nam ;
    }
    
}
