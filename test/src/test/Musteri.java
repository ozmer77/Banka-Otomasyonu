package test;

import java.util.Scanner;

public class Musteri extends customer implements yatırım,faiz,kredi{
	Scanner scanner =new Scanner(System.in);
	boolean iste=false;
	double para=10980;
	
	double borç=0;
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
	void krediiste() {
		if(puan>=10) {
			iste=true;
		}
		
	}

}
