import java.util.Iterator;
import java.util.Vector;

class Iterator2 
{
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Iterator2(int id, String name, String address, Double salary)
	{
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
		
	}
	public int getID()
	{
		return id;
	}
	public String toString()
	{
		
		return "Employee [ID=" + id + ", NAME=" + name + ", ADDRESS=" + address + ", SALARY=" + salary + "]";
	}

	public static void main(String[] args) 
	{
		Vector<Iterator2> v=new Vector<>();
		v.add(new Iterator2(1001, "Riya", "12/A, India", 35000.0));
		v.add(new Iterator2(1002, "Anil", "45/B, India", 40000.0));
		v.add(new Iterator2(1003, "Palak", "43/D, India", 67899.0));
		v.add(new Iterator2(1004, "Rani", "33/9a, India", 20000.0));
		
		Iterator<Iterator2> i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
