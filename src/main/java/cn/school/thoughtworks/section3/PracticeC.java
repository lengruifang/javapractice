package cn.school.thoughtworks.section3;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String, Integer> result = new HashMap<>();
        for (String charItemStr : collectionA) {
            CharItem charItemObj = CharItem.createChByStr(charItemStr);
            String ch = charItemObj.getCh();
            Integer count = charItemObj.getCount();
            result.put(ch, result.get(ch) == null ? count : result.get(ch) + count);
        }
        String value="";
        for (String k: object.keySet()) {
            value+=object.get(k);
        }
        for (int a=0;a<value.length();a++){
            String j=String.valueOf(value.charAt(a));
            if (result.containsKey(j)){
                result.replace(j,result.get(j), (int) (result.get(j)-Math.floor(result.get(j)/3)));
            }
        }
        return result;

/*        Map<String, Integer> num = new HashMap<String, Integer>();
        List<String> lo = new ArrayList<>();
        for (String s : collectionA) {
            if (s.length() > 1) {
                lo.add(s);
            }
        }
        ArrayList<String> co=new ArrayList<>(collectionA);
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
        String value="";
        for (String k: object.keySet()) {
            value+=object.get(k);
        }
        for (int a=0;a<value.length();a++){
            String j=String.valueOf(value.charAt(a));
            if (num.containsKey(j)){
                num.replace(j,num.get(j), (int) (num.get(j)-Math.floor(num.get(j)/3)));
            }
        }
        return num;*/
    }
}
