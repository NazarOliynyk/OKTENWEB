//package PhoneBook_Map;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        TreeMap<User, TreeSet<PhoneNumber>> treeMap = new TreeMap<>();
//
//        TreeSet<PhoneNumber> phoneNumbers = new TreeSet<>();
//        System.out.println(phoneNumbers.isEmpty());
//
//        phoneNumbers.add(new PhoneNumber("home number", 8900988));
//        phoneNumbers.add(new PhoneNumber("work number", 324874386));
//        phoneNumbers.add(new PhoneNumber("fax", 87687342));
//        phoneNumbers.add(new PhoneNumber("cell phone", 21676));
//
//        treeMap.put(new User("Ivan", "Travkin"),phoneNumbers);
//
//        //System.out.println(treeMap);
//
//
//        Set<Map.Entry<User, TreeSet<PhoneNumber>>> entries = treeMap.entrySet();
//
//       //  System.out.println("entries "+entries);
//
//        Iterator<Map.Entry<User, TreeSet<PhoneNumber>>> iterator =entries.iterator();
//
//        while (iterator.hasNext()){
//            Map.Entry<User, TreeSet<PhoneNumber>> next = iterator.next();
//            Iterator<PhoneNumber> iterator1 = next.getValue().iterator();
//            while (iterator1.hasNext()){
//                PhoneNumber next1 = iterator1.next();
//                if(next1.getTypeOfNumber().equals("cell phone")){
//                    iterator1.remove();
//                }
//            }
//
//        }
//
//        for (Map.Entry<User, TreeSet<PhoneNumber>> userTreeSetEntry : treeMap.entrySet()) {
//            //userTreeSetEntry.getKey().setName();
//            //userTreeSetEntry.getKey().
//            for (Object o : userTreeSetEntry.getValue().toArray()) {
//                //System.out.println(o.toString());
//            }
//            if ( userTreeSetEntry.getValue().isEmpty()) {
//                //System.out.println(o.toString());
//            }
//            if (userTreeSetEntry.getKey().getName().equals("Ivan")){
//                userTreeSetEntry.getValue().add(new PhoneNumber("bankNumber", 456456));
//            }
//        }
//
//
//        //System.out.println(treeMap);
//
//        for (Map.Entry<User, TreeSet<PhoneNumber>> userTreeSetEntry : treeMap.entrySet()) {
//            final Iterator<PhoneNumber> iterator1 = userTreeSetEntry.getValue().iterator();
//            while (iterator1.hasNext()){
//                PhoneNumber number = iterator1.next();
//                System.out.println(number.getTypeOfNumber());
//            }
//        }
//
//       System.out.println(treeMap);
//
//    }
//
//
//
//
//}
