package mvcmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-25.
 */
public class Model {
    public static List<Long> values = new ArrayList<>();

    public static List<Long> getValues() {
        return values;
    }
    public static void addValue(long newValue) {
        values.add(newValue);
    }
}
