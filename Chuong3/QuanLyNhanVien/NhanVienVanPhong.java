/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienVanPhong extends NhanVien{
    private int mucLuong;
    private int soNgayNghi;
    public NhanVienVanPhong() {
        super();
    }
    
    @Override
    public double tinhLuong(){
        return mucLuong-soNgayNghi*10000;
    }
    @Override
    public void Nhap(){
        snScanner.nextLine();
        super.Nhap();
        System.out.print("Nhap muc luong: ");
        mucLuong=snScanner.nextInt();
        System.out.print("Nhap so ngay nghi: ");
        soNgayNghi=snScanner.nextInt();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Muc luong: "+mucLuong);
        System.out.println("");
        System.out.println("So ngay nghi: "+soNgayNghi);
        System.out.println("");
        System.out.println("Luong: "+tinhLuong());
        System.out.println("Phu cap: "+tinhPhuCap());
    }
}
