import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Country1
{
	TreeSet<String> T1=new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName)
	{
		T1.add(CountryName);
		return T1;
		
	}
	public String getCountry(String CountryName)
	{
		Iterator<String> i=T1.iterator();
		
		while(i.hasNext())
		{
			if(i.next().equals(CountryName))
			{
				return CountryName;
			}
		}
	
	
	
	return null;
}
}

