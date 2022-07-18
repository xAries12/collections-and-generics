import java.util.Collection;
import java.util.Collections;

public class GenericsEx2 {
public static <T> int  CountIf(Collection<T> list, Strategy<T> strategy) {
	int count=0;
	for(T elem: list)
		{
		if(strategy.test(elem))
			{
			++count;
			}
		}
	return count;
}
}


