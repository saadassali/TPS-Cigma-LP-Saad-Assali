package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(12);
		list1.add(23);
		list1.add(23);
		list1.add(12);
	
	list1.forEach(i-> System.out.println(" element "+i));
	
	List<Integer> list2= Arrays.asList(1,5,6,9,16);
	list2.stream().map(i->i*i).filter(i->i>37).forEach(i->
	System.out.println(i));

	}
}
