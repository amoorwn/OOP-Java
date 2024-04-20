package ptbac2;
import java.util.Scanner;
public class Ptbac2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        float a,b,c,x;
        System.out.print("Nhap a = ");
        a=sn.nextFloat();
        System.out.print("Nhap b = ");
        b=sn.nextFloat();
        System.out.print("Nhap c = ");
        c=sn.nextFloat();
        if(a==0){
            if(b==0 &&c==0) System.out.println("vo so nghiem");
            else if(b==0 && c!=0) System.out.println("vo nghiem");
            else System.out.println("x = "+(-c/b));
        }else{
            float delta=b*b-4*a*c;
            if(delta ==0) System.out.println("nghiem kep x = "+(-b/(2*a)));
            else if(delta <0) System.out.println("vo nghiem");
            else System.out.println("x1 = "+((-b+Math.sqrt(delta))/(2*a))+", x2 = "+((-b-Math.sqrt(delta))/(2*a)));
        }
       
    }
    
}
