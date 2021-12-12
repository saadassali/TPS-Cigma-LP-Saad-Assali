package ma.education.tp5.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
//		set1.forEach(i-> System.out.println(i));

		Set<Client> set2 = new HashSet<Client>();
			set2.add(new Client(1,"ALAMI"));
			set2.add(new Client(1,"ALAMI"));
			set2.add(new Client(2,"SOUHAIL"));
	//		set2.forEach(i-> System.out.println(i));
			

			Set<Integer> set3 = new TreeSet<Integer>();
				set3.add(22);
				set3.add(202);

				set3.add(11);
				set3.add(15);
				set3.add(230);
				//set3.forEach(i-> System.out.println(i));
				Comparator<Client> c = new CodeComparator();
/*
				Set<Client> set4 = new TreeSet<Client>(c).addAll(Arrays.asList(
								new Client(2,"ALAMI")
								,new Client(1,"ALAMI")
								,new Client(2,"SOUHAIL")
								,new Client(5,"Ayman")));
						
				set4.add(new Client(2,"ALAMI"));
				set4.add(new Client(1,"ALAMI"));
				set4.add(new Client(2,"SOUHAIL"));
				set4.add(new Client(5,"Ayman"));
				set4.add(new Client(2,"Mouha"));
				set4.forEach(i-> System.out.println(i));
				
				
			
			*/
				
				Set<Client> set4 = new TreeSet<Client>(c);
				
				
				set4.addAll(Arrays.asList(	new Client(2,"ALAMI")
						,new Client(1,"ALAMI")
						,new Client(2,"SOUHAIL")
						,new Client(5,"Ayman")
						));
				
				set4.stream().filter(i->i.code<5)
				.forEach(i-> System.out.println(i));

	}

}
