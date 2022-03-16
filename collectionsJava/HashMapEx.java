package collectionsJava;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        // Create an empty hash map 
        HashMap<String, Integer> map = new HashMap<>(); 
  
        // Add elements to the map 
        map.put("vishal", 10); 
        map.put("sachin", 30); 
        map.put("vaibhav", 20); 
  
        // Print size and content 
        System.out.println("Size of map is:- "
                           + map.size()); 
        System.out.println(map); 
  
        // Check if a key is present and if 
        // present, print value 
        if (map.containsKey("vishal")) { 
            Integer a = map.get("vishal"); 
            System.out.println("value for key"
                               + " \"vishal\" is:- " + a); 
    }
}
}

/*

void clear(): Xóa tất cả các phần tử trong HashMap
boolean containsKey(Object key): Kiểm tra sự tồn tại của key trong HashMap.
boolean containsValue(Object value): Trả về true nếu một hoặc nhiều khóa có chứa value.
Object clone(): Copy HashMap.
boolean isEmpty(): Trả về true nếu HashMap không chứa bất kỳ cặp key-value nào.
Set entrySet(): Trả về tập Set<Map.Entry> dùng trong duyệt HashMap.
Object get(Object key): Trả về value của key trong HashMap
Set keySet(): Trả về tập key trong HashMap.
int size(): Trả về số lượng phần tử của HashMap.
Object put(Object key, Object value): Thêm cặp giá trị key – value vào HashMap.
putAll(Map M): Thêm một implement của Map vào HashMap như HashMap khác, HashTable etc.
Object remove(Object key): Xóa phần tử trong HashMap.
Collection values(): Trả về tập value trong HashMap.
compute(K key, BiFunction<K, V> remappingFunction): Update value theo key.
computeIfAbsent(K key, Function<K> mappingFunction): Update value nếu  key không tồn tại hoặc value là null.
computeIfPresent(K key, BiFunction<K, V> remappingFunction): Nếu key tồn tại trong HashMap và update value theo remappingFunction. Nếu value null thì apply giá trị mới theoremappingFunction
forEach(BiConsumer<K, V> action): This method Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
getOrDefault(Object key, V defaultValue): Trả về value của phần tử ứng với key được truyền vào. Trả về defaultValue nếu key không tồn tại trong HashMap.
putIfAbsent(K key, V value): Nếu key được chỉ định không chứa trong HashMap hoặc có value null thì sẽ được thay thế bởi giá giá trị value mới và được thêm vào HashMap nếu key không tồn tại.
replace(K key, V value): Thay thế value của key được chỉ định.
replace(K key, V oldValue, V newValue): Thay thế value có giá trị là oldValue của key được chỉ định thành newValue.
replaceAll(BiFunction<K, V> function): Thay thế tất cả các phần tử của HashMap theo BiFunction.
 */
