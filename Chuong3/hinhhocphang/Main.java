/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhocphang;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Main {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        
        
        System.out.println("Nhap ban kinh hinh tron: ");
        float R=sn.nextFloat();
        Circle circle=new Circle(R);
        
        
        System.out.println("Nhap canh hinh vuong: ");
        float Canh=sn.nextFloat();
        Square square=new Square(Canh);
        
        
        System.out.println("Nhap chieu dai: ");
        float Dai=sn.nextFloat();
        System.out.println("Nhap chieu rong: ");
        float Rong=sn.nextFloat();
        Rectangle rectangle=new Rectangle(Dai,Rong);
        
        System.out.println("Circle:");
        System.out.println("Chu vi: "+circle.tinhChuVi());
        System.out.println("Dien tich: "+circle.tinhDienTich());
        
        System.out.println("Rectangle:");
        System.out.println("Chu vi: "+rectangle.tinhChuVi());
        System.out.println("Dien tich: "+rectangle.tinhDienTich());
        
        System.out.println("Square:");
        System.out.println("Chu vi: "+square.tinhChuVi());
        System.out.println("Dien tich: "+square.tinhDienTich());
    }
}
