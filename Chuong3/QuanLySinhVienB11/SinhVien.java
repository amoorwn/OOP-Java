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
class SinhVien implements ChuyenNganh {
    private String ho;
    private String ten;
    private DiaChi diaChiNha;
    private DiaChi diaChiTruong;
    private double diem1,diem2, diem3;
    private String tenCN;
    
    static Scanner sn=new Scanner(System.in);

    @Override
    public void setChuyenNganh(String chuyenNganh){
        this.tenCN=chuyenNganh;
    }
    
    @Override
    public String getChuyenNganh(){
        return tenCN;
    }
    
    public void SetCotDiem(String loaiDiem, double diem){
        switch (loaiDiem) {
            case "diem1":
                System.out.print("Diem1: ");
                diem1=sn.nextDouble();
                break;
            case "diem2":
                System.out.print("Diem2: ");
                diem2=sn.nextDouble();
                break;
            case "diem3":
                System.out.print("Diem3: ");
                diem3=sn.nextDouble();
                break;
            default:
                System.out.println("Diem khong hop le!");
        }
    }
    public void GetCotDiem(String loaiDiem){
        switch (loaiDiem) {
            case "diem1":
                System.out.println("Diem1: "+diem1);
                break;
            case "diem2":
                System.out.println("Diem2: "+diem2);
                break;
            case "diem3":
                System.out.println("Diem3: "+diem3);
                break;
            default:
                System.out.println("Diem khong hop le!");
                
        }
    }
    
    public double DiemTrungBinh(){
        return (diem1+diem2+diem3)/3.0;
    }
    public void Nhap(){
        System.out.print("Nhap ho: ");
        ho = sn.nextLine();
        System.out.print("Nhap ten: ");
        ten = sn.nextLine();
        System.out.println("Nhap dia chi nha:");
        diaChiNha=new DiaChi();
        diaChiNha.Nhap();
        
        System.out.println("Nhap dia chi truong:");
        diaChiTruong=new DiaChi();
        
        diaChiTruong.Nhap();
        SetCotDiem("diem1", diem1);
        SetCotDiem("diem2", diem2);
        SetCotDiem("diem3", diem3);
        sn.nextLine();
        System.out.print("Nhap ten chuyen nganh: ");
        tenCN = sn.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Ho: "+ho);
        System.out.println("Ten: "+ten);
        System.out.println("Thong tin dia chi nha:");
        diaChiNha.Xuat();
        System.out.println("Thong tin dia chi truong:");
        diaChiTruong.Xuat();
        GetCotDiem("diem1");
        GetCotDiem("diem2");
        GetCotDiem("diem3");
        System.out.println("Ten chuyen nganh: "+tenCN);
        System.out.println("Diem trung binh: "+DiemTrungBinh());
    }
    
}
