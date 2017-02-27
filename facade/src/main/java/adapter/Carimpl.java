package adapter;

/**
 * Created by RENT on 2017-02-27.
 */
public class Carimpl implements Car {
    @Override
    public void drive() {
        System.out.println("Jade");
    }

    @Override
    public void horn() {
        System.out.println("Trabi");
    }
}
