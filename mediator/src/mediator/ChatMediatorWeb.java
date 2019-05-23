package mediator;

import java.util.ArrayList;
import java.util.List;

import user.User;

public class ChatMediatorWeb implements ChatMediator{
	private List<User> users;
	
	public ChatMediatorWeb() {
		this.users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		for(User u : this.users) {
			if(u != user) {
				u.receiveMessage(message);
			}
		}
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		
	}

}
