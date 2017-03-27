package password;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class LogFile 
{
	private static String SITE   = "applet";
	private static String SCHEME = "DaBest"; 

	private String m_fileName;
	
	// Constructor 
	// Takes log filename
	public LogFile( String fileName )
	{
		m_fileName = fileName;
		try
		{
			String header = "\"time\",\"site\",\"user\",\"scheme\","
					      + "\"mode\",\"event\",\"data\"";

			FileWriter writer = new FileWriter( m_fileName );
			writer.write( header );
			writer.flush();
			writer.close();
		}
		catch( IOException e )
		{
			System.out.println( e );
		}
	}
	
	//Write Data to File
	public int recordData( String user, String mode, String event, String data )
	{
		String record = "";
		record += '"' + getTime() + "\",";
		record += '"' + SITE      + "\",";
		record += '"' + user   	  + "\",";
		record += '"' + SCHEME    + "\",";
		record += '"' + mode      + "\",";
		record += '"' + event     + "\",";
		record += '"' + data      + "\",";
		
		try
		{
			FileWriter writer = new FileWriter( m_fileName );
			writer.write( record );
			writer.flush();
			writer.close();
		}
		catch( IOException e )
		{
			System.out.println( e );
			return -1;
		}

		return 1;
	}
	
	//Put current time in desired format
	private String getTime()
	{
		Date date = new Date();
		String time = "";
		time += date.getMonth() + "/";
		time += date.getDate()  + "/";
		time += date.getYear()  + " ";
		
		time += date.getHours()   + ":";
		time += date.getMinutes() + ":";
		time += date.getSeconds();
		
		return time;
	}
}
