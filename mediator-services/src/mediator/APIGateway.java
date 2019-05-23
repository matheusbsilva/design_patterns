package mediator;

import service.Service;

public class APIGateway implements Gateway{

	@Override
	public void sendRequest(String requestBody, Service clientService, Service targetService) {
		targetService.sendResponse(requestBody, clientService);
		
	}

	@Override
	public void sendResponse(String responseBody, Service clientService) {
		clientService.receiveResponse(responseBody);
		
	}

}
