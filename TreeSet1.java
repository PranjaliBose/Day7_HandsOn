import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

public class TreeSet1 
{

	public static void main(String[] args)
	{
		TreeSet<String> t=new TreeSet<>();
		
		t.add("Riya");
		t.add("Sneha");
		t.add("Anil");
		t.add("Vijay");
		
		Iterator<String> i=t.iterator();
		String s="Sneha";
		boolean res=false;
		
		while(i.hasNext())
		{
			if(i.next().equals(s))
			{
				res=true;
				break;
			}
		}
		TreeSet<String> reverse=(TreeSet<String>)t.descendingSet();
		System.out.println("Reverse order : "+reverse);
		if(res) 
			System.out.println(s+" is present in the list");
		else
			System.out.println(s+" is not present in the list ");
			

	}

}
