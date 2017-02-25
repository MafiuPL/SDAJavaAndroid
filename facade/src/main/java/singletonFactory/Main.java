package singletonFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortFactory;
import pl.sda.sort.factory.SortTypeEnum;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        SingletonSortFactory factory = SingletonSortFactory.getInstance();

        Sort sort = factory.produce(SortTypeEnum.BUBBLE);

        int[] sortedArray = sort.sort(new int[] {398, 94394, 999, 294, 843});

        System.out.println();
    }
}
