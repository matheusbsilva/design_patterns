package client;

import mediator.ChatMediator;
import mediator.ChatMediatorWeb;
import user.User;
import user.UserWeb;

public class Client {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorWeb();
		
		User arya = new UserWeb(mediator, "Arya");
		User sansa = new UserWeb(mediator, "Sansa");
		User jon = new UserWeb(mediator, "Jon");
		
		mediator.addUser(arya);
		mediator.addUser(sansa);
		mediator.addUser(jon);
		
		jon.sendMessage("Meu nome não é Jon Snow");

	}

}
