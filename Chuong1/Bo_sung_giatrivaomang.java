package bo_sung_giatrivaomang;
import java.util.Scanner;
import java.util.Arrays;
public class Bo_sung_giatrivaomang {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int k,n;
        System.out.print("Nhap n = ");
        n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"] = ");
            a[i]=sn.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"   ");
        }
        System.out.print("Nhap vi tri can chen = ");
        k=sn.nextInt();
        System.out.print("Nhap gia tri can chen = ");
        int value =sn.nextInt();
        int aRarray[] = Arrays.copyOf(a,n+1); //tao ban sao cua 1 mang Arrays.copyOf(mang bdau,do dai mang muon sao chep)
        for(int i=n-1;i>=k-1;i--)
        {
            aRarray[i+1]=aRarray[i];
        }
        aRarray[k-1]=value;
        a=aRarray;
        for(int i=0;i<=n;i++)
        {
            System.out.print(a[i]+"   ");
        }
        sn.close();
    }
}
