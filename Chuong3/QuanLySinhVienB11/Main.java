/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySinhVienB11;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so sinh vien: ");
        int n=sn.nextInt();
        sn.nextLine();
        SinhVien[] sinhvien=new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu "+(i+1));
            sinhvien[i]=new SinhVien();
            sinhvien[i].Nhap();
            System.out.println();
            System.out.println("--------------------------------");
        }
        System.out.println("\n\n======================");
        for (int i = 0; i < n; i++) {
            sinhvien[i].Xuat();
            System.out.println("\n======================");
        }
        
    }
}
