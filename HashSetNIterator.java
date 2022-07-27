import java.util.HashSet;
import java.util.Iterator;
public class HashSetNIterator 
{

	public static void main(String[] args) 
	{
		HashSet<String> h=new HashSet<>();
		h.add("Riya");
		h.add("Sneha");
		h.add("Anil");
		h.add("Vijay");
		
		Iterator<String> i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	

	}

}
