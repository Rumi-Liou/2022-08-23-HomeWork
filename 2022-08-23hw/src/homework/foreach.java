package homework;

import java.util.HashMap;
import java.util.Map;

public class foreach {
	  public static void main(String[] args) {
		  Map<String, String> capitalMap=new HashMap<>();
		  capitalMap.put("USA","Washington");
	        capitalMap.put("Japan","Tokyo");
	        capitalMap.put("Thailand","Bangkok");
	        capitalMap.put("UK","London");
	        capitalMap.put("Australia","Canberra");
	        capitalMap.put("Denmark","Copenhagen");
	        capitalMap.put("Egypt","Cairo");
	        capitalMap.put("Vietnam","Hanoi");
	        capitalMap.put("Italy","Rome");
	        capitalMap.put("Brazil","Brazilia");
	        for (String key: capitalMap.keySet()){  
				System.out.println(key+ " :" + capitalMap.get(key));
			} 
	  }
}
