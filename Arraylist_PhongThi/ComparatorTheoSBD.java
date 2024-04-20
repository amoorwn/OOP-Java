
import java.util.Comparator;


public class ComparatorTheoSBD implements Comparator<ThiSinh> {
    @Override
    public int compare(ThiSinh o1, ThiSinh o2){
        if(o1.getSbd().compareTo(o2.getSbd())>0)
            return 1;
        else if (o1.getSbd().compareTo(o2.getSbd())<0)
            return -1;
        else return 0;
    }
}
