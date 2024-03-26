package Assisted_Practice;

import java.util.*;

public class CollectionExample 
{
    public static void main(String[] args) 
    {
        testArrayList();
        testLinkedList();
        testHashSet();
        testTreeSet();
        testHashMap();
        testTreeMap();
    }

    public static void testArrayList() 
    {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        System.out.println("ArrayList:");
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'apple': " + list.contains("apple"));
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println();
    }

    public static void testLinkedList() 
    {
        List<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        System.out.println("LinkedList:");
        System.out.println("Size: " + list.size());
        System.out.println("Contains 'banana': " + list.contains("banana"));
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println();
    }

    public static void testHashSet() 
    {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("HashSet:");
        System.out.println("Size: " + set.size());
        System.out.println("Contains 2: " + set.contains(2));
        System.out.println("Is empty: " + set.isEmpty());
        System.out.println();
    }

    public static void testTreeSet() 
    {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        System.out.println("TreeSet:");
        System.out.println("Size: " + set.size());
        System.out.println("Contains 4: " + set.contains(4));
        System.out.println("Is empty: " + set.isEmpty());
        System.out.println();
    }

    public static void testHashMap() 
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.println("HashMap:");
        System.out.println("Size: " + map.size());
        System.out.println("Contains key 'two': " + map.containsKey("two"));
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println();
    }

    public static void testTreeMap() 
    {
        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.println("TreeMap:");
        System.out.println("Size: " + map.size());
        System.out.println("Contains value 3: " + map.containsValue(3));
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println();
    }
}

