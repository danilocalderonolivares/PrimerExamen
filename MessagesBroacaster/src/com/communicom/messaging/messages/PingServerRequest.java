package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends Message {
	
	
	public PingServerRequest(){
		this.messageNumber = 1;
		this.emisionTime = LocalDateTime.now();
	}
	
	
	
	
}
