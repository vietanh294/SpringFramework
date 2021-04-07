package lesson1.Activity41;


import java.util.*;

public class Activity41 {

    public static boolean flag = true;
    public static  HashMap<String,String> hashMap1 = new HashMap<String, String>();
    public static Object weekday ;
    public static void main(String[] args) {
        hashMap1.put("Mon","Thứ 2");
        hashMap1.put("Tue","Thứ 3");
        hashMap1.put("Wed","Thứ 4");
        hashMap1.put("Thu","Thứ 5");
        hashMap1.put("Fri","Thứ 6");
        hashMap1.put("Sat","Thứ 7");
        hashMap1.put("Sun","Chủ Nhật");
        System.out.println("Hash Map Show");


        ThuNgayTiengAnh thuNgayTiengAnh = new ThuNgayTiengAnh();
        thuNgayTiengAnh.start();
        ThuNgayTiengViet thuNgayTiengViet = new ThuNgayTiengViet();
        thuNgayTiengViet.start();
    }
}


class ThuNgayTiengAnh extends Thread {
    @Override
    public void run() {

        ArrayList<String > stringArrayList = new ArrayList<>(Activity41.hashMap1.keySet());
        System.out.println(stringArrayList);
        System.out.println("___________");
        while (true){
            if (Activity41.flag == true) {
                Random random = new Random();
                int a = random.nextInt(Activity41.hashMap1.size());
                Activity41.weekday = stringArrayList.get(a);
                System.out.print(Activity41.weekday + ": ");
                Activity41.flag = false;
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
            String d = Activity41.hashMap1.get(Activity41.weekday);
            if (Activity41.flag == false){

                System.out.println(d);
                Activity41.flag = true;

                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}


