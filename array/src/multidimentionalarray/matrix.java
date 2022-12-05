package multidimentionalarray;

public class matrix {
	public static void main(String[]args) {
		int numbers[][]=new int[3] [3];
		int count=20;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				numbers[i][j]=count;
				count=count+10;
			}
		}
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
			
		}
	

	}}
