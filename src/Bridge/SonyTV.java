package Bridge;

public class SonyTV implements TV{
	public void on() {
		System.out.println("Switch on Sony TV");
	}

	@Override
	public void off() {
		System.out.println("Switch off Sony TV");
	}

	@Override
	public void tune(int channel) {
		System.out.println("Switch on channel in Sony TV is " + channel);
	}	

}
