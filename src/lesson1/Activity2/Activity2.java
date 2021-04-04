package lesson1.Activity2;

public class Activity2 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("ABC ", 3500);
        MyThread myThread2 = new MyThread("DEF" , 2500);
        myThread1.start();
        myThread2.start();
    }
}
class MyThread extends Thread{
    private String name;
    private int sleep;


    public MyThread(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
        this.setName(name);
    }

    @Override
    public void run() {

        while (true){
            System.out.println(System.currentTimeMillis() + ":" + "Thread: " + name);
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}