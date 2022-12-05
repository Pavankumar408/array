package customarrays;

public class scanner {
	public static void main(String[]args) {
		bike bike=new bike(123,"kTm","duke",250000,true);
		bike bike1=new bike(234,"pulsar","150",180000,false);
		bike []bike3= {bike,bike1};
		for(bike ke:bike3) {
			System.out.println(ke);
		}
		
	}

}
