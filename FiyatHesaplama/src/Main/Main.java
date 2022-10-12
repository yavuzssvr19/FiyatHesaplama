package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ınp=new Scanner(System.in);
		System.out.println("Kaç kilo armut aldınız? ");
		double armut=ınp.nextDouble();
		System.out.println("Kaç kilo elma aldınız?");
		
		double elma=ınp.nextDouble();
		System.out.println("Kaç Kilo domates adlınız?");
		double domates=ınp.nextDouble();
		
		System.out.println("Kaç kilo muz aldınız?");
		double muz=ınp.nextDouble();
		
		double aFiyat,eFiyat,dFiyat,mFiyat;
		
		aFiyat=2.14;
		eFiyat=3.67;
		dFiyat=1.11;
		mFiyat=0.95;
		
		double total=(aFiyat*armut)+(eFiyat*elma)+(dFiyat*domates)+(mFiyat*muz);
		System.out.println("Total Ücretiniz: "+total);
		
		

	}

}
