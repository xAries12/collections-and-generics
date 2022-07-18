import java.util.Arrays;
import java.util.Collection;

public class Test {
public static void main(String[] args) {
	Collection<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    int count = GenericsEx2.CountIf(list, new OddNumber());
    System.out.println("Numere impare = " + count);
}
}
