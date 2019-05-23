package service;

import mediator.Gateway;

public class ServiceWeb extends Service{

	public ServiceWeb(Gateway gate, String url, String name) {
		super(gate, url, name);
	}

	@Override
	public void sendRequest(String requestBody, Service targetService) {
		this.gate.sendRequest(requestBody, this, targetService);
		
	}

	@Override
	public void sendResponse(String requestBody, Service clientService) {
		String responseBody = "Client(" + clientService.name + ") " + "requisitou: " +
			requestBody + "\n" + "Target(" + this.name + ") " + "respondeu: " + 
			"Default Response of " + this.name;	
	 
		this.gate.sendResponse(responseBody, clientService);		
	}

	@Override
	public void receiveResponse(String responseBody) {
		System.out.println(responseBody);		
	}
}
