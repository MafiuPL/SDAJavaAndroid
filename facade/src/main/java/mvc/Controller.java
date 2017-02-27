//package mvc;
//
//import fibonacci.impl.FibonacciIterational;
//import mvcmodel.FacadeModel;
//import mvcmodel.Model;
//import pl.sda.fibonacci.Fibonacci;
//
//import java.util.List;
//
///**
// * Created by RENT on 2017-02-25.
// */
//public class Controller {
//    public long getFibValue(int n) {
//        Fibonacci fib = new FibonacciIterational();
//        long val = fib.getWalue(n);
//        FacadeModel.addNewValueThroughFacade(val);
//        return val;
//    }
//    public double average() {
//        double sum = 0;
//        List<Long> values = FacadeModel.getValuesThroughFacade();
//
//        for (long val : values) {
//            sum = sum + val;
//        }
//        return sum / values.size();
//    }
//}
