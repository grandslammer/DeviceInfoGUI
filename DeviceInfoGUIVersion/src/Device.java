public class Device {
	private String name;
	private double price;
	private String device_code;
	private String manuf;

	// Device constructor
	public Device(String n, double p, String dc, String mf) {
		name = n;
		price = p;
		device_code = dc;
		manuf = mf;
	}

	// Getters
	public String getName() {
		return name + " " + price;
	}

	public double getPrice() {
		return price;
	}

	public String getDevice_Code() {
		return device_code;
	}

	public String getManfacture() {
		return manuf;
	}

	// Setters
	public void setName(String n) {
		name = n;
	}

	public void setPrice(double p) {
		price = p;
	}

	public void setDevice_Code(String dc) {
		device_code = dc;
	}

	public void setManuf(String mf) {
		manuf = mf;
	}
}