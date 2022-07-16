import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionsEx6 {
public static void main(String[] args) {
	HashMap<String, Integer> hashmap=new HashMap<>();
	hashmap.put("Andrei", 9);
	hashmap.put("Matei", 7);
	hashmap.put("Ioana", 8);
	hashmap.put("Ionut", 10);
	Iterator<Entry<String,Integer>> iterate = hashmap.entrySet().iterator();
	while(iterate.hasNext())
	{
		System.out.println(iterate.next());
	}
}
}
