package net.mightypixel;

public interface IMediator {

	public void registerParticipant(Participant participant);
	public void postMessage(Participant sender, String message);
	
}
