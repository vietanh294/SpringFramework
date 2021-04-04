package lesson1.Activity1;


public class Lesson1 {
    public static int counter =0;
    public static void main(String[] args) {
        Mythread mythread1 =new Mythread();
        mythread1.setName("Thread thú 1");
        mythread1.start();
        Mythread mythread2 =new Mythread();
        mythread2.setName("Thread thú 2");
        mythread2.start();
        Mythread mythread3 =new Mythread();
        mythread3.setName("Thread thú 3");
        mythread3.start();
        Mythread mythread4 =new Mythread();
        mythread4.setName("Thread thú 4");
        mythread4.start();
        Mythread mythread5 =new Mythread();
        mythread5.setName("Thread thú 5");
        mythread5.start();
        Mythread mythread6 =new Mythread();
        mythread6.setName("Thread thú 6");
        mythread6.start();
        Mythread mythread7 =new Mythread();
        mythread7.setName("Thread thú 7");
        mythread7.start();
        Mythread mythread8 =new Mythread();
        mythread8.setName("Thread thú 8");
        mythread8.start();
        Mythread mythread9 =new Mythread();
        mythread9.setName("Thread thú 9");
        mythread9.start();
        Mythread mythread10 =new Mythread();
        mythread10.setName("Thread thú 10");
        mythread10.start();
        Mythread mythread11 =new Mythread();
        mythread11.setName("Thread thú 11");
        mythread11.start();
        Mythread mythread12 =new Mythread();
        mythread12.setName("Thread thú 12");
        mythread12.start();
        Mythread mythread13 =new Mythread();
        mythread13.setName("Thread thú 13");
        mythread13.start();
        Mythread mythread14 =new Mythread();
        mythread14.setName("Thread thú 14");
        mythread14.start();
        Mythread mythread15 =new Mythread();
        mythread15.setName("Thread thú 15");
        mythread15.start();
        Mythread mythread16 =new Mythread();
        mythread16.setName("Thread thú 16");
        mythread16.start();
        Mythread mythread17 =new Mythread();
        mythread17.setName("Thread thú 17");
        mythread17.start();
        Mythread mythread18 =new Mythread();
        mythread18.setName("Thread thú 18");
        mythread18.start();
        Mythread mythread19 =new Mythread();
        mythread19.setName("Thread thú 19");
        mythread19.start();
        Mythread mythread20 =new Mythread();
        mythread20.setName("Thread thú 20");
        mythread20.start();
        Mythread mythread21 =new Mythread();
        mythread21.setName("Thread thú 21");
        mythread21.start();
        Mythread mythread22 =new Mythread();
        mythread22.setName("Thread thú 22");
        mythread22.start();
        Mythread mythread23 =new Mythread();
        mythread23.setName("Thread thú 23");
        mythread23.start();
        Mythread mythread24 =new Mythread();
        mythread24.setName("Thread thú 24");
        mythread24.start();
        Mythread mythread25 =new Mythread();
        mythread25.setName("Thread thú 25");
        mythread25.start();
        Mythread mythread26 =new Mythread();
        mythread26.setName("Thread thú 26");
        mythread26.start();
        Mythread mythread27 =new Mythread();
        mythread27.setName("Thread thú 27");
        mythread27.start();
        Mythread mythread28 =new Mythread();
        mythread28.setName("Thread thú 28");
        mythread28.start();
        Mythread mythread29 =new Mythread();
        mythread29.setName("Thread thú 29");
        mythread29.start();
        Mythread mythread30 =new Mythread();
        mythread30.setName("Thread thú 30");
        mythread30.start();
        Mythread mythread31 =new Mythread();
        mythread31.setName("Thread thú 31");
        mythread31.start();
        Mythread mythread32 =new Mythread();
        mythread32.setName("Thread thú 32");
        mythread32.start();
        Mythread mythread33 =new Mythread();
        mythread33.setName("Thread thú 33");
        mythread33.start();
        Mythread mythread34 =new Mythread();
        mythread34.setName("Thread thú 34");
        mythread34.start();
        Mythread mythread35 =new Mythread();
        mythread35.setName("Thread thú 35");
        mythread35.start();
        Mythread mythread36 =new Mythread();
        mythread36.setName("Thread thú 36");
        mythread36.start();
        Mythread mythread37 =new Mythread();
        mythread37.setName("Thread thú 37");
        mythread37.start();
        Mythread mythread38 =new Mythread();
        mythread38.setName("Thread thú 38");
        mythread38.start();
        Mythread mythread39 =new Mythread();
        mythread39.setName("Thread thú 39");
        mythread39.start();
        Mythread mythread40 =new Mythread();
        mythread40.setName("Thread thú 40");
        mythread40.start();
        Mythread mythread41 =new Mythread();
        mythread41.setName("Thread thú 41");
        mythread41.start();
        Mythread mythread42 =new Mythread();
        mythread42.setName("Thread thú 42");
        mythread42.start();
        Mythread mythread43 =new Mythread();
        mythread43.setName("Thread thú 43");
        mythread43.start();
        Mythread mythread44 =new Mythread();
        mythread44.setName("Thread thú 44");
        mythread44.start();
        Mythread mythread45 =new Mythread();
        mythread45.setName("Thread thú 45");
        mythread45.start();
        Mythread mythread46 =new Mythread();
        mythread46.setName("Thread thú 46");
        mythread46.start();
        Mythread mythread47 =new Mythread();
        mythread47.setName("Thread thú 47");
        mythread47.start();
        Mythread mythread48 =new Mythread();
        mythread48.setName("Thread thú 48");
        mythread48.start();
        Mythread mythread49 =new Mythread();
        mythread49.setName("Thread thú 49");
        mythread49.start();
        Mythread mythread50 =new Mythread();
        mythread50.setName("Thread thú 50");
        mythread50.start();


    }

}
class  Mythread extends Thread {

    @Override


    public  void run(){
        while (true){
            Lesson1.counter +=1;
            System.out.println(Thread.currentThread().getName() +": có sô thứ tự: " + Lesson1.counter);

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}