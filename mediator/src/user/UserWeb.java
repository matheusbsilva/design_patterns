package user;

import mediator.ChatMediator;

public class UserWeb extends User {

	public UserWeb(ChatMediator mediator, String name) {
		super(mediator, name);
	}
	
	public void sendMessage(String message) {
		this.mediator.sendMessage(message, this);
	}
	
	public void receiveMessage(String message) {
		System.out.println(this.name + ": Recebeu a mensagem: " + message);
	}

}
