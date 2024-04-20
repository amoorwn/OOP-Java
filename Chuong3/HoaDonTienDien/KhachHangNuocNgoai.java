/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDonTienDien;

import static HoaDonTienDien.KhachHangVietNam.snScanner;

/**
 *
 * @author Admin
 */
class KhachHangNuocNgoai extends HoaDon{
    private String quocTich;

    public KhachHangNuocNgoai(String quocTich, String doituongKhachHang, String maKH, String hoTen, int ngay, int thang, int nam, int soLuong, int donGia) {
        super(maKH, hoTen, ngay, thang, nam, soLuong, donGia);
        this.quocTich = quocTich;
    }
    public KhachHangNuocNgoai() {
        super("", "", 0, 0, 0, 0, 0); // Gọi hàm tạo của lớp cơ sở
    }
    
    public double tinhThanhTien(){
            return soLuong*donGia;
    }
    
    @Override
    public void Nhap(){
        
        super.Nhap();
        snScanner.nextLine();
        System.out.print("Nhap quoc tich: ");
        quocTich = snScanner.nextLine();
    }
    @Override
    public void Xuat(){
        super.Xuat();
        System.out.println("Quoc tich: "+quocTich);
        System.out.println("Thanh tien: "+tinhThanhTien());
    }
    
    
    
}
