package april4;

public class Homework {

    public static void main(String[] args) throws InterruptedException {
        // 1
//        Thread thread = Thread.currentThread();
//        System.out.println("Current thread: " + thread.getName());
//        thread.setName("not_main");
//        System.out.println("New Name: " + thread.getName());
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i * i);
//            Thread.sleep(1000);
//        }

        // 2
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);

    }

}
