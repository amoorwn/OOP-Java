
import java.util.Scanner;


public class main {
        
        public static void menu(){
            
            System.out.println("1. Nhap danh sach phong thi");
            System.out.println("2. In ra theo dang bang");
            System.out.println("3. Xoa thi sinh theo ma");
            System.out.println("4. Sua thong tin thi sinh theo ma");
            System.out.println("5. Tim kiem thi sinh theo ma");
            System.out.println("6. Sap xep thi sinh tang dan theo ten, ten trung -> xap theo ma");
            System.out.println("7. Dua ra thi sinh so tong diem thi cao nhat");
            System.out.println("8. Dua ra thi sinh so tong diem thi thap nhat");
            
        }
        
        public static void main(String[] args) {
            int lc;
            PhongThi phongThi=new PhongThi();
            while (1==1){
                menu();
                Scanner sn=new Scanner(System.in);
                System.out.print("Nhap lua chon: ");
                lc=sn.nextInt();
            switch (lc) {
                case 1:
                    phongThi.Nhap();
                    break;
                case 2:
                    phongThi.Xuat();
                    break;
                case 3:
                    phongThi.Xoa();
                    break;
                case 4:
                    phongThi.Sua();
                    break;
                case 5:
                    phongThi.Search();
                    break;
                case 6:
                    phongThi.SapXep();
                    break;
                case 7:
                    phongThi.Max();
                    break;
                case 8:
                    phongThi.Min();
                    break;
                default:
                    System.out.print("KHONG HOP LE!");
                    System.exit(0);
            }
    }
        
        
            
    }   
}
