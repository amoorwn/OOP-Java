/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PTB2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class PTB2 {
    static   Scanner sn=new Scanner(System.in);
    private float a,b,c;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void Nhap(){
        System.out.print("Nhap a,b,c = ");
        a=sn.nextFloat();
        b=sn.nextFloat();
        c=sn.nextFloat();
    }
    public void giaiPT(){
        if (a==0){
            if(b==0 & c==0)
                System.out.printf("%15.2f %15.2f %15.2f %n",a,b,c,"vo so nghiem");
            else if (b==0 & c!=0)
                System.out.printf("%15.2f %15.2f %15.2f %n",a,b,c,"vo nghiem");
            else
                System.out.printf("%15.2f %15.2f %15.2f %15.2f %n",a,b,c,-c/b);
        }
        else{
            float delta = b*b-4*a*c;
            if(delta<0)
                System.out.printf("%15.2f %15.2f %15.2f %n",a,b,c,"vo nghiem");
            else if (delta==0)
                System.out.printf("%15.2f %15.2f %15.2f %15.2f %n",a,b,c,-b/(2*a));
            else
                System.out.printf("%15.2f %15.2f %15.2f %15.2f %15.2f %n",a,b,c,(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a));
        }
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so phuong trinh can giai: ");
        n=sn.nextInt();
        PTB2[] a = new PTB2[n];
        for (int i = 0; i < n; i++) {
            a[i]=new PTB2();
            a[i].Nhap();
        }
        System.out.printf("%15s %15s %15s %20s %n","a","b","c","nghiem ");
        for (int i = 0; i < n; i++) {
            a[i].giaiPT();
            System.out.println();
        }
    }
}
