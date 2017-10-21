package com.communicom.messaging.messages;



public class BootstrapOperationRequest extends Message {
	
	private String messageName;
	private String version;
	
	
	
	

	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	

}
