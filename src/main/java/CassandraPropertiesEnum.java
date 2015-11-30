
public enum CassandraPropertiesEnum {
	
	KEYSPACE("casKeyspace");
	
	private final String propertyName;
	
	private CassandraPropertiesEnum(String pName)
	{
		this.propertyName = pName;
	}

	public String getProperty()
	{
		return this.propertyName;
	}
}
