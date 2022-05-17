package colec;

import java.util.*;

public class Colec {

	public static void main (String args[]) {
		
		Map<String, Integer> items = new HashMap<>();
		
		//Populating the Map
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
                items.put("Z", 60);
                items.put("M", 60);
                items.put("M", 360);
                items.put("PEPE", 260);
                
		//Using an Iterator (previous to Java 8)
		System.out.println("Iterating a Map using an iterator:");
		
		Set<Map.Entry<String,Integer>>      set  = items.entrySet();
		Iterator<Map.Entry<String,Integer>> iter = set.iterator();
		
		while (iter.hasNext()) {
			Map.Entry<String,Integer> entry = iter.next();
			String  key                     = entry.getKey();
			Integer value                   = entry.getValue();
			System.out.println("[ Key: "+key+" ] [ Value: "+value+" ]");
		}
		
               
                
		//Getting the set of keys
		Set<String>  keys  = items.keySet();
		
		//Looping the set
		for (String key: keys) {
                                System.out.println("LLave"  + "accedo get(" + key + ")");
				Integer value = items.get(key);
				System.out.println("[ Key: "+key+" ] [ Value: "+value+" ]");
		}
		          System.out.println("==================");
                Integer value1 = items.get("PEPE");
                int value_new = value1 + 100;
                items.put("PEPE", value_new);
                
                for (String key: keys) {
                                System.out.println("LLave"  + "accedo get(" + key + ")");
				Integer value = items.get(key);
				System.out.println("[ Key: "+key+" ] [ Value: "+value+" ]");
		}
                
                //System.out.println(items.get("PEPE"));
		System.exit(0); //para el programa
                
                
                
		//Using for loop
		System.out.println("Iterating a Map using a foreach loop:");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("[ Key: " + entry.getKey() + " ][ Value: " + entry.getValue()+" ]");
		}
		
		
		//Lambda expressions and passive iterators (since Java 8)
		
		//Output using a consumer
		System.out.println("Iterating a Map using lambda expressions, passive iterators and a simple action:");
		items.forEach((k,v)->System.out.println("[ Key: " + k + " ][ Value: " + v+" ]"));
		
		//Block of code
		System.out.println("Iterating a Map using lambda expressions, passive iterators and a block of code:");
		items.forEach((k,v)->{
			System.out.println("[ Key: " + k + " ][ Value : " + v+" ]");
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});

            }
}
