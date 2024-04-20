/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiToanMayMoc;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Xe implements MayMoc{
    static Scanner sn=new Scanner(System.in);
    protected String tenXe;
    private DoanhNghiep doanhNghiep=new DoanhNghiep();
    protected int trongTai;
    protected int tienDatCoc;
    protected String tenKhachHang;
    private String nhienLieu;
    private int namSX;

    
    @Override
    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu=nhienLieu;
    }
    @Override
    public void setNamSX(int namSX){
        if(namSX>0)
            this.namSX=namSX;
        else
            this.namSX=2016;
    }

    
    public void Nhap(){
        System.out.print("Nhap ten xe: ");
        tenXe=sn.nextLine();
        doanhNghiep.Nhap();
        System.out.print("Nhap nhien lieu: ");
        setNhienLieu(sn.nextLine());
        System.out.print("Nhap nam san xuat: ");
        setNamSX(sn.nextInt());
        System.out.print("Nhap trong tai: ");
        trongTai=sn.nextInt();
        System.out.print("Nhap tien dat coc: ");
        tienDatCoc=sn.nextInt();
        sn.nextLine();
        System.out.print("Nhap ten khach hang: ");
        tenKhachHang=sn.nextLine();
    }
    public void Xuat(){
        System.out.println("Ten xe: "+tenXe);
        doanhNghiep.Xuat();
        System.out.println("Trong tai: "+trongTai);
        System.out.println("Tien dat coc: "+tienDatCoc);
        System.out.println("Ten khach hang: "+tenKhachHang);
        System.out.println("");
    }
    
    
}
