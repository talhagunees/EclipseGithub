package introo;

public class main1 {
	
	public static void main(String[] args) {
		System.out.println("HELLO WORLD!");
		
		//değişken isimlendirmeleri Java'da camelCase yazılır
		//String metinsel veri değişkeni
		//Üzerinde işlem yapmadığın veriler String olarak yazılır
		//Her kod ; ile biter
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		//Referans verdiğin değişkeni çift tırnak olmadan yaz
		System.out.println(altMetin);
		System.out.println(ortaMetin);
		
		//integer tam sayı değişkeni
		int vade = 12;
		
		System.out.println(vade);
	
		// double ondalıklı sayı değişkeni
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		//şartlı bloklar mantıksal veri
		//true veya false sorusuna cevap verebilcek
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		//if satırının içindeki kod sağlanırsa kendi bloğunu çalıştırır
		// if else mutlaka çalışır ama sadece biri çalışır
		// if else satırlarının sonuna ; gelmez
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";	
			System.out.println(okYonu);
			
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {	
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		}
		//array
		//köşeli parantez görürsen o bir liste
		String[] krediler = {"Hızlı Kredi" , "Maaşını Halkbanktan" , "Mutlu Emekli"};
		
        //kodlamada saymaya 0'dan başlanır
		//for=döngü, bir şeyi bir şarta göre tekrarla
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		
		}
	}

}

