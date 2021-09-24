package cn.school.thoughtworks.section2;

import java.util.AbstractList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> num = new HashMap<String, Integer>();
        int i=0;
while (i<collection1.size()){
    String key = collection1.get(i);
    int finalI = i;
    num.put(key,collection1.stream().filter(elem->collection1.get(finalI)==elem).collect(Collectors.toList()).size());
    i+=num.get(key);
}
        return num;
    }
}
