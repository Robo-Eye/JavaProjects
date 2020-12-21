import java.util.Scanner;
public class Program1bFontanaTyler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double hrlyPay = 16.20;
		double ovrTime = hrlyPay * 1.5;
		double socSecTax = 0.06;
		double fedIncTax = 0.14;
		double stateIncTax = 0.05;
		double unionTax = 10;
		double hlthIns = 35;
		double grossPay;
		
		System.out.println("How many hours a week do you work?");
		double hrs = sc.nextDouble();
		System.out.println("How many dependents do you have?");
		int dependents = sc.nextInt();
		
		if(hrs > 40) {
			grossPay = (40 * hrlyPay) + (ovrTime *(hrs - 40)); 
		}else {
			grossPay = hrs * hrlyPay;
		}
		
		double netPay = grossPay;
		
		socSecTax *= grossPay;
		fedIncTax *= grossPay;
		stateIncTax *= grossPay;
		
		netPay = grossPay - unionTax - socSecTax - fedIncTax - stateIncTax;
			
		if(dependents >= 3){
			netPay -= hlthIns;
			System.out.printf("Your gross pay is %.2f.\nHowever, you loss "
					+ "%.2f from the Social Security Tax,\n%.2f "
					+ "from the Federal Income Tax,\nand %.2f from"
					+ " the State Income Tax.\nAs well as a flat expesne of %.2f "
					+ " for the union and a %.2f fee for health insurance"
					+ ". \nYour net pay after expenses is %.2f."
					, grossPay, socSecTax, fedIncTax, stateIncTax, unionTax, hlthIns, netPay);
			System.exit(0);
		}
		
		System.out.printf("Your gross pay is %.2f.\nHowever, you loss "
				+ "%.2f from the Social Security Tax,\n%.2f "
				+ "from the Federal Income Tax,\nand %.2f from"
				+ " the State Income Tax.\nAs well as a flat expesne of %.2f"
				+ " for the union. \nYour net pay after expenses is %.2f."
				, grossPay, socSecTax, fedIncTax, stateIncTax, unionTax, netPay);
		
		
		sc.close();
	}

}