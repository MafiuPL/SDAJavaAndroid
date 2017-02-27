package adapter;

/**
 * Created by RENT on 2017-02-27.
 */
public class Personimpl implements Person {
    @Override
    public void move() {
        System.out.println("Ide");
    }
    @Override
    public void say() {
        System.out.println("Czesc");
    }
}
