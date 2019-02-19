package myproject.collections;

public class Profile implements Comparable<Profile>{

	private String name;
	private String userID;
	private String profileId;
	private int activeYears;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public int getActiveYears() {
		return activeYears;
	}
	public void setActiveYears(int activeYears) {
		this.activeYears = activeYears;
	}
	@Override
	public int compareTo(Profile o) {
		// TODO Auto-generated method stub
		return 1;
	}
	
	
}
