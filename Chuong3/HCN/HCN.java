/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HCN;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HCN {
    Scanner sn = new Scanner(System.in);
    public float chieuDai,chieuRong;
    public float chuVi(){
        return (chieuDai+chieuRong)*2;
    }
    public float dienTich(){
        return chieuDai*chieuRong;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
    

    public float getChieuDai() {
        return chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }
    
    
    public void Nhap(){
        System.out.println("Nhap chieu dai: ");
        chieuDai=sn.nextFloat();
        System.out.println("Nhap chieu rong: ");
        chieuRong=sn.nextFloat();
    }
    public void Xuat(){
        System.out.println("Dien tich la: "+dienTich()+", Chu vi la: "+chuVi());
    }
    public static void main(String[] args) {
        HCN h=new HCN();
        h.Nhap();
        h.Xuat();
    }
}