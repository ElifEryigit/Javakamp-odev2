package odev2intro;

public class information {
	
	public information () {
		
	}
	
	
	public information (String ad, String soyad, String mail)
	{
		this.ad = ad;
		this.soyad = soyad;
		this.mail = mail;
		
	}
	
	public information(int id,String coursname)
	{
		this.id = id;
		this.coursname = coursname;
	}
	
	
	
	String ad;
	String soyad;
	String mail;
	
	int id;
	String coursname;
	
	

}
