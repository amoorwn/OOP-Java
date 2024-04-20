/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDonTienDien;

import java.util.Scanner;

public class HoaDon {
    static Scanner snScanner=new Scanner(System.in);
    protected String maKH;
    protected String hoTen;
    protected int ngay;
    protected int thang;
    protected int nam;
    protected int soLuong;
    protected int donGia;

    public HoaDon(String maKH, String hoTen, int ngay, int thang, int nam, int soLuong, int donGia) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    
    public void Xuat(){
        System.out.println("Ma khach hang: "+maKH);
        System.out.println("Ho ten: "+hoTen);
        System.out.println("Ngay/Thang/Nam: "+ngay+"/"+thang+"/"+nam);
        System.out.println("So luong: "+soLuong);
        System.out.println("Don gia: "+donGia);
        
    }
    
    public void Nhap(){
        System.out.print("Nhap ma KH: ");
        maKH=snScanner.nextLine();
        System.out.print("Nhap ten KH: ");
        hoTen=snScanner.nextLine();
        System.out.print("Nhap ngay: ");
        ngay=snScanner.nextInt();
        System.out.print("Nhap thang: ");
        thang=snScanner.nextInt();
        System.out.print("Nhap nam: ");
        nam=snScanner.nextInt();
        System.out.print("Nhap so luong: ");
        soLuong=snScanner.nextInt();
        snScanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia=snScanner.nextInt();
    }
}
