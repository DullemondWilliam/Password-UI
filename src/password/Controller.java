package password;

import java.awt.Color;
import java.util.HashMap;

import password.Definitions.Shapes;

public class Controller
{
	private LogFile log;
	
	private int m_passwordProg;
	private Password m_beingBuilt;
	
	private HashMap< String, Password > m_passwords;
	
	
	//Constructor 
	public Controller()
	{
		log = new LogFile( "logs.csv" );
		m_passwords = new HashMap< String, Password >();
	}
	
	// Assign a new random password to this user
	// Return the assigned password
	public Password makeAPassword( String username )
	{
		Password p = new Password();
		log.recordData( username, "create", "Password", p.toString());
		
		m_passwords.put( username, p );
		return p;
	}
	
	// Return a Given users Password
	public Password getPassword( String username )
	{
		return m_passwords.get( username );
	}
	
	// Check users Password against Stored password
	// Wipes the password that was built
	// returns result
	public boolean attemptLogin( String username )
	{
		boolean result = m_beingBuilt.equals( m_passwords.get(username) ); 
		m_passwordProg = 0;
		m_beingBuilt = null;
		
		if( result )
			log.recordData( username, "enter", "goodLogin", "" );
		else
			log.recordData( username, "enter", "badLogin", "" );
		
		return result;
	}
	
	// Build a login password attempt add the info as it comes in
	// Returns number of Entries made
	public int userEnterPassword( String username, Shapes s, Color c, int x, int y )
	{
		if( m_passwordProg == Definitions.TOTALENTRIES )
			return -1;
		
		if( m_beingBuilt == null )
		{
			m_passwordProg = 0;
			m_beingBuilt = new Password();
			log.recordData( username, "enter", "start", "");
		}
		
		m_beingBuilt.m_shape = s;
		m_beingBuilt.m_colors[ m_passwordProg ] = c;		
		m_beingBuilt.m_pieceXCord[ m_passwordProg ] = x;
		m_beingBuilt.m_pieceYCord[ m_passwordProg ] = y;
		
		return ++m_passwordProg;
	}
}