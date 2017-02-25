package singletonFactory;

import pl.sda.singleton.Singleton;
import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortFactory;
import pl.sda.sort.factory.SortTypeEnum;
import pl.sda.sort.impl.BubbleSort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;

/**
 * Created by RENT on 2017-02-25.
 */
public class SingletonSortFactory {
    private static SingletonSortFactory instance = new SingletonSortFactory();

    private SingletonSortFactory() {}
        public static SingletonSortFactory getInstance() {
            return instance;
        }

    public static Sort produce(SortTypeEnum type) {

        if (SortTypeEnum.BUBBLE.equals(type)) {
            return new BubbleSort();
        }
        if (SortTypeEnum.COUNT.equals(type)) {
            return new CountSort();
        }
        if (SortTypeEnum.INSERT.equals(type)) {
            return new InsertSort();
        }
        return null;
    }
}

