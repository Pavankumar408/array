package customarrays;

public class flight {
	int slno;
	String name;
	String model;
	boolean isbusinessclass;
	public flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public flight(int slno, String name, String model, boolean isbusinessclass) {
		super();
		this.slno = slno;
		this.name = name;
		this.model = model;
		this.isbusinessclass = isbusinessclass;
	}
	@Override
	public String toString() {
		return "flight [slno=" + slno + ", name=" + name + ", model=" + model + ", isbusinessclass=" + isbusinessclass
				+ "]";
	}
	

}
