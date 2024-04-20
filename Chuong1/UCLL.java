
package ucll;
import java.util.Scanner;
public class UCLL {
    static float UCLN(float a, float b){
        if(a%b==0) return b;
        else return UCLN(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        float a,b;
        System.out.print("Nhap a = ");
        a=sn.nextFloat();
        System.out.print("Nhap b = ");
        b=sn.nextFloat();
        System.out.println("UCLN("+a+","+b+") = "+UCLN(a,b));
    }
    
}
