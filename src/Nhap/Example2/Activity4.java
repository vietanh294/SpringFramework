package Nhap.Example2;

import java.util.*;

public class Activity4 {

    public static boolean flag = true;
    public static HashMap<String,String> hashMap1;

    public static void main(String[] args) {
        HashMap<String,String> hashMap =new HashMap<String, String>();
        hashMap.put("Mon","Thứ 2");
        hashMap.put("Tue","Thứ 3");
        hashMap.put("Wed","Thứ 4");
        hashMap.put("Thu","Thứ 5");
        hashMap.put("Fri","Thứ 6");
        hashMap.put("Sat","Thứ 7");
        hashMap.put("Sun","Chủ Nhật");
        System.out.println(hashMap.get("Mon"));
        Set set = hashMap.keySet();
        for (Object key:set
        ) {
            System.out.println(key + " " + hashMap.get(key));

        }
        ArrayList<String > stringArrayList = new ArrayList<>(hashMap.keySet());
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
        Map map = new HashMap<String, String>();
        map.put("Mon","Thứ 2");
        map.put("Tue","Thứ 3");
        map.put("Wed","Thứ 4");
        map.put("Thu","Thứ 5");
        map.put("Fri","Thứ 6");
        map.put("Sat","Thứ 7");
        map.put("Sun","Chủ Nhật");
        System.out.println(map.get("Tue"));

        Set set = map.keySet();
        for (Object key:set
        ) {
            System.out.println(key + " " + map.get(key));

        }
        ArrayList<String > stringArrayList = new ArrayList<>(map.keySet());
        System.out.println(stringArrayList);
        System.out.println("___________");
        while (true){

            Random random = new Random();
            int a = random.nextInt(map.size());
            Object object= stringArrayList.get(a);
            System.out.print(object + ": ");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

class ThuNgayTiengViet extends Thread {
    @Override
    public void run() {
        while (true){
            if (Nhap.Example2.Activity4.flag == false){

                System.out.println("thứ ");


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

