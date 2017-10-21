package com.communicom.messaging.messages;



public class BoostrapOperationResponse extends Message {
	
	
	private String version;
	private boolean result;
	private boolean errorMessage;
	private String messageName;
	
	
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
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public boolean isErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(boolean errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
