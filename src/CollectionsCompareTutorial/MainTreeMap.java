package CollectionsCompareTutorial;

import java.util.*;

/**
 * Created by user on 14.11.18.
 */
public class MainTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("It builds sequence by numbers and deletes non-unique elements");
        treeMap.put(106, "Mukola");
        treeMap.put(102, "Yura");
        treeMap.put(104, "Ivan");
        treeMap.put(107, "Andriy");
        treeMap.put(101, "Pavlo");
        treeMap.put(103, "Zenuk");
        treeMap.put(106, "TheSameNumber");
        treeMap.put(105, "Igor");

        System.out.println(treeMap);

        Set<Map.Entry<Integer, String>> entries= treeMap.entrySet();

        System.out.println("entries "+entries);

//        Iterator<Map.Entry<Integer, String>> iterator = treeMap.iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> next = iterator.next();
//            if(next.getValue().equals("Zenuk")){
//                iterator.remove();
//            }
//        }

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(106, "Mukola");
        hashMap.put(102, "Yura");
        hashMap.put(104, "Ivan");
        hashMap.put(107, "Andriy");
        hashMap.put(101, "Pavlo");
        hashMap.put(103, "Zenuk");
        hashMap.put(106, "TheSameNumber");
        hashMap.put(105, "Igor");

        System.out.println(hashMap);

        Set<Map.Entry<Integer, String>> entriesHashMap= hashMap.entrySet();

        System.out.println("entries "+entries);

//        Iterator<Map.Entry<Integer, String>> iteratorHashMap = hashMap.iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> next = iterator.next();
//            if(next.getValue().equals("Zenuk")){
//                iterator.remove();
//            }
//        }
    }

}
