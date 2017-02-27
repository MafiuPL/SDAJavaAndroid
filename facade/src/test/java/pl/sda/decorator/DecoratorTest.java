package pl.sda.decorator;

import decor.SortDecoratorWithReverse;
import org.junit.Assert;
import org.junit.Test;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.BubbleSort;

/**
 * Created by RENT on 2017-02-27.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        int[] arrayToSort = {55, 33, 77, 1, -33, 0, -222, 5, -1111};
        SortDecoratorWithReverse decorateTest = new SortDecoratorWithReverse(new BubbleSort());

        int[] result = decorateTest.sort(arrayToSort);

        Assert.assertEquals(77, result[0]);
        Assert.assertEquals(-1111, result[8]);
    }
}
