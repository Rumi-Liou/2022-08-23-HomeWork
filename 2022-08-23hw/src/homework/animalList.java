package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class animalList {
	 public static void main(String[] args) {
	        List<Map<String, String>> animalList = List.of(
	                Map.of("habitat","ocean","name", "shark"),
	                Map.of("habitat","land", "name","bear"),
	                Map.of("habitat","land","name", "moose"),
	                Map.of("habitat","swamp","name", "frog"),
	                Map.of("habitat","ocean","name", "jelly fish"),
	                Map.of("habitat","swamp","name", "heron"),
	                Map.of("habitat","ocean", "name","whale")
	        );
	        Map<String,List<String>> printAnimal=new HashMap<String, List<String>>();
	        animalList.forEach(e-> printAnimal.computeIfAbsent(e.get("hibertat"), f->new ArrayList<>()));
	        animalList.forEach(e->printAnimal.get(e.get("hibertat")).add(e.get("name")));
	        printAnimal.forEach((f,v)-> {
	            System.out.println(f+ " : " + v.toString().replaceAll("\\[|\\]",""));
	        });
	        }
}
