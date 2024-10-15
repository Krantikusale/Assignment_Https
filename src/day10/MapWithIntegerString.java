package day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithIntegerString {

	public static void main(String[] args) {
		Map<String,Object> s1=new HashMap<>();
		s1.put("name","kk");
		s1.put("status", false);
		s1.put("phone_no",424354666);
		
		
		Map<String,Object> s2=new HashMap<>();
		s2.put("name","kp");
		s2.put("status", true);
		s2.put("phone_no",424354689);
		
		Map<Integer,Map<String,Object>> a1=new HashMap<>();
		a1.put(1, s1);
		a1.put(2, s2);
		
		System.out.println(a1.get(1).get("phone_no"));
		List<String> l = Arrays.asList("aa","bdd","asa","asdad");
		System.out.println(l);
		System.out.println(l.remove(1));
		System.out.println(l);
	}

}
