import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class App 
{

	public static void main (String args[])
	{
		CassandraProperties properties = CassandraProperties.getCassandraProperties();
		
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		
		Session session = cluster.connect(properties.getKeyspace());
		
		//TODO properly handle exceptions
		try(BufferedReader br = new BufferedReader(new FileReader("filename")))
		{
			for (String line; (line = br.readLine()) != null; )
			{
				//TODO more efficient string splitting
				
				String[] columns = line.split("\t");
				
				for (String column : columns)
				{
					
				}
			}
		}
		catch(Exception e)
		{
			
		}
	}
	
}
