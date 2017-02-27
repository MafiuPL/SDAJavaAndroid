package fibonacci.impl;


import pl.sda.fibonacci.Fibonacci;

/**
 * Created by RENT on 2017-02-22.
 */
public class FibonacciRecursive implements Fibonacci {

    @Override
    public long getWalue(int n) {
        long result = 0;
        if (n == 0 || n == 1) {
            return n;
        } else if (n == 1) {
            return 1;
        } else {
            result = getWalue(n - 1) + getWalue(n - 2);
        }
        return result;
    }
}
