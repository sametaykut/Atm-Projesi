package atmprojesi;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double para = 0;
		double bakiye = 0 ;
		System.out.println(" ATM HOSGELDINIZ ");
		System.out.println(" Islemler\n"+" 1.islem:Bakiye Ogrenme\n"+" 2.islem:Para cekme\n"+" 3.islem:Para yat�rma\n"+" 4.islem:C�k�s" );
		Scanner scanner = new Scanner (System.in);
		while (true) {
			System.out.print("\nHangi islemi yapmak istiyorsunuz:" );

		int islem = scanner.nextInt();
		if (islem == 1) {
			
		System.out.println("Bakiyeniz:"+bakiye);	
			
		}
		else if (islem == 2) {
			System.out.print("Cekmek istediginiz miktar� giriniz..." );
			para = scanner.nextDouble();
			if(para < bakiye) { 
			bakiye-=para;
			System.out.print("Bakiyeniz :"+ bakiye );
			}
			else {
				System.out.print("Yeterli bakiye bulunmamaktad�r" );
			}
		}
		else if (islem == 3) {
			System.out.print("Yatirmak istediginiz miktar� giriniz..." );
			para = scanner.nextDouble();
			bakiye+=para;
			System.out.print("Bakiyeniz :"+ bakiye );
			
		}
		else if (islem == 4) {
			System.out.print("C�k�s yap�l�yor..." );
			break;
			
		}
		else {
			
			System.out.print("Gecersiz islem. Lutfen gecerli islem giriniz.." );
			
		
		}	
		}
	}

}
