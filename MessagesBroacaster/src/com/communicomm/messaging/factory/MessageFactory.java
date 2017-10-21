package com.communicomm.messaging.factory;

import com.communicom.messaging.messages.BoostrapOperationResponse;
import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.MessageType;

public final class MessageFactory {
	
	
	public static Message newMessage(MessageType type ) {
		
		
		switch(type) {
		
			case BoostrapOperationResponse:
				new BoostrapOperationResponse();
			case BootstrapOperationRequest:
				new BootstrapOperationRequest();
			case PingServerRequest:
				new PingServerRequest();
			case PingServerResponse:
				new PingServerResponse();
			case SetWaitForSignalRequest:
				new SetWaitForSignalRequest();
			case SetWaitForSignalResponse:
				new SetWaitForSignalResponse();
		
		}
		
		
		
		
		
		
		
		return null;
		
	}
	

}
