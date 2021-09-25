package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> strings=new ArrayList<>();
        for (List<String> s1 : collection2) {
            for (String s2 : s1) {
                strings.add(s2);
            }
        }
        return collection1.stream().filter(elem->strings.contains(elem)).collect(Collectors.toList());
    }
}
