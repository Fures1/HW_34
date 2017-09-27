package core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestDataGenerator {

        public static void main(String[] args) {

            int max=100;
            for (int i = 2; i <= max;i++){
                System.out.println("{" + i + ", "
                                + PrimeNumberChecker.validate(i) + "}" + (i < max?",":""));}
       }

//    public static void generator(){
//        int max = 100;
//
//        for (int i = 2; i <= max; i++) {
//            Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
//            map.put(i, PrimeNumberChecker.validate(i));
//
//            for (Map.Entry<Integer, Boolean> entry : map.entrySet())
//                System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }


}






