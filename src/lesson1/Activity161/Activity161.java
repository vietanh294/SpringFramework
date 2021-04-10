package lesson1.Activity161;


import lesson1.Activity16.Activity16;

public class Activity161 {
    public static int theMaxCounter =0;
    public static int theNumberMaxDivisor =0;
    public static long startTime =System.currentTimeMillis();
    public static long endTime;
    public static long distance;

    public static void main(String[] args) {
        System.out.println("Start: " + startTime + " ms");

        DivisorQuantity divisorQuantity =new DivisorQuantity();

        CheckNumberThread checkNumberThread =new CheckNumberThread(divisorQuantity,0,200000,0);
        checkNumberThread.start();

    }
}
class DivisorQuantity{
    int theDivisorQuantity (int number, int counter) {
        for (int i = 1; i <= number; i++) {
            if (number % i ==0){
                counter += 1;
            }

        }return counter;
    }
    public  void updateTheNumberMaxDivisor(int theNumber, int theCounter) {
        if (theCounter > Activity161.theMaxCounter){
            Activity161.theMaxCounter =theCounter;
            Activity161.theNumberMaxDivisor =theNumber;
        }
    }


}

class CheckNumberThread extends  Thread {
    DivisorQuantity divisorQuantity1;
    private int startNumber;
    private int endNumber;
    private int counterNumber = 0;

    public CheckNumberThread(DivisorQuantity divisorQuantity1, int startNumber, int endNumber, int counterNumber) {
        this.divisorQuantity1 = divisorQuantity1;
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.counterNumber = counterNumber;
    }

    @Override
    public void run() {
        for (int j = startNumber; j <= endNumber; j++) {
            counterNumber = divisorQuantity1.theDivisorQuantity(j,0);
            divisorQuantity1.updateTheNumberMaxDivisor(j,counterNumber);
        }
        System.out.println("Số có Số Ước lớn nhất là: " + Activity161.theNumberMaxDivisor);
        System.out.println("Số Ước lớn nhất là: " + Activity161.theMaxCounter);
        Activity161.endTime =System.currentTimeMillis();
        Activity161.distance = Activity161.endTime - Activity161.startTime;
        System.out.println("End: " + Activity161.endTime + " ms");
        System.out.println("TimeOut: " + Activity161.distance + " ms");
    }
}

