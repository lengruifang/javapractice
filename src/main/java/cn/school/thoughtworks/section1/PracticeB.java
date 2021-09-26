package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> strings=new ArrayList<>();
        for (List<String> childCollection : collection2) {
            for (String string : childCollection) {
                strings.add(string);
            }
        }
        return collection1.stream().filter(elem->strings.contains(elem)).collect(Collectors.toList());
    }
}
