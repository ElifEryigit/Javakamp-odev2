package odev2intro;

public class Main {

	public static void main(String[] args) {
		
		information info1 = new information("Elif","Eryigit","jsfhdsjfhj");
		
		information info2 = new information("Emir","Eryigit","jhjdskfj");
		
		information cours1 = new information(1,"Java");
		
		information cours2 = new information(2,"C#");
		
		
		InfoManager infomanager = new InfoManager();
		infomanager.bilgi(info2);
		infomanager.bilgi(info1);
		
		InfoManager infomanager2 = new InfoManager();
		infomanager2.kurs(cours1);
		infomanager2.kurs(cours2);
		
		
		

	}

}
