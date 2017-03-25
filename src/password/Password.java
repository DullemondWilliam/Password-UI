package password;
import java.awt.Color;
import java.util.Random;

import password.Definitions.*;

public class Password {

    public int    m_pieceXCord[];
	public int    m_pieceYCord[];
	public Color  m_colors[];
	public Shapes m_shape;
	
	
	public Password()
	{
	    m_pieceXCord = new int[ Definitions.TOTALENTRIES ];
		m_pieceYCord = new int[ Definitions.TOTALENTRIES ];
		m_colors = new Color[ Definitions.TOTALENTRIES ];
	}
	
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
			m_pieceXCord[i] = random.nextInt( Definitions.TOTALXCORD );
			m_pieceYCord[i] = random.nextInt( Definitions.TOTALYCORD );
		    m_colors[i] = Definitions.colors[ random.nextInt( Definitions.TOTALCOLORS ) ];
		}
		return 1;
	}
	
	public boolean matchPassword( Password pas )
	{
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
}
 