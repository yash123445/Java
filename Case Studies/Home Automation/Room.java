package Com.HomeAutomation;

import java.util.ArrayList;

public class Room {
	String name;
	ArrayList<Devices> devices = new ArrayList<>();

	public Room(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addDevice(Devices deviceName) {
		devices.add(deviceName);
	}

	public ArrayList<Devices> getDevices() {
		return devices;
	}

}
