import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CassandraProperties 
{
	private static final CassandraProperties casProperties = new CassandraProperties();
	
	private Properties properties = new Properties();
	
	//TODO deal with exception properly
	private CassandraProperties()
	{
		InputStream in = getClass().getResourceAsStream("cassandra.properties");
		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getKeyspace()
	{
		return properties.getProperty(CassandraPropertiesEnum.KEYSPACE.getProperty());
	}
	
	public static final CassandraProperties getCassandraProperties()
	{
		return casProperties;
	}
}
