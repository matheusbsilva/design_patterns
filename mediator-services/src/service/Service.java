package service;

import mediator.Gateway;

public abstract class Service {
	protected String url;
	protected String name;
	protected Gateway gate;
	
	public Service(Gateway gate, String url, String name) {
		this.gate = gate;
		this.url = url;
		this.name = name;
	}
	
	public abstract void sendRequest(String requestBody, Service targetService);
	
	public abstract void sendResponse(String requestBody, Service clientService);
	
	public abstract void receiveResponse(String responseBody);
	
}
