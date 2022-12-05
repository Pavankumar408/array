package customarrays;

public class tester {
	public static void main(String[]args) {
		flight flight=new flight(888,"indego","indego56",true);
		flight flight2=new flight(456,"kingfisher","king23",true);
		flight[]flights= {flight,flight2};
		for(flight fly:flights) {
			System.out.println(fly);
		}
		flight[] flights1=new flight[2];
		flights1[0]=flight;
		flights1[1]=flight2;
		for(flight fly2:flights1) {
			System.out.println(fly2);
		}
	}

}
