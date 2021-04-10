package lesson1.Activity16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Activity16 {
    public static int theNumber = 0 ;
    public static int theMaxCounter = 0;
    public static List<Integer> theNumberMaxCounter = new ArrayList<>();
    public static long startMilli2 = System.currentTimeMillis();
    public static long endMilli2;
    public static long distance;


    public static void main(String[] args) {
        System.out.println(startMilli2 + ": Start time");

        CheckDivisorQuantity checkDivisorQuantity2 = new CheckDivisorQuantity();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tìm các số có số ước số lớn nhất từ 1 đến :   ");
        theNumber =scanner.nextInt();
        startMilli2 =System.currentTimeMillis();
        System.out.println( "Start time: " + startMilli2 );

        int startNumber1,startNumber2,startNumber3,startNumber4,startNumber5,endNumber1,endNumber2,endNumber3,endNumber4,endNumber5;
        startNumber1 =0;
        startNumber2 = endNumber1 = theNumber /5;
        startNumber3 = endNumber2 = theNumber*2 /5;
        startNumber4 = endNumber3 = theNumber*3 /5;
        startNumber5 = endNumber4 = theNumber*4 /5;
        endNumber5 = theNumber;

        CheckNumber checkNumber1 = new CheckNumber(startNumber1, endNumber1, 0, checkDivisorQuantity2);
        checkNumber1.start();
        CheckNumber checkNumber2 = new CheckNumber(startNumber2,endNumber2,0,checkDivisorQuantity2);
        checkNumber2.start();
        CheckNumber checkNumber3 =new CheckNumber(startNumber3,endNumber3,0,checkDivisorQuantity2);
        checkNumber3.start();
        CheckNumber checkNumber4 =new CheckNumber(startNumber4,endNumber4,0,checkDivisorQuantity2);
        checkNumber4.start();
        CheckNumber checkNumber5 =new CheckNumber(startNumber5,endNumber5,0,checkDivisorQuantity2);
        checkNumber5.start();
    }
}
    class CheckDivisorQuantity {
        int divisorQuantity ( int number1, int counter1 ){
            int theMagicNumber = (int)   Math.sqrt(number1);
            for (int j = 1; j <= theMagicNumber; j++) {
                if(number1 % j == 0){
                counter1 =counter1 +1;
                }

            } counter1 =counter1 *2;

            return counter1;
        }
        public void updateMaxNumber(int theCounter1, int theNumber1){
            if (theCounter1> Activity16.theMaxCounter){
                Activity16.theNumberMaxCounter.removeAll(Activity16.theNumberMaxCounter);
                Activity16.theNumberMaxCounter.add(theNumber1);
                Activity16.theMaxCounter = theCounter1 ;
            } else  if (theCounter1 == Activity16.theMaxCounter) {
                Activity16.theNumberMaxCounter.add(theNumber1);
            }
        }
    }


    class  CheckNumber extends Thread {
        int startNumber;
        int endNumber;
        int theCounter;
        CheckDivisorQuantity checkDivisorQuantity1;

        public CheckNumber(int startNumber, int endNumber, int theCounter, CheckDivisorQuantity checkDivisorQuantity) {
            this.startNumber = startNumber;
            this.endNumber = endNumber;
            this.theCounter = theCounter;
            this.checkDivisorQuantity1 = checkDivisorQuantity;
        }

        @Override
        public void run() {
            for (int i = startNumber; i <= endNumber  ; i++) {
                   theCounter = checkDivisorQuantity1.divisorQuantity(i,0) ;
                   checkDivisorQuantity1.updateMaxNumber(theCounter,i);
            }

            System.out.println(Thread.currentThread().getName());
            System.out.print("Các Số có số Ước sô lớn nhất là:  ");
            for (int n :
                    Activity16.theNumberMaxCounter) {
                System.out.print(n + "   " );
            }

            System.out.println();
            System.out.println("số Ước sô lớn nhất là:  " + Activity16.theMaxCounter);
            System.out.println(System.currentTimeMillis() + ": Endtime");
            Activity16.endMilli2 =System.currentTimeMillis();
            Activity16.distance = Activity16.endMilli2 -Activity16.startMilli2;
            System.out.println("Time out: " + Activity16.distance+ "ms");
            System.out.println();
        }
    }


