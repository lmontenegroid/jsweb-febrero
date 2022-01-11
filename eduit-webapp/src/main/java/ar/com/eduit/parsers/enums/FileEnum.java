package ar.com.eduit.parsers.enums;

public enum FileEnum {

	CSV("csv");
	
	private String type;
	
	private FileEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	
}
