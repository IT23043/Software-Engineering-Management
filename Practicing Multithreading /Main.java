import java.util.Random;
import java.util.Vector;

class Threads extends Thread {
    String name;
    Random rand = new Random();
    Threads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 10; i <= 100; i = i + 10) {
            System.out.println(name + " downloaded " + i + " % ");

            try {
                Thread.sleep(500 + rand.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(name + " download finished ");
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String[] names = {"File-1", "File-2", "File-3", "File-4"};

        Thread[] th = new Thread[4];

        for (int i = 0; i < 4; i++) {
            th[i] = new Threads(names[i]);
            th[i].start();
        }

        for (int i = 0; i < names.length; i++) {
            th[i].join();
        }

        System.out.println("All downloads finished!");
    }
}
