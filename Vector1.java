import java.util.Vector;
public class Vector1 
{

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<>(12);
		v.add("January");
		v.add("February");
		v.add("March");
		v.add("April");
		v.add("May");
		v.add("June");
		v.add("July");
		v.add("August");
		v.add("September");
		v.add("October");
		v.add("November");
		v.add("December");
		
		System.out.println("Months are :");
		for(String s:v)
		{
			System.out.println(s);
		}
		
	}

}
