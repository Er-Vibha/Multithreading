
class ThreadRun1  implements Runnable
{
    public void run() {
        while (true){
        System.out.println("This is ThreadRun 1");
        }
    }
}
class ThreadRun2 implements Runnable{
    public void run() {
        while (true)
            System.out.println("This is ThreadRun 2");
    }
}
public class ThreadRunnable{
    public static void main(String[] args) {
ThreadRun1 run1=new ThreadRun1();
Thread t1=new Thread(run1);
ThreadRun2 run2=new ThreadRun2();
Thread t2=new Thread(run2);
t1.start();
t2.start();
    }
}
