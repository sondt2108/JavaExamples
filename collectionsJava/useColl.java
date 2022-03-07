package collectionsJava;

import java.util.*;

public class useColl {
    public static void main(String[] args) {
        List lnkLst = new LinkedList();
        lnkLst.add("element1");
        lnkLst.add("element2");
        lnkLst.add("element3");
        lnkLst.add("element4");
        String linkedList = "LinkedList";
        displayAll(lnkLst, linkedList);

        List aryLst = new ArrayList();
        aryLst.add("x");
        aryLst.add("y");
        aryLst.add("z");
        aryLst.add("w");
        String arrList = "Array list";
        displayAll(aryLst, arrList);

        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        String hshSet = "HashSet";
        displayAll(hashSet, hshSet);

        SortedSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        String trSet = "TreeSet";
        displayAll(treeSet, trSet);

        LinkedHashSet lnkHashset = new LinkedHashSet();
        lnkHashset.add("one");
        lnkHashset.add("two");
        lnkHashset.add("three");
        lnkHashset.add("four");
        String linkedHashSet = "LinkedHashSet";
        displayAll(lnkHashset, linkedHashSet);

        Map map1 = new HashMap();
        map1.put("key1", "J");
        map1.put("key2", "K");
        map1.put("key3", "L");
        map1.put("key4", "M");
        String hshMap = "HashMap";
        displayAll(map1.keySet(), hshMap);
        displayAll(map1.values(), hshMap);

        SortedMap map2 = new TreeMap();
        map2.put("key1", "JJ");
        map2.put("key2", "KK");
        map2.put("key3", "LL");
        map2.put("key4", "MM");
        String treeMap = "TreeMap";
        displayAll(map2.keySet(), treeMap);
        displayAll(map2.values(), treeMap);

        LinkedHashMap map3 = new LinkedHashMap();
        map3.put("key1", "JJJ");
        map3.put("key2", "KKK");
        map3.put("key3", "LLL");
        map3.put("key4", "MMM");
        String linkedHashMap = "LinkedHashMap";
        displayAll(map3.keySet(), linkedHashMap);
        displayAll(map3.values(), linkedHashMap);
    }

    static void displayAll(Collection col, String note) {
        Iterator itr = col.iterator();
        System.out.println(note + ":");
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }
        System.out.println("\n");
    }
}
