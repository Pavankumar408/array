package customarrays;

public class runner {
	public static void main(String[]args) {
		laptop lap=new laptop(234,"hp","hp8",65000,true);
		laptop lap1=new laptop(345,"dell","dell18",70000,true);
		laptop[]laptops= {lap,lap1};
		for(laptop laps:laptops) {
			System.out.println(laps);
		}
		laptop []laptop3=new laptop[2];
		laptop3[0]=lap;
		laptop3[1]=lap1;
		for(laptop lap5:laptop3) {
			System.out.println(lap5);
		}
		
	}

}
