package password;

import java.awt.Color;
import java.util.HashMap;

import password.Definitions.Shapes;

public class Controller
{
	private static GuiDesign gui;
	private static Controller controller;
	
	private LogFile log;	
	private int m_passwordProg;
	private Password m_beingBuilt;
	private boolean lastPasswordRight;
	
	private boolean trialStage = true;
	
	private HashMap< String, Password > m_passwords;
	
	
	public static void main()
	{
		System.out.println("Program has launched look up");
		
		//Probs start up the UI
		//TODO Pass the controller over
		controller = new Controller();
		gui = new GuiDesign();
			gui.frame.setVisible(true);
		}
	
	//Constructor 
	public Controller()
	{
		log = new LogFile( "logs.csv" );
		m_passwords = new HashMap< String, Password >();
		lastPasswordRight = false;
	}
	
	//The Start Button was clicked
	public void startClicked( String username )
	{
		Password pass = makeAPassword( username, "bank" );
		
		trials( username, pass );
	}
	
	//Main Program feature
	public void trials( String username, Password pass )
	{
		if( pass.doneTrials == false )
		{
			//TODO show password to user 
		}
		else if( pass.doneLogin == false && Definitions.PASSWORDWRONGATTEMPT < pass.failedLogins)
		{
			//TODO give feedback on false password
		}
		else
		{
			if(pass.system.equalsIgnoreCase("FaceBook"))
			{
				trials( username, makeAPassword( username, "Bank" ) );
			}
			else if(pass.system.equalsIgnoreCase("BanK"))
			{
				trials( username, makeAPassword( username, "email" ) );
			}
			else
			{
				//TODO Clear fields and tell the user to gtfo 
			}
			
		}
		
	}

	
	// Check users Password against Stored password
	// Wipes the password that was built
	// returns result
	public boolean attemptLogin( String username, String system )
	{
		boolean result = m_beingBuilt.equals( m_passwords.get(username+system) ); 
		m_passwordProg = 0;
		m_beingBuilt = null;
		
		Password pass = m_passwords.get(username+system);
		
		if( !pass.doneTrials )
		{
			if( result )
			{
				//TODO end trial and move to next
				pass.doneTrials = true;
				log.recordData( username, "create", "goodLogin", "" );
			}
			else
			{
				//TODO continue Trials
				pass.trialsDone++;
				log.recordData( username, "create", "badLogin", "" );
			}
		}
		else
		{
			if( result )
			{
				//TODO End Login and Continue
				log.recordData( username, "enter", "goodLogin", "" );
				//TODO try the next System
			}
			else
			{
				pass.failedLogins++;
				
				{
					//TODO Tell the User they suck and try the next system 
				}
				
				log.recordData( username, "enter", "badLogin", "" );
			}
		}
		lastPasswordRight = result;
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
	
	// Assign a new random password to this user
	// Return the assigned password
	private Password makeAPassword( String username, String system )
	{
		Password p = new Password();
		p.system = system;
		
		log.recordData( username, "create", "Password", p.toString());
		m_passwords.put( username+system, p );
		return p;
	}
}