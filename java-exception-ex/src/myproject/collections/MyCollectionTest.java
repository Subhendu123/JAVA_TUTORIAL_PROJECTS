package myproject.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class MyCollectionTest{
	
	public static void main(String rgs[]) {
		ArrayList<User> userList = new ArrayList<User>();
		User firstUser = generateUser("subhendu",25);
		userList.add(firstUser);
		userList.add(generateUser("pqr",26));
		userList.add(generateUser("abc", 24));
		printCollections(userList);

		LinkedList<User> userLinkedList = new LinkedList<User>();
		userLinkedList.add(generateUser("Subhendu", 25));
		userLinkedList.add(generateUser("Subhendu", 25));
		userLinkedList.add(generateUser("last", 20));
		userLinkedList.addFirst(generateUser("FirstUSER", 35));
		userLinkedList.addLast(generateUser("LASTUSER", 15));
		printCollections(userLinkedList);
		
		List<User> vectorList = new Vector<User>();
		Iterator<User> userIt = userList.iterator();
		while(userIt.hasNext())
		vectorList.add(userIt.next());
		vectorList.add(generateUser("RS",29));
		printCollections(vectorList);
		
		//Vector<User> v = (Vector<User>) userList.clone(); - will give class cast exception
		
	}
	
	public static void printCollections(List<User> userList) {
		System.out.println();
		System.out.println("************************* Printing for the new list sent***********************");
		Iterator<User> userIt = userList.iterator();
		while(userIt.hasNext()) {
			User u = userIt.next();
			System.out.println(u.getEmailId() + " for the mobile no "+u.getMobileNumber());
		}
	}
	
	public static User generateUser(String name, int age) {
		User user = new User();
		user.setAge(age);
		user.setName(name);
		user.setId(String.valueOf(new Random()) != null && String.valueOf(new Random()).length() > 1 ? String.valueOf(new Random()).substring(0,2) : age+"");
		user.setDomain("INTL.BNS");
		user.setEmailId(name+"@"+user.getDomain());
		Long number = Long.valueOf("90385554".concat(String.valueOf(age)));
		user.setMobileNumber(number);
		
		if(user.isEmptyUser(user))
			return null;
		return user;
	}
	
	public static Profile createProfile(String profileName , String userID) {
		Profile profile = new Profile();
		profile.setActiveYears(2);
		profile.setName(profileName);
		profile.setUserID(userID);
		profile.setProfileId(profileName+"_"+userID);
		
		return profile;
	}

}
