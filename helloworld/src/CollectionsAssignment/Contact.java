package CollectionsAssignment;

enum Gender
{
	Male,Female,NA;
}
public class Contact implements Comparable<Contact> {
	private long phoneno;
	private String name;
	private String email;
	private Gender gender;
	
	public Contact(long phoneno, String name, String email, Gender gender) {
		this.phoneno = phoneno;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Contact name:"+name+" Phone no:"+phoneno+" email:"+email;
	}
	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return Long.compare(o.getPhoneno(),this.getPhoneno());
	}
	
}
