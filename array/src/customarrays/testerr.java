package customarrays;

public class testerr {
	public static void main(String[]args) {
		mobile mobi=new mobile(123,"vivo","S1",20000,true);
		mobile mobi3=new mobile(234,"MI","10i",15000,false);
		mobile mobi2[]={mobi,mobi3};
		for(mobile mo:mobi2) {
			System.out.println(mo);
		}
		
	}

}
