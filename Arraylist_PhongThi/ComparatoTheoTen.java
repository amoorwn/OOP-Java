
import java.util.Comparator;


public class ComparatoTheoTen implements Comparator<ThiSinh>{
    @Override
    public int compare(ThiSinh o1, ThiSinh o2){
        if(o1.getTenThiSinh().compareTo(o2.getTenThiSinh())>0)
            return 1;
        else if(o1.getTenThiSinh().compareTo(o2.getTenThiSinh())<0)
            return -1;
        else{
            ComparatorTheoSBD theoSBD=new ComparatorTheoSBD();
            return theoSBD.compare(o1,o2);
        }
    }
}
