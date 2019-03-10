package myproject.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CollectionOfCollections {

	public static void main(String[] args) {
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("A");
		userList.add("B");
		userList.add("C");
		
		Set setList = new TreeSet<String>();
		setList.add("A SET");
		
		System.out.println(Collections.addAll(userList));
		System.out.println(Collections.addAll(setList));
		System.out.println();
	}

}
