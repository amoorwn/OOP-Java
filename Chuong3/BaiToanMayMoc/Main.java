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
public class Main {
    static Scanner sn=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so xe: ");
        int n=sn.nextInt();
        Xe[]xe=new Xe[n];
        for (int i = 0; i < n; i++) {
            xe[i]=new Xe();
            xe[i].Nhap();
        }
        System.out.println("\n=============================");
        for (int i = 0; i < n; i++) {
            xe[i].Xuat();
            System.out.println("=============================");
        }
        System.out.println("Xe co trong tai lon nhat");
        int max=xe[0].trongTai;
        int indexMax=0;
        for (int i = 0; i < n; i++) {
            if(xe[i].trongTai>max){
                max=xe[i].trongTai;
                indexMax=i;
            }
        }
        xe[indexMax].Xuat();
        
    }
}
