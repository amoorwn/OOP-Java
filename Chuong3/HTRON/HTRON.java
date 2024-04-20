/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HTRON;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class HTRON {
    private float R;
    Scanner sn=new Scanner(System.in);

    public float getR() {
        return R;
    }

    public void setR(float R) {
        this.R = R;
    }
    
    public void Nhap(){
        System.out.println("Nhap ban kinh: ");
        R = sn.nextFloat();
    }
    
    public double tinhChuVi(){
        return  (Math.PI*2*R);
    }
    
    public double tinhDienTich(){
        return Math.PI*R*R;
    }
    public void xuat(){
        System.out.printf("%15.2f %15.2f %15.2f %n",R,tinhChuVi(),tinhDienTich());
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so hinh tron can tinh: ");
        Scanner sn=new Scanner(System.in);
        n=sn.nextInt();
        HTRON[] a= new HTRON[n];    
        for(int i=0;i<n;i++)
        {
            a[i]=new HTRON();
            a[i].Nhap();
        }
        System.out.printf("%15s %15s %15s %n","Ban kinh","Chu vi","Dien Tich");
        for (int i = 0; i < n; i++) {
            a[i].xuat();
        }
    }
}
