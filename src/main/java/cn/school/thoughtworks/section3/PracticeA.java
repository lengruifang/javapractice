package cn.school.thoughtworks.section3;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> num = new HashMap<String, Integer>(collectionA);
        String value="";
        for (String k: object.keySet()) {
            value+=object.get(k);
        }
        for (int i=0;i<value.length();i++){
            String j=String.valueOf(value.charAt(i));
            if (num.containsKey(j)){
                num.replace(j,num.get(j),num.get(j)-1);
            }
        }
        return num;
    }
}
