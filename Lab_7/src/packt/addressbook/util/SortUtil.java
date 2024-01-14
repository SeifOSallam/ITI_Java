package packt.addressbook.util;

import java.util.*;
import java.util.stream.Collectors;

public class SortUtil<T> {
    public List<T> sortList(List<T> someList) {
        return someList.stream().sorted().collect(Collectors.toList());
    }
}
