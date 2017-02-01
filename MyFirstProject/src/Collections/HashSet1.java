package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
        Set<GeneralInfo>getinfo = new HashSet<>();
			GeneralInfo a1 = new GeneralInfo("John", "San Jose");
			GeneralInfo a2 = new GeneralInfo("Mike", "Fremont");
			GeneralInfo a3 = new GeneralInfo("Albert", "Milpitas");
			GeneralInfo a4 = new GeneralInfo("John", "San Jose");
			getinfo.add(a1);
			getinfo.add(a2);
			getinfo.add(a3);
			getinfo.add(a4);
			//Collections.sort(getinfo);[It doesn't work in Set.Hashset uses hashmap.]

	

		for(GeneralInfo g : getinfo ){
			System.out.println(g);
		}
		
	}
}
