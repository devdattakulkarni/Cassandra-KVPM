package org.apache.cassandra.thrift;

public class ProvenanceData {

	public String resourceExpression;
	public String resourceValue;
	public String timeInMillis;
	public String accessor;
	public String provenanceOperator;

	public ProvenanceData(String resourceName, String resourceValue,
			String timeInMillis, String accessor, String provOperator) {
		initialize(resourceName, resourceValue, timeInMillis, accessor, provOperator);
	}
	
	public ProvenanceData(String resourceName, String resourceValue,
			String timeInMillis, String accessor) {
		initialize(resourceName, resourceValue, timeInMillis, accessor, null);
	}
	
	private void initialize(String resourceName, String resourceValue,
			String timeInMillis, String accessor, String provOperator) {
		this.resourceExpression = resourceName;
		this.resourceValue = resourceValue;
		this.timeInMillis = timeInMillis;
		this.accessor = accessor;
		this.provenanceOperator = provOperator;		
	}	
}