package collectionsJava;

import java.util.*;
import java.io.*;

public class collectionsInJava {
    public static void main(String[] args) {

        // BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        // System.out.println("How many elements you want to add to the array: ");
        // int n = Integer.parseInt(in.readLine());
        // String[] name = new String[n];

        // for(int i = 0; i < n; i++) {
        // name[i] = in.readLine();
        // }
        // List<String> listName = Arrays.asList(name);
        // System.out.println();

        // for(String li: listName) {
        // String str = li;
        // System.out.print(str + " ");
        // }

        //
        System.out.println();
        System.out.println("Array to Collection:");
        String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
        Set set = new TreeSet();

        for (int i = 0; i < coins.length; i++)
            set.add(coins[i]);
        System.out.println(Collections.min(set));
        System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));

        for (int i = 0; i <= 10; i++)
            System.out.print('-');
        System.out.println(Collections.max(set));
        System.out.println(Collections.max(set,
                String.CASE_INSENSITIVE_ORDER));

        //

        List<String> list = new ArrayList<String>();
        list.add("This ");
        list.add("is ");
        list.add("a ");
        list.add("good ");
        list.add("program.");
        String[] itemsArray = new String[list.size()];
        itemsArray = list.toArray(itemsArray);

        for (int i = 0; i < itemsArray.length; ++i) {
            String contents = itemsArray[i];
            System.out.print(contents);
        }

        //
        System.out.println();
        System.out.println("Tree Map Example!\n");
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        tMap.put(1, "Sunday");
        tMap.put(2, "Monday");
        tMap.put(3, "Tuesday");
        tMap.put(4, "Wednesday");
        tMap.put(5, "Thursday");
        tMap.put(6, "Friday");
        tMap.put(7, "Saturday");
        System.out.println("Keys of tree map: " + tMap.keySet());
        System.out.println("Values of tree map: " + tMap.values());
        System.out.println("Key: 5 value: " + tMap.get(5) + "\n");
        System.out.println(
                "First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");
        System.out.println(
                "Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) + "\n");
        System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contain: " + tMap.values() + "\n");
        System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
        System.out.println("Now the tree map Keys: " + tMap.keySet());
        System.out.println("Now the tree map contain: " + tMap.values());

        //
        System.out.println();
        System.out.println("Collection Example:");
        int size;
        Set<String> collection = new HashSet<String>();
        String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.print("Collection data: ");
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        collection.remove(str2);
        System.out.println("After removing [" + str2 + "]\n");
        System.out.print("Now collection data: ");
        iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();
        System.out.println("Collection size: " + size + "\n");

        //
        System.out.println();
        System.out.println("Reversing a Collection");
        List l = new ArrayList();

        for (int i = 0; i < coins.length; i++)
            l.add(coins[i]);
        ListIterator liter = l.listIterator();
        System.out.println("Before reversal");

        while (liter.hasNext())
            System.out.println(liter.next());
        Collections.reverse(l);
        liter = l.listIterator();
        System.out.println("After reversal");
        while (liter.hasNext())
            System.out.println(liter.next());

        //
        System.out.println();
        System.out.println("Collection Shuffle");
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("E");
        obj.add("I");
        obj.add("O");
        obj.add("U");
        Collections.shuffle(obj);
        System.out.println(obj);

        //
        System.out.println();
        System.out.println("Collection size");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        size = collection.size();

        if (collection.isEmpty()) {
            System.out.println("Collection is empty");
        } else {
            System.out.println("Collection size: " + size);
        }
        System.out.println();

        //
        System.out.println();
        System.out.println("Iterate through HashMap");
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("1", "1st");
        hMap.put("2", "2nd");
        hMap.put("3", "3rd");
        Collection cl = hMap.values();
        Iterator itr = cl.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //
        System.out.println();
        System.out.println("Use Collections:");

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

        //
        System.out.println();
        System.out.println("HashTable");
        Hashtable ht = new Hashtable();
        ht.put("1", "One");
        ht.put("2", "Two");
        ht.put("3", "Three");
        Enumeration e = ht.elements();
        Enumeration k = ht.keys();
        // boolean hasMoreElements( )
        // Khi được triển khai, nó phải trả về true trong khi vẫn còn nhiều phần tử để
        // extract, và
        // false khi tất cả phần tử đã được liệt kê
        while (e.hasMoreElements()) {

            // Object nextElement( )
            // Trả về đối tượng kế tiếp trong Enumeration như là một tham chiếu generic
            // Object
            System.out.println(e.nextElement());
        }

        while (k.hasMoreElements()) {
            System.out.println(k.nextElement());
        }

        //
        System.out.println();
        System.out.println("Find min max from a List");

        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        System.out.println("max: " + Collections.max(list));
        System.out.println("min: " + Collections.min(list));

        //
        System.out.println();
        System.out.println("Find sublist in a list");
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("SubList :" + sublist);
        System.out.println(
                "indexOfSubList: " + Collections.indexOfSubList(list, sublist));

        System.out.println(
                "lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));

        // replace an elements in a list
        System.out.println();
        System.out.println("Replace an element in a list:");
        System.out.println("List :" + list);
        Collections.replaceAll(list, "one", "hundread");
        System.out.println("replaceAll: " + list);

        // Rotate elements in a list
        System.out.println();
        System.out.println("Rotate elements in a list:");
        System.out.println("List :" + list);
        Collections.rotate(list, 3);
        System.out.println("rotate: " + list);

        
    }

    
}
