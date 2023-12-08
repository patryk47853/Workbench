import java.util.List;
import java.util.stream.Collectors;

public class SecondKata {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(o -> o instanceof Integer)
                .collect(Collectors.toList());
    }
}
