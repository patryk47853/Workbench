import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> filteredList = new ArrayList<>();

        for(Object o : list) {
            if(o instanceof Integer) filteredList.add(o);
        }

        return filteredList;
    }
}
