package dem_tu;
import java.util.Scanner;
public class Dem_tu {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String str;
        System.out.print("nhap chuoi: ");
        str=sn.nextLine();
        String words[]=str.split("\\s+");//str.split("\\s+") tach tu dua tren cac khoang trang
        int dem=words.length;
        System.out.print("So luong tu trong chuoi la: "+dem);
        
    }
    
}
