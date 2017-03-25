import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Password {

	public static int TOTALCOLORS  = 10;
	public static int TOTALSHAPES  = 2;
	public static int TOTALXCORD   = 5;
	public static int TOTALYCORD   = 5;
    public static int TOTALENTRIES = 3;
	
	public static Color color[] = { 
			Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
			Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
			Color.PINK, Color.RED, Color.WHITE, Color.YELLOW 
	};
	
	public static int IMG_WIDTH  = 50;
	public static int IMG_HEIGHT = 50;
    
    public int   m_pieceXCord[];
	public int   m_pieceYCord[];
	public BufferedImage m_shape[];
	
	
	public Password()
	{
	    m_pieceXCord = new int[ TOTALSHAPES ];
		m_pieceYCord = new int[ TOTALSHAPES ];
		m_shape = new BufferedImage[ TOTALSHAPES ];
		

	}
	
	public int randomizePassword()
	{
		Random random = new Random();
		
		int shape = random.nextInt( TOTALSHAPES );
		for( int i=0; i < TOTALENTRIES; ++i )
		{
			m_pieceXCord[i] = random.nextInt( TOTALXCORD );
			m_pieceYCord[i] = random.nextInt( TOTALYCORD );
			m_shape[i] = makeAShape( shape, random.nextInt( TOTALYCORD ) );
		}
		return 1;
	}
	
	
	public BufferedImage makeAShape( int shapeNum, int colorNum )
	{
		BufferedImage shape = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = shape.createGraphics();
		g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );
		g2.setColor( color[colorNum] );
	
		if( shapeNum == 0 )
		{
		      g2.fillOval( 4, 4, IMG_WIDTH, IMG_HEIGHT );
		}
		else if( shapeNum == 1 )
		{
			 g2.fillRect( 4, 4, IMG_WIDTH, IMG_HEIGHT);
		}
		g2.dispose();
		return shape;
	}
}
 