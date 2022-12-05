package customarrays;

public class mobile {
	int slno;
	String name;
	String model;
	float price;
	boolean isprovidedfacelock;
	public mobile(int slno, String name, String model, float price, boolean isprovidedfacelock) {
		super();
		this.slno = slno;
		this.name = name;
		this.model = model;
		this.price = price;
		this.isprovidedfacelock = isprovidedfacelock;
	}
	@Override
	public String toString() {
		return "mobile [slno=" + slno + ", name=" + name + ", model=" + model + ", price=" + price
				+ ", isprovidedfacelock=" + isprovidedfacelock + "]";
	}
	

}
