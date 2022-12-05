package customarrays;

public class bike {
	int slno;
	String name;
	String model;
	float price;
	boolean isprovideddisc;
	public bike(int slno, String name, String model, float price, boolean isprovideddisc) {
		super();
		this.slno = slno;
		this.name = name;
		this.model = model;
		this.price = price;
		this.isprovideddisc = isprovideddisc;
	}
	@Override
	public String toString() {
		return "bike [slno=" + slno + ", name=" + name + ", model=" + model + ", price=" + price + ", isprovideddisc="
				+ isprovideddisc + "]";
	}
	

}
