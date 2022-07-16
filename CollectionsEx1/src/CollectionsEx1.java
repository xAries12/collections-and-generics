import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionsEx1 {
	public static void main(String[] args) {
			Random rand = new Random();
			Set<Integer> set = new HashSet<>();
			while(set.size()<10)
			{
				set.add(rand.nextInt(19)+1);
			}
			System.out.println(set);
		}
}
