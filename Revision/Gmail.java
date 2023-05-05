//Explain Encapsulation with the help of any of the object

package Revision;

public class Gmail 
{
	String username;
	private String password;
	private String location;
	
	Gmail(){}	
	

	
	public Gmail(String username, String password, String location) {
		super();
		this.username = username;
		this.password = password;
		this.location = location;
	}



	public String getLocation()
	{
		return location;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	

}
