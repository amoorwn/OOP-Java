/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDonTienDien;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    static Scanner snScanner=new Scanner(System.in);
    static int n,loai;
    public static void main(String[] args) {
        
        System.out.print("Nhap so khach hang: ");
        n=snScanner.nextInt();
        HoaDon x[]=new HoaDon[n];
        System.out.print("1.Khach hang Viet Nam\n2.Khach hang nuoc ngoai\n");
        for (int i = 0; i < n; i++) {
            System.out.println("==============================================================");
            System.out.print("Nhap loai khach hang: ");
            loai=snScanner.nextInt();
            if(loai==1){
                snScanner.nextLine();
                x[i]=new KhachHangVietNam();
                x[i].Nhap();}
            if(loai==2){
                snScanner.nextLine();
                x[i]=new KhachHangNuocNgoai();
                x[i].Nhap();
            }
        }
        System.out.println("==============================================================");
        for (int i = 0; i < n; i++) {
            System.out.println("==============================================================");
            x[i].Xuat();
        }
        
        
    }
}
