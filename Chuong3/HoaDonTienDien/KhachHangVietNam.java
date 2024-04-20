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
class KhachHangVietNam extends HoaDon{
    static Scanner snScanner=new Scanner(System.in);
    private int dinhMuc;
    private String doiTuongKhachHang;

    public KhachHangVietNam(int dinhMuc, String doiTuongKhachHang, String maKH, String hoTen, int ngay, int thang, int nam, int soLuong, int donGia) {
        super(maKH, hoTen, ngay, thang, nam, soLuong, donGia);
        this.dinhMuc = dinhMuc;
        this.doiTuongKhachHang = doiTuongKhachHang;
    }

    public KhachHangVietNam() {
        super("", "", 0, 0, 0, 0, 0); // Gọi hàm tạo của lớp cơ sở
    }
    
    
    public double tinhThanhTien(){
        if(soLuong<=dinhMuc)
            return soLuong*donGia;
        else
            return soLuong*donGia*dinhMuc+(dinhMuc-soLuong)*donGia*2.5f;
    }
    @Override
    public void Nhap(){
        
        super.Nhap();
        System.out.print("Nhap dinh muc: ");
        dinhMuc = snScanner.nextInt();
        snScanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhap doi tuong khach hang: ");
        doiTuongKhachHang = snScanner.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Dinh muc: "+dinhMuc);
        System.out.println("Doi tuong khach hang: "+doiTuongKhachHang);
        System.out.println("Thanh tien: "+tinhThanhTien());
    }
}
