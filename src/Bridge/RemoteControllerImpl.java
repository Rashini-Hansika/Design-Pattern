package Bridge;

public class RemoteControllerImpl implements RemoteController{
	TV tv;
	
	public RemoteControllerImpl(TV tv) {
		this.tv = tv;
	}

	@Override
	public void on() {
		tv.on();
		
	}

	@Override
	public void off() {
		tv.off();
	}

	@Override
	public void tune(int channel) {
		tv.tune(channel);
	}
	
	
}
