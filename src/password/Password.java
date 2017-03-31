package password;
import java.awt.Color;
import java.util.Random;

import password.Definitions.*;

public class Password {

	public int    m_pieceXCord[];
	public int    m_pieceYCord[];
	public Color  m_colors[];
	public Shapes m_shape;

	public boolean doneTrials = false;
	public boolean doneLogin = false;
	public String system;
	public int failedLogins = 0;
	public int trialsDone = 0;

	// Constructor
	public Password()
	{
		m_pieceXCord = new int[ Definitions.TOTALENTRIES ];
		m_pieceYCord = new int[ Definitions.TOTALENTRIES ];
		m_colors = new Color[ Definitions.TOTALENTRIES ];
	}

	//Create random values for this password
	public int randomizePassword()
	{
		Random random = new Random();

		int s = random.nextInt( Definitions.TOTALSHAPES );
		int j = 0 ;
		for( Shapes a : Shapes.values())
		{
			if( 1 == s )
				m_shape = a;
			j++;
		}

		for( int i=0 ; i < Definitions.TOTALENTRIES; ++i )
		{
			boolean loop = false;
			do{
				loop = false;
				m_pieceXCord[i] = random.nextInt( Definitions.TOTALXCORD );
				m_pieceYCord[i] = random.nextInt( Definitions.TOTALYCORD );

				for(int h=i; h >0; ++h)
					if( m_pieceXCord[i] == m_pieceXCord[h] && m_pieceYCord[i] == m_pieceYCord[h] )
						loop = true;
			} while( loop );
			m_colors[i] = Definitions.colors[ random.nextInt( Definitions.TOTALCOLORS ) ];
		}

		boolean loop = true;




		return 1;
	}

	// Check to See if this password equals another
	// This is not entry order dependent 
	public boolean equals( Password pas )
	{
		if( pas == null) 
			return false;
		int check = 0;
		for(int i=0; i < Definitions.TOTALENTRIES; i++)
		{
			for(int j=0; j < Definitions.TOTALENTRIES; ++j)
			{
				if( m_pieceXCord[i] == pas.m_pieceXCord[j] && 
						m_pieceYCord[i] == pas.m_pieceYCord[j] && 
						m_colors[i] == pas.m_colors[j])
				{
					check++;
					break;
				}
			}
		}
		if( check == Definitions.TOTALENTRIES && m_shape == pas.m_shape )
			return true;

		return false;
	}

	//Stringify the password
	public String toString()
	{
		String out = "";
		for( int i=0; i < Definitions.TOTALENTRIES; ++i )
		{
			out += m_colors[i].toString() + "( ";
			out += m_pieceXCord[i] + ", ";
			out += m_pieceYCord[i] + ") | ";
		}
		return out;
	}
}
