package mvcmodel;

import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class FacadeModel {
    public static List<Long> getValuesThroughFacade() {
        return Model.getValues();
    }
    public static void addNewValueThroughFacade(long newValue) {
        Model.addValue(newValue);
    }
}
