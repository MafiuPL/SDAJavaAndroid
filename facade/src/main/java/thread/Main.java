package thread;

/**
 * Created by RENT on 2017-02-27.
 */
public class Main {
    public static void main(String[] args) {

        Runnable runnable = new SDAThread(1);
        Runnable runnable2 = new SDAThread(2);

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread.start();
        thread2.start();

        System.out.println("Ttutaj sie skonczyl Main");
    }
}
