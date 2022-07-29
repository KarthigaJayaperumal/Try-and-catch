import java.util.Scanner;

public class Exceptionhandling {

	public static void main(String[] args) {
		Exceptionhandling eh=new Exceptionhandling();
		eh.check();
}
	private void check() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First Number  ");
	int no=Sc.nextInt();
	try {
	int ar[]=new int[no];
	System.out.println("Enter Second Number  ");
	int no2=Sc.nextInt();
	int ar2[]=new int[no2];
	int result=no+no2;
	System.out.println("Result is  "+result);}
	catch(NegativeArraySizeException  jk){
		System.out.println("Please enter only positive values ");
		System.out.println();
		check();
	}
		
	}

}
