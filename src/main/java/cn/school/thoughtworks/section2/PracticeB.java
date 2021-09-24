package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> num = new HashMap<String, Integer>();
        int i=0;
        while (i<collection1.size()){
            String key = collection1.get(i);
            if (key.length()<=1) {
                int finalI = i;
                num.put(key, collection1.stream().filter(elem -> collection1.get(finalI) == elem).collect(Collectors.toList()).size());
                i += num.get(key);
            }else {
                key= collection1.get(i).trim();
                String str="";
                    for(int n=0;n<key.length();n++){
                        if(key.charAt(n)>=48 && key.charAt(n)<=57){
                            str+=key.charAt(n);
                        }
                    }
                num.put(String.valueOf(key.charAt(0)),Integer.parseInt(str));
                ++i;
        }
    }
        return num;
}
}
