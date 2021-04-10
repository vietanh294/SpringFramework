package lesson1.Activity162;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class Activity162 {
    public static int theMaxCounter = 0;
    public static List<Integer> theNumberMaxCounter = new ArrayList<>();
    public static long startMilli2 = System.currentTimeMillis();
    public static long endMilli2;
    public static long distance;


    public static void main(String[] args) {
        System.out.println(startMilli2 + ": Start time");

        CheckDivisorQuantity checkDivisorQuantity2 = new CheckDivisorQuantity();

        CheckNumber checkNumber1 = new CheckNumber(0, 50000, 0, checkDivisorQuantity2);
        checkNumber1.start();
        CheckNumber checkNumber2 = new CheckNumber(50000,100000,0,checkDivisorQuantity2);
        checkNumber2.start();
        CheckNumber checkNumber3 =new CheckNumber(100000,130000,0,checkDivisorQuantity2);
        checkNumber3.start();
        CheckNumber checkNumber4 =new CheckNumber(130000,150000,0,checkDivisorQuantity2);
        checkNumber4.start();
        CheckNumber checkNumber5 =new CheckNumber(150000,170000,0,checkDivisorQuantity2);
        checkNumber5.start();
        CheckNumber checkNumber6 =new CheckNumber(170000,190000,0,checkDivisorQuantity2);
        checkNumber6.start();
        CheckNumber checkNumber7 =new CheckNumber(190000,200000,0,checkDivisorQuantity2);
        checkNumber7.start();

    }
}
class CheckDivisorQuantity {
    int divisorQuantity ( int number1, int counter1 ){
        int theMagicNumber1= (int) Math.sqrt(number1) +1;

        for (int j = 1; j <= theMagicNumber1; j++) {
            if(number1 % j == 0){
                counter1 =counter1 +1;
            }
        }
        counter1 =counter1*2;

        return counter1;
    }
    public void updateMaxNumber(int theCounter, int theNumber){
        if (theCounter> Activity162.theMaxCounter){
            Activity162.theNumberMaxCounter.removeAll(Activity162.theNumberMaxCounter);
            Activity162.theNumberMaxCounter.add(theNumber);
            Activity162.theMaxCounter = theCounter ;
        } else  if (theCounter == Activity162.theMaxCounter) {
            Activity162.theNumberMaxCounter.add(theNumber);
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
                Activity162.theNumberMaxCounter) {
            System.out.print(n + "   " );
        }
        System.out.println();
        System.out.println("số Ước sô lớn nhất là:  " + Activity162.theMaxCounter);
        System.out.println(System.currentTimeMillis() + ": Endtime");
        Activity162.endMilli2 =System.currentTimeMillis();
        Activity162.distance = Activity162.endMilli2 - Activity162.startMilli2;
        System.out.println("Time out: " + Activity162.distance+ "ms");
        System.out.println();
    }
}


