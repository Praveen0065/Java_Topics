package session_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Part1 {

	/*
	 
	 ==============
	 Map
	 ===========
	 -> Map is an interface available in java.util.package
	 -> Map is used to store the data in key-value format
	 -> One key value pair is called as one Entry
	 -> One Map can object can have multiple entries
	 -> In Map keys should be unique and values is duplicates 
	 -> If we try to store duplicates key in map then it will replace old key data with new key data
	 -> We can take Key value as any type of data
	  
	  Ex:- 1 ( Map <Integer,String> )
	  ------
	  101 - John
	  102 - Smith
	  103 - David
	  104 - Robert
	  105 - ORlen 
	  101 - Charles
	  
	   Ex:- 2 ( Map <String,Integer> )
	  -------
	  india -120
	  USA - 30;
	  UA - 40
	    
	 
	 
	 ---> Map Interface having several implementation classes
	 1) HashMap
	 2) LinkedHashMap
	 3) TreeMap
	 4) HashTable
	 5) IdentityHashMap
	 6) WeakHashMap
	 
	 ===========
	 Map Methods
	 ===========
	 put(k,v) -> To store one entry in map object
	 get(k) -> To get value based on key
	 remove(k) -> To remove one entry based on key
	 containsKey(k) -> To check presence of entry based on key
	 keySet() -> To get all keys of the map
	 entrySet() -> To get all entries
	 clear() -> To remove all the entries of map
	 isEmpty() -> To check weather map obj is empty or not
	 size -> To get size of the map (how many entries available)
	 
	 
	 */
	
    public static void main(String[] args) {
		
    	Map<Integer, String> map = new HashMap<>();
    	
    	map.put(101, "John");
    	map.put(102, "Smith");
    	map.put(103, "Orlen");
    	map.put(102, "David");
    	
    	System.out.println("Map Size  : " + map.size());
    	
    	System.out.println(map.get(102));
    	
    	
    	Collection<String> values = map.values();
    	for(String v : values) {
    		System.out.println(v); // get only values
    	}
    	
    	Set<Integer> keyset =map.keySet();
    	for(Integer key : keyset ) {
    		System.out.println(key); // get only keys
    		System.out.println(key + "--"+map.get(key)); 
    	}
    	
    	Set<Entry<Integer,String>> entryset = map.entrySet();
    	/*Iterator <Entry<Integer,String>> iterator = entryset.iterator();
    	while(iterator.hasNext()) {
    		Entry<Integer,String> entry =iterator.next();
    		System.out.println(entry.getKey()+"---"+entry.getValue());
    	}*/
    	
    	
    	for(Entry<Integer, String> entry : entryset){
    		System.out.println(entry.getKey()+"---"+entry.getValue());
    	}
    	
    	
    	System.out.println(map.containsKey(102));
    	System.out.println(map.containsKey(120));
    	System.out.println(map.isEmpty());
    	
    	System.out.println(map);
    	
    	map.clear();
    	System.out.println(map.size());
	}
	
	
	
	
	
}
