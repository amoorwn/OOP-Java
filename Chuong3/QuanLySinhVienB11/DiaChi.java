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
class DiaChi {
    private String duong;
    private String quan;
    private String thanhPho;
    private Long maVung;


    static Scanner sn=new Scanner(System.in);
    
    
    public void Nhap(){
        System.out.print("Duong: ");
        duong = sn.nextLine();
        System.out.print("Quan: ");
        quan = sn.nextLine();
        System.out.print("Thanh pho: ");
        thanhPho = sn.nextLine();
        System.out.print("Ma vung: ");
        maVung = sn.nextLong();
        sn.nextLine();
    }
    
    public void Xuat(){
        System.out.println("Duong: "+duong);
        System.out.println("Quan: "+quan);
        System.out.println("Thanh pho: "+thanhPho);
        System.out.println("Ma vung: "+maVung);
    }
    
    
    
    
}
