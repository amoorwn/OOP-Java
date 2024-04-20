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
public class DoanhNghiep {
    static Scanner sn=new Scanner(System.in);
    private String tenDN;
    private String soDT;
    private String diaChi;

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void Nhap(){
        System.out.print("Nhap ten doanh nghiep: ");
        tenDN=sn.nextLine();
        System.out.print("Nhap so dien thoai: ");
        soDT=sn.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi=sn.nextLine();
    }
    public void Xuat(){
        System.out.println("Ten doanh nghiep: "+tenDN);
        System.out.println("SO dien thoai: "+soDT);
        System.out.println("Dia chi: "+diaChi);
    }
}
