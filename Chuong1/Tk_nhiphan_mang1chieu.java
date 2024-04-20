package tk_nhiphan_mang1chieu;
import java.util.Scanner;
public class Tk_nhiphan_mang1chieu {
    static int timkiem(int a[], int l,int r, int k)
    {
        if(l>r) { return -1;}
        else{
            int j=(l+r)/2;
            if(k==a[j]){
                return j;
            }
            else if(k>a[j])
                return timkiem(a,j+1,r,k);
            else return timkiem(a,l,j-1,k);
        }
    }
    public static void main(String[] args) {
        int n,k;
        Scanner sn= new Scanner(System.in);
        System.out.print("Nhap n = ");
        n=sn.nextInt();     
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"] = ");
            a[i]=sn.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"   ");
        }
        for(int i=0;i<n-1;i++)
            for(int j=n-1;j>i;j--)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        System.out.print("\n");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"   ");
        }
        System.out.print("Nhap k = ");
        k=sn.nextInt();
        int m = timkiem(a,0,n-1,k);
        if(m==-1) System.out.print("khong co");
        else System.out.println(k+" o vi tri thu "+(m+1));
    }
    
}
