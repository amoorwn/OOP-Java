/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    static Scanner snScanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so nhan vien: ");
        int n=snScanner.nextInt();
        NhanVien[]nv=new NhanVien[n];
        System.out.println("1.Nhan vien san xuat\n2.Nhan vien van phong");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap loai nhan vien: ");
            int loai=snScanner.nextInt();
            if(loai==1){
                nv[i]=new NhanVienSanXuat();
                nv[i].Nhap();
            }else if(loai==2){
                nv[i]=new NhanVienVanPhong();
                nv[i].Nhap();
            }
        }
        System.out.println("==============================");
        for (int i = 0; i < n; i++) {
            nv[i].Xuat();
            System.out.println("==============================");
        }
        double tongTien = 0;
        for (int i = 0; i < n; i++) {
            tongTien+= (nv[i].tinhPhuCap()+nv[i].tinhLuong());
        }
        System.out.println("==============================");
        System.out.println("Tong tien cong ty phai tra trong 1 thang la: "+tongTien);
    }
    
}
