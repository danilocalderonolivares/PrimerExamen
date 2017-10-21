package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;
import com.communicom.messaging.messages.signals.MessageType;
import com.communicomm.messaging.factory.MessageFactory;

public class MessageController {
	private ArrayList<PingServerRequest>sentPingRequest = new ArrayList<PingServerRequest>();
	private ArrayList<PingServerResponse>receivedPingResponse = new ArrayList<PingServerResponse>();
	private ArrayList<SetWaitForSignalRequest>sentWaitForSignalRequest = new ArrayList<SetWaitForSignalRequest>();		
	private ArrayList<SetWaitForSignalResponse>ReceivedWaitForSignalResponse = new ArrayList<SetWaitForSignalResponse>();
	
	public void sendMessage(int messageOption) {
		
		
		ArrayList<Message> messageList = new ArrayList<Message>();
		messageList.add(crearMensaje(messageOption));
		

	}
	public static Message crearMensaje(int type ) {
		
		return MessageFactory.newMessage(MessageType.values()[type-1]);
		
	}

	public void listMessage(int messageOption) {
		if (messageOption == 1){
			for (PingServerRequest currentRequest: sentPingRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 2){
			for (PingServerResponse currentResponse: receivedPingResponse){
				System.out.println(currentResponse);
			}
		}
		if (messageOption == 3){
			for (SetWaitForSignalRequest currentRequest: sentWaitForSignalRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 4){
			for (SetWaitForSignalResponse currentResponse: ReceivedWaitForSignalResponse){
				System.out.println(currentResponse);
			}
			if(messageOption == 5) {
				
				
			}
		}
	}

}
