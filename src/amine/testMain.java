package amine;


public class testMain {

	public static void main(String[] args) {
		
		
		
		// dosyadaki ilk satırı ekrana yazar
		System.out.println(ReadFile.readLine());
		
		//verilen dosya ismine 10 kere Merhaba Dunyali yazan metod
		WriteToFile.writing("test.txt");
		
		//dosyadaki yazılanları istenilen split'e göre böler 
		//ve ekrana yazar
		ReadFile.splitLine(" ");
		


	}

}
