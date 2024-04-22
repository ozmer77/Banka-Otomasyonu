package test;

import java.util.HashMap;
import java.util.Scanner;

public class Personal extends customer implements faiz,yatırım,kredi {
	Scanner scanner =new Scanner(System.in);
	int para=10980;
	double borç=0;
	double bakiyegor() {
		return para;
	}
	int paracek() {
		int miktar;
		miktar=scanner.nextInt();
		return para-miktar;
	}
	int parayatır() {
		int miktar;
		miktar=scanner.nextInt();
		return para+miktar;
	}
	int krediver() {
		int kredi=scanner.nextInt();
		if(puan>=10) {
		if(kredi==kredimiktarı) {
			para=para+kredimiktarı;
			borç=kredimiktarı*faiz;
		}
		else if(kredi==kredimiktarı2) {
			para=para+kredimiktarı2;
			borç=kredimiktarı*faizk1;
		}
		else if(kredi==kredimiktarı3){
			para=para+kredimiktarı3;
			borç=kredimiktarı*faizk1;
		}
		
	}return para;
	
	}
	
}

