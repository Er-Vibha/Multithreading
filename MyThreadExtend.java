
class ThisThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class ThatThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MyThreadExtend {
    public static void main(String[] args) {

        ThisThread ob = new ThisThread();
        ob.setPriority(7);
        ThatThread ob1 = new ThatThread();
        ob1.setPriority(9);
        System.out.println(ob.getPriority());
        System.out.println(ob1.getPriority());
        ob.start();
        ob1.start();

    }
}