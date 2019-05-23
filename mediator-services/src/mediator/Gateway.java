package mediator;

import service.Service;

public interface Gateway {
	
	public void sendRequest(String requestBody, Service clientService, Service targetService);
	
	public void sendResponse(String responseBody, Service clientService);
}
