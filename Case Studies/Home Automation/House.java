package Com.HomeAutomation;

import java.util.ArrayList;

public class House {

	public static void main(String[] args) {
		Devices tv = new Devices("Television");
		Devices fan = new Devices("Fan");
		Devices shower = new Devices("Shower");
		Devices ac = new Devices("AC");
		Devices Ligihts = new Devices("Lights");

		Room kichen = new Room("Kichen");
		kichen.addDevice(fan);

		Room LivingArea = new Room("Living Area");
		LivingArea.addDevice(fan);
		LivingArea.addDevice(tv);
		LivingArea.addDevice(Ligihts);

		Room DiningArea = new Room("Dining Area");
		DiningArea.addDevice(ac);
		DiningArea.addDevice(tv);
		DiningArea.addDevice(Ligihts);
		tv.turnOn();
		ac.turnOff();

		Room BedRoom = new Room("BedRoom");
		BedRoom.addDevice(Ligihts);
		BedRoom.addDevice(tv);
		BedRoom.addDevice(ac);
		
		tv.turnOff();
		ac.turnOn();
		ArrayList<Room> rooms = new ArrayList<>();
		rooms.add(BedRoom);
		rooms.add(DiningArea);
		rooms.add(LivingArea);
		rooms.add(kichen);
		
		for (Room room : rooms) {
			System.out.println("Room: " + room.getName());
			for (Devices device : room.getDevices()) {
                System.out.println("Device: " + device.getName());
                System.out.println("Status: " + (device.isOn() ? "ON" : "OFF"));
                System.out.println("----");
            }
		}
	}
}
