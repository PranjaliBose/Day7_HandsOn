public class TreeSet2 
{

	public static void main(String[] args) 
	{
		Country1 countries=new Country1();
		countries.saveCountryNames("USA");
		countries.saveCountryNames("London");
		countries.saveCountryNames("Brazil");
		countries.saveCountryNames("Italy");
		countries.saveCountryNames("France");
		
		System.out.println("France : "+countries.getCountry("France"));
		System.out.println("Argentina : "+countries.getCountry("Argentina"));
		

	}

}
