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
public abstract class  NhanVien {
    static Scanner snScanner=new Scanner(System.in);
    protected String hoTen;
    protected int namVaoLam;
    public abstract double tinhLuong();

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }
    
    public int tinhPhuCap(){
        return 100000+20000*(2024-getNamVaoLam());
    }
    public void Nhap(){
        System.out.print("Nhap ho ten: ");
        hoTen=snScanner.nextLine();
        System.out.print("Nhap nam vao lam: ");
        namVaoLam=snScanner.nextInt();
    }
    
    public void Xuat(){
        System.out.println("Ho ten: "+hoTen);
        System.out.println("So nam lam viec: "+namVaoLam);
    }
}
