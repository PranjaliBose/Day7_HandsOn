
public class HashSet1 {

	public static void main(String[] args) 
	{
		Country countries=new Country();
		countries.saveCountryNames("USA");
		countries.saveCountryNames("London");
		countries.saveCountryNames("Brazil");
		countries.saveCountryNames("Italy");
		countries.saveCountryNames("France");
		
		System.out.println("France : "+countries.getCountry("France"));
		System.out.println("Argentina : "+countries.getCountry("Argentina"));
		

	}

}
