
import java.util.Comparator;


public class ComparethTheoDiemTB implements Comparator<ThiSinh> {
    @Override
    public int compare(ThiSinh o1, ThiSinh o2){
        if(o1.diemTB()>o2.diemTB())
            return 1;
        else if(o1.diemTB()<o2.diemTB())
            return -1;
        else
            return -1;
    }
    
}
