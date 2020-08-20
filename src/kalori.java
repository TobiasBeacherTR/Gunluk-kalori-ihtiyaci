import java.util.Scanner;

public class kalori {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Yaþýnýzý giriniz : ");
		int yas=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Kilonuzu giriniz : ");
		double kg=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Boyunuzu giriniz : ");
		double boy=scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Cinsiyetiniz nedir? (E/K) : ");
		String x=scanner.nextLine();
		if(x.equals("E")) {
			double kalori=66+(13.7*kg)+5*boy-(6.8*yas);
			System.out.println("Günlük kalori ihtiyacýnýz : " + kalori + " kaloridir.");
		}
		else if(x.equals("K")) {
			double kalori=655+(9.6*kg)+(1.8*boy)-(4.7*yas);
			System.out.println("Günlük kalori ihtiyacýnýz : " + kalori + " kaloridir.");
		}
		else {
			System.out.println("Yanlýþ giriþ yaptýnýz.");
		}
		
	}

}
