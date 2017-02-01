package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class HashMap1 {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<>();
		map.put("Rachel", 10); //(key,value) 5 pairs here
		map.put("Joey", 10);
		map.put("Ross", 10);
		map.put("Monica", 10);
		map.put("Ross", 8); //It will say already have a key"Ross",so its just update the value to 8.
		System.out.println(map.size());
	    System.out.println(map);
	    
		GeneralInfo g1 = new GeneralInfo("Monica","NYC");
		g1.setAddress("NY");
		GeneralInfo g2 = new GeneralInfo("Chandler","LA");
		g2.setAddress("CA");
		GeneralInfo g3 = new GeneralInfo("Chandler","LA");
		g3.setAddress("NW");
		Map<GeneralInfo,Integer>mapping = new HashMap<>();
		mapping.put(g1, 1);
		mapping.put(g2, 2);
		mapping.put(g3, 3);
		System.out.println(mapping);
		System.out.println(mapping.size());
		
		// one key(GeneralInfo) with multiple values(List of integers)
		Map<GeneralInfo, List<Integer>>addressmaps= new HashMap<>();
		List<Integer>multivalues = new ArrayList<>();
		multivalues.add(11);
		multivalues.add(31);
		addressmaps.put(g1, multivalues); //normal syntax to put key,value
		addressmaps.get(g1).add(21);
		System.out.println(addressmaps);
		
		System.out.println("44444-----------------------------------------");
		//Looping through a collection(on list and set)
		BiConsumer<GeneralInfo, Integer> bc = new BiConsumer<GeneralInfo, Integer>() {

			@Override
			public void accept(GeneralInfo t, Integer u) {
				System.out.println(t);
				System.out.println(u);
			}
		};
		    mapping.forEach(bc);		
			mapping.forEach((t,u) -> {System.out.println(t);System.out.println(u);});
	}

}
