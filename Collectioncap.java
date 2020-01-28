package ctsdemo;
import java.util.*;
public class Collectioncap {
	public static void main(String args[])
	{
	 ArrayList<String> list1 = new ArrayList<>(4);
     
	 list1.add("Ganesh");
		list1.add("Ananth");
		list1.add("naveen");
		list1.add("pavan");
		list1.add("mahendra");
		System.out.println(list1);
		list1.ensureCapacity(10);
		list1.add("narsimha");
		System.out.println(list1);
	}
}


