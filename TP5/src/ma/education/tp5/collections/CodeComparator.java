package ma.education.tp5.collections;

import java.util.Comparator;

public class CodeComparator implements Comparator<Client> {

	@Override
	public int compare(Client o1, Client o2) {
	Client c1=(Client)o1;
	Client c2=(Client)o2;
		
		return c1.code-c2.code;
		
	}

}
