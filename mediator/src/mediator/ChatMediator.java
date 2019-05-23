package mediator;

import user.User;

public interface ChatMediator {

	public void sendMessage(String message, User user);
	
	public void addUser(User user);
}
