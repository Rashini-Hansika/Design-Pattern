package Command;

public class Client {
	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		
		Light livingroomlight = new Light("Living room light ");
		Light kitchenlight = new Light ("Kitchen light ");
		
		LightOnCommand onLivingRoomLight = new LightOnCommand(livingroomlight);
		LightOnCommand onKitchenLight = new LightOnCommand(kitchenlight);
		LightOffCommand offLivingRoomLight = new LightOffCommand(livingroomlight);
		LightOffCommand offKitchenLight = new LightOffCommand(kitchenlight);
		
		remoteController.setCommand(0, onLivingRoomLight, offLivingRoomLight);
		remoteController.setCommand(1, onKitchenLight,offKitchenLight );
		
		remoteController.onButtonPushed(0);
		remoteController.offButtonPushed(0);
		remoteController.onButtonPushed(1);
		remoteController.offButtonPushed(1);
	}
}
