import javax.swing.ImageIcon;

public class App {
	// Array to hold list of devices
	private Device[] deviceArray = new Device[10];
	// current position in array
	private int currentdevice = 0;
	// on/off to show full details
	private boolean showfullInfo;

	// Constructor populates array with device objects
	App() {
		deviceArray[0] = new Device("Envy Photo Printer", 89.99, "0123", "HP");
		deviceArray[1] = new Device("Zen Beam Projector", 29.99, "0124", "ASUS");
		deviceArray[2] = new Device("Belt Sander - 850W", 48.99, "0125", "GUILD");
		deviceArray[3] = new Device("S&S Video Baby Monitor", 129.99, "0126", "VTECH");
		deviceArray[4] = new Device("Wet & Dry El. Shaver", 60.99, "0127", "REMINGTON");
		deviceArray[5] = new Device("Astro Fi Telescope", 579.99, "0128", "CELESTRON");
		deviceArray[6] = new Device("Waterproof MP3 Player", 99.99, "0129", "SONY");
		deviceArray[7] = new Device("Microwave Oven 900W", 739.99, "0130", "PANASONIC");
		deviceArray[8] = new Device("Fog Free Mirror", 17.99, "0131", "CROYDEX");
		deviceArray[9] = new Device("Curl Hair Dryer", 97.99, "0132", "BABYLISS");
	}

	// Setters
	public void setShowFullInfo(boolean onOff) {
		showfullInfo = onOff;
	}
	
	// Getters
	public String getPreviousDevice() {
		if (currentdevice == 0)
			currentdevice = 9;
		else
			currentdevice--;
		return getDeviceInfo(currentdevice);
	}

	public String getNextDevice() {
		if (currentdevice == 9)
			currentdevice = 0;
		else
			currentdevice++;
		return getDeviceInfo(currentdevice);
	}

	public String getFirstDevice() {
		currentdevice = 0;
		return getDeviceInfo(currentdevice);
	}

	public String getLastDevice() {
		currentdevice = 9;
		return getDeviceInfo(currentdevice);
	}

	public String getCurrentDevice() {
		return getDeviceInfo(currentdevice);
	}

	public String getDeviceInfo(int CurrentdevNb) {
		String DeviceInfo = "\t" + (CurrentdevNb + 1) + " of 10\n" +

				"\t\t   --------\n\t\t\n" +

				"    Name: " + deviceArray[CurrentdevNb].getName() + "\n\n" +

				"    Price: " + deviceArray[CurrentdevNb].getPrice() + " Euro \n";

		if (!getShowfullInfo())
			DeviceInfo = DeviceInfo + "\n-----------------------------------------";
		else
			DeviceInfo = DeviceInfo + "\n\n\n  More info:\n\n" + "    Code: "
					+ deviceArray[CurrentdevNb].getDevice_Code() + "\n" + "    Manufacturer: "
					+ deviceArray[CurrentdevNb].getManfacture() + "\n\n" + "-------------------------------------\n\n";
		return DeviceInfo;
	}

	public boolean getShowfullInfo() {
		return showfullInfo;
	}

}