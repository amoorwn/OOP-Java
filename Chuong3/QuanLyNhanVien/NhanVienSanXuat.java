/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyNhanVien;

/**
 *
 * @author Admin
 */
public class NhanVienSanXuat extends NhanVien{
    private int sanPham;
    public NhanVienSanXuat(){
        super();
    }
    @Override
    public double tinhLuong(){
        return sanPham*10000;
    }
    
    @Override
    public void Nhap(){
        snScanner.nextLine();
        super.Nhap();
        System.out.print("Nhap so san pham: ");
        sanPham=snScanner.nextInt();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("So san pham: "+sanPham);
        System.out.println("");
        System.out.println("Luong: "+tinhLuong());
        System.out.println("Phu cap: "+tinhPhuCap());
    }
    
}
