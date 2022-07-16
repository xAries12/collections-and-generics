import java.util.HashSet;
import java.util.*;

public class CollectionsEx4 {
public static void main(String[] args) {
	HashSet<String> listofppls = new HashSet<>(Set.of("Andrei","Ioana","Matei","Ionut"));
	for(String ppl:listofppls)
	{
		System.out.println(ppl);
	}
	System.out.println("\n***Iterator***\n");
	Iterator<String> iterator = listofppls.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
}
}
