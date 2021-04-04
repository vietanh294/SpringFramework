package lesson1.Activity3;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Activity3 {
    public static boolean flag = true;
    public static int year= 1992;

    public static void main(String[] args) {
        CreateNumber createNumber =new CreateNumber();
        createNumber.setName("Sinh số 4 chữ số bất kỳ: ");
        createNumber.start();
        CheckLeapYear checkLeapYear =new CheckLeapYear();
        checkLeapYear.setName("Check năm nhuận: ");
        checkLeapYear.start();
    }
}
class CreateNumber extends Thread{
    @Override
    public void run() {
        while (true){
            if (Activity3.flag == true) {
                Random random = new Random();
                Activity3.year = random.nextInt(8999)+1000 ;
                System.out.println(Thread.currentThread().getName() + "sinh ra số: " + Activity3.year);
                Activity3.flag = false;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
class CheckLeapYear extends Thread {
    @Override
    public void run() {
        while (true){
            if (Activity3.flag == false){
                if (Activity3.year %4 ==0 && Activity3.year %100 !=0){
                    System.out.println(Thread.currentThread().getName() + "Năm " + Activity3.year + " là năm nhuận.");
                } else {
                    System.out.println( Thread.currentThread().getName() + "Năm " + Activity3.year + " không phải là năm nhuận");
                }
                System.out.println("");
            }
            Activity3.flag = true;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}