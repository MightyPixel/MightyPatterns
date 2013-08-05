package net.mightypixel;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {

	private List<Participant> participants;
	
	public ChatRoom() {
		participants = new ArrayList<>();
	}
	
	@Override
	public void registerParticipant(Participant participant) {
		participants.add(participant);
	}

	@Override
	public void postMessage(Participant sender, String message) {

		for (Participant participant : participants) {
			if (participant != sender)
				participant.receiveMessage(message);
		}
		
	}

	
	
	
}
