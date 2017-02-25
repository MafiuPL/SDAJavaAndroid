package Obserwator;

import pl.sda.facade.SortFacade;

import java.util.*;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);
        int[] input = new int[] {32432, 45, 56, 7587, 863, 903, -1};
        int[] result = sortFacade.sortUsingCounterSort(input);
        System.out.println(Arrays.toString(result));
    }
}
