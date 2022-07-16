import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionsEx2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String text= scanner.nextLine();
	dublicate(text);
	}
	public static void dublicate(String text) {
		HashMap<String, Integer> character = new HashMap<>();
		for(int i=0;i<text.length();i++)
		{
			if(character.get(text.substring(i, i+1))==null) 
				character.put(text.substring(i, i+1),0);
			int ap=character.get(text.substring(i, i+1));
			character.put(text.substring(i, i+1), ap+1);
		}
		String allchr="";
		String allchrdub="";
		for (Map.Entry<String, Integer> entry : character.entrySet())
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            allchr=allchr+entry.getKey();
            
			if(entry.getValue()>1) 
				allchrdub=allchrdub+entry.getKey()+"="+(entry.getValue()-1)+"\n";
			
		}
		System.out.println(allchr);
		System.out.println(allchrdub);
	}
}
