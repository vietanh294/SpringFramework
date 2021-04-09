package Nhap.Example3;

public class Example3 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        int number1 = 196560;
        int counter1 = 0;
        for (int j = 1; j <= number1; j++) {
            if (number1 % j == 0) {
                counter1 = counter1 + 1;
            }
            System.out.println(counter1);
        }
        long endtime = System.currentTimeMillis();
        long distance =endtime -starttime ;
        System.out.println(distance + "  ms" );
    }
}
