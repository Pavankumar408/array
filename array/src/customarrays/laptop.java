package customarrays;

public class laptop {
	int slno;
	String name;
	String model;
	int cost;
	boolean isprovidedcamera;
	public laptop(int slno, String name, String model, int cost, boolean isprovidedcamera) {
		super();
		this.slno = slno;
		this.name = name;
		this.model = model;
		this.cost = cost;
		this.isprovidedcamera = isprovidedcamera;
	}
	public laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "laptop [slno=" + slno + ", name=" + name + ", model=" + model + ", cost=" + cost + ", isprovidedcamera="
				+ isprovidedcamera + "]";
	}

}
