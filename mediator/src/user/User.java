package user;

import mediator.ChatMediator;

public abstract class User {
	protected String name;
	protected ChatMediator mediator;
	
	public User(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void sendMessage(String message);
		
	
	public abstract void receiveMessage(String message);
		
}
