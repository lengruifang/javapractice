package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> result = new HashMap<>();
        for (String charItemStr : collection1) {
            CharItem charItemObj = CharItem.createChByStr(charItemStr);
            String ch = charItemObj.getCh();
            Integer count = charItemObj.getCount();
            result.put(ch, result.get(ch) == null ? count : result.get(ch) + count);
        }
        return result;

        /*Map<String, Integer> num = new HashMap<String, Integer>();
        List<String> lo = new ArrayList<>();
        for (String s : collection1) {
            if (s.length() > 1) {
                lo.add(s);
            }
        }
        ArrayList<String> co=new ArrayList<>(collection1);
        co.removeAll(lo);
        co.addAll(lo);
        int i=0;
        while (i<co.size()){
            String key = co.get(i);
            if (key.length()==1) {
                int finalI = i;
                num.put(key, co.stream().filter(elem -> co.get(finalI) == elem).collect(Collectors.toList()).size());
                i += num.get(key);
            }else {
                String str="";
                for(int n=0;n<key.length();n++){
                    if(key.charAt(n)>=48 && key.charAt(n)<=57){
                        str+=key.charAt(n);
                    }
                }if (num.containsKey(String.valueOf(key.charAt(0)))){
                    num.replace(String.valueOf(key.charAt(0)),num.get(String.valueOf(key.charAt(0))),Integer.parseInt(str)+num.get(String.valueOf(key.charAt(0))));
                }else {
                    num.put(String.valueOf(key.charAt(0)),Integer.parseInt(str));
                }
                ++i;
            }
        }
        return num;*/
    }
}
