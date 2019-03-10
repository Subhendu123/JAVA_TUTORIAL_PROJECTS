package myproject.collections;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import static myproject.collections.MyCollectionTest.*;

public class SetTest {

	public static void main(String[] args) {
		HashSet<User> hashSet = new HashSet<User>();
		Date beforeAdd = new Date();
		hashSet.add(MyCollectionTest.generateUser("SDAS",25));
		hashSet.add(MyCollectionTest.generateUser("SP",12));
		hashSet.add(MyCollectionTest.generateUser("PK",10));
		hashSet.add(MyCollectionTest.generateUser("SKW",50));
		System.out.println(new Date().getSeconds()-beforeAdd.getSeconds());
		
		Iterator<User> itr = hashSet.iterator();
		while(itr.hasNext()) {
			User output = itr.next();
			System.out.println(output.getEmailId()+ " : " + output.hashCode());
		}
		
		TreeSet<User> TreeSet = new TreeSet<User>();
		//TreeSet.addAll(hashSet);
		System.out.println("TreeSet is created. Curently inseerting into the same");
		TreeSet.add(generateUser("SDAS",25));
		System.out.println("First Element SDAS Added");
		TreeSet.add(generateUser("SP",12));
		System.out.println("Second Element SP");
		TreeSet.add(generateUser("PK",10));
		System.out.println("PK added");
		TreeSet.add(generateUser("SKW",50));
		System.out.println("SKW Added");
		//TreeSet.add(createProfile("PROFILENEW",TreeSet.first().getId()));
		
		
		 itr = TreeSet.iterator();
		System.out.println("TREE SET .................");
		while(itr.hasNext()) {
			User output = itr.next();
			System.out.println(output.getEmailId()+ " : " + output.hashCode());
		}
		
		
	}

}
