import java.util.ArrayList;
import java.util.List;


class MyArrayList<E> extends ArrayList<E> 
{
	
	public boolean add(E e) 
	{
		if (e instanceof Integer || e instanceof Float || e instanceof Double) 
		{
			super.add(e);
			return true;
		} 
		else 
		{
			throw new ClassCastException("Nothing except Integer, Float and Double are allowed. Any other data type not allowed. ");
		}
	}
}

public class ArrayList2 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try 
		{
			list.add(113);
			list.add(4.5F);
			list.add(5.8767D);
			list.add("Pranjali");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		System.out.println(list);

	}

}