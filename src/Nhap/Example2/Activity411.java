package Nhap.Example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Activity411 {


    public static boolean flag = true;
    public static HashMap<String,String> hashMap1 = new HashMap<String, String>();
    public static Object weekday ;
    public static Object ngay ;
    public static ArrayList<String > stringArrayList ;
    public static void main(String[] args) {
        hashMap1.put("Mon","Thứ 2");
        hashMap1.put("Tue","Thứ 3");
        hashMap1.put("Wed","Thứ 4");
        hashMap1.put("Thu","Thứ 5");
        hashMap1.put("Fri","Thứ 6");
        hashMap1.put("Sat","Thứ 7");
        hashMap1.put("Sun","Chủ Nhật");
        System.out.println("Hash Map Show");
        stringArrayList= new ArrayList<>(Activity411.hashMap1.keySet());

        System.out.println(stringArrayList);
        System.out.println("___________");

        ThuNgayTiengAnh thuNgayTiengAnh = new ThuNgayTiengAnh();
        thuNgayTiengAnh.start();
        ThuNgayTiengViet thuNgayTiengViet = new ThuNgayTiengViet();
        thuNgayTiengViet.start();
    }
}


class ThuNgayTiengAnh extends Thread {
    @Override
    public void run() {


        while (true){
            if (Activity411.flag == true) {
                Random random = new Random();
                int a = random.nextInt(Activity411.hashMap1.size());
                Activity411.weekday = Activity411.stringArrayList.get(a);
                System.out.print(Activity411.weekday + ": ");

                Activity411.flag = false;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}

class ThuNgayTiengViet extends Thread {
    @Override
    public void run() {
        while (true){
            String ngay = Activity411.hashMap1.get(Activity411.weekday);
            if (Activity411.flag == false){

                System.out.println(Activity411.ngay);
                Activity411.flag = true;

                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}


