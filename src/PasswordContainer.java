import java.util.HashMap;

public class PasswordContainer {
	
	HashMap< String, Password > m_data;
	
	public PasswordContainer()
	{
		m_data = new HashMap< String, Password >();
	}	
	
	public boolean checkPassword( String username, String pass )
	{
		return false;
	}
	
	public String generatePassword( String username )
	{
		
		return "";
	}
	
	public String getPassword( String username )
	{
		return "";
	}
	
}
