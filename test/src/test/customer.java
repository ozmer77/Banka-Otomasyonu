package test;

import java.util.Scanner;

public abstract class customer  {
	Scanner scanner=new Scanner(System.in);
	
	double para;
	double bakiyegor() {
		return para;
	}
	double paracek(double miktar) {
		
		miktar=scanner.nextInt();
		return para=para-miktar;
	}
	double parayatır(double miktar) {
		
		miktar=scanner.nextInt();
		return para=para+miktar;
	}
}
