package Com.HomeAutomation;

public class Devices {
	String deviceName;
	boolean isOn;
	long totalTime;

	public Devices(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	public void turnOn() {
		isOn = true;
	}

	public boolean isOn() {
		return isOn;
	}

	public void turnOff() {
		isOn = false;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public long getTotalTime() {
		return totalTime;
	}

	public String getName() {
		return deviceName;
	}
}
