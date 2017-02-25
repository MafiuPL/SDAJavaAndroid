package pl.sda.facade;


import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {

        int[] tab = new int[]{553, 55, 1, 67, 1, 77, 0};
        SortFacade sort = new SortFacade();
        int[] result = sort.sortThroughFacade(tab);
        System.out.print(Arrays.toString(result));

    }
}
