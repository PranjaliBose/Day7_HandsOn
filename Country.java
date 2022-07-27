import java.util.HashSet;
import java.util.Iterator;

public class Country
{
	HashSet<String> H1=new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName)
	{
		H1.add(CountryName);
		return H1;
		
	}
	public String getCountry(String CountryName)
	{
		Iterator<String> i=H1.iterator();
		
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

