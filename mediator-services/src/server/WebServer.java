package server;

import mediator.APIGateway;
import mediator.Gateway;
import service.Service;
import service.ServiceWeb;

public class WebServer {

	public static void main(String[] args) {
		Gateway apiGateway = new APIGateway();
		
		Service app = new ServiceWeb(apiGateway, "/app", "App");
		Service profile = new ServiceWeb(apiGateway, "/profile", "Profile");
		Service notification = new ServiceWeb(apiGateway, "/notification", "Notification");
		
		app.sendRequest("Nome dos usuários", profile);
		app.sendRequest("Lista de notificações", notification);
		

	}

}
