import java.util.HashMap;
import java.util.Map;

public class j2 {
	public static void main(String[] args) {
		Map< Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		hashMap.clear();
		System.out.println("After removing All elements size : "+hashMap.size());
		hashMap.put(1,"Apple");
		hashMap.put(2,"Strawberry");
		hashMap.put(3,"Pear");
		hashMap.put(4,"Cucumber");
		hashMap.put(5,"Grapes");
		System.out.println("After Adding All elements size : "+hashMap.size());
	}

}