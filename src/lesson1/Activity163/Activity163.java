package lesson1.Activity163;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Activity163 {
    public static int number = 0;
    public static int theMaxCounter = 0;
    public static List<Integer> theNumberMaxCounter = new ArrayList<>();
    public static long startMilli2 = System.currentTimeMillis();
    public static long endMilli2;
    public static long distance;


    public static void main(String[] args) {
        System.out.println(startMilli2 + ": Start time");

        CheckDivisorQuantity checkDivisorQuantity2 = new CheckDivisorQuantity();
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Tìm số có Số Ước số lớn nhất từ 1 đến :  ");
        number =scanner.nextInt();
        System.out.println();

        startMilli2 = System.currentTimeMillis();
        System.out.println(startMilli2 + ": Start time");

        int startNumber1 = 0;
        int startNumber2  = number/4;
        int startNumber3  = number*2/4;
        int startNumber4  = number*3/4;

        int endNumber1 =number/4;
        int endNumber2 =number*2/4;
        int endNumber3 =number*3/4;
        int endNumber4 =number;

        CheckNumber checkNumber1 = new CheckNumber(startNumber1, endNumber1, 0, checkDivisorQuantity2);
        checkNumber1.start();
        CheckNumber checkNumber2 = new CheckNumber(startNumber2,endNumber2,0,checkDivisorQuantity2);
        checkNumber2.start();
        CheckNumber checkNumber3 =new CheckNumber(startNumber3,endNumber3,0,checkDivisorQuantity2);
        checkNumber3.start();
        CheckNumber checkNumber4 =new CheckNumber(startNumber4,endNumber4,0,checkDivisorQuantity2);
        checkNumber4.start();

    }
}
class CheckDivisorQuantity {
    int divisorQuantity ( int number1, int counter1 ){
        int theMagicNumber1= (int) Math.sqrt(number1) ;

        for (int j = 1; j <= theMagicNumber1; j++) {
            if(number1 % j == 0){
                counter1 =counter1 +1;
            }
        }
        counter1 =counter1*2;

        return counter1;
    }
    public void updateMaxNumber(int theCounter, int theNumber){
        if (theCounter> Activity163.theMaxCounter){
            Activity163.theNumberMaxCounter.removeAll(Activity163.theNumberMaxCounter);
            Activity163.theNumberMaxCounter.add(theNumber);
            Activity163.theMaxCounter = theCounter ;
        } else  if (theCounter == Activity163.theMaxCounter) {
            Activity163.theNumberMaxCounter.add(theNumber);
        }
    }
}


class  CheckNumber extends Thread {
    int startNumber;
    int endNumber;
    int theCounter;
    CheckDivisorQuantity checkDivisorQuantity;

    public CheckNumber(int startNumber, int endNumber, int theCounter, CheckDivisorQuantity checkDivisorQuantity) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.theCounter = theCounter;
        this.checkDivisorQuantity = checkDivisorQuantity;
    }

    @Override
    public void run() {
        for (int i = startNumber; i <= endNumber  ; i++) {
            theCounter = checkDivisorQuantity.divisorQuantity(i,0) ;
            checkDivisorQuantity.updateMaxNumber(theCounter,i);

        }
        System.out.println(Thread.currentThread().getName());
        System.out.print("Các Số có số Ước sô lớn nhất là:  ");
        for (int n :
                Activity163.theNumberMaxCounter) {
            System.out.print(n + "   " );
        }
        System.out.println();
        System.out.println("số Ước sô lớn nhất là:  " + Activity163.theMaxCounter);
        System.out.println(System.currentTimeMillis() + ": Endtime");
        Activity163.endMilli2 =System.currentTimeMillis();
        Activity163.distance = Activity163.endMilli2 - Activity163.startMilli2;
        System.out.println("Time out: " + Activity163.distance+ "ms");
        System.out.println();
    }
}


