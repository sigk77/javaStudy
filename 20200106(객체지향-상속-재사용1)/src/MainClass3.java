abstract class µ¿¹°{
	abstract void °È´Â´Ù(); // ¼±¾ð {}
	abstract void ¸Ô´Â´Ù();
	void display() {
		System.out.println("µ¿¹° Ç¥Çö!!!");
	}
}
class »ç¶÷ extends µ¿¹°{

	@Override
	void °È´Â´Ù() {
		// TODO Auto-generated method stub
		System.out.println("»ç¶÷Ã³·³ °È´Â´Ù");
	}

	@Override
	void ¸Ô´Â´Ù() {
		// TODO Auto-generated method stub
		System.out.println("¼öÀú·Î ¸Ô´Â´Ù");
	}
	
}
class µÅÁö extends µ¿¹°{

	@Override
	void °È´Â´Ù() {
		// TODO Auto-generated method stub
		System.out.println("µÅÁöÃ³·³ °È´Â´Ù");
	}

	@Override
	void ¸Ô´Â´Ù() {
		// TODO Auto-generated method stub
		System.out.println("µÅÁöÃ³·³ ¸Ô´Â´Ù");
	}
	
}
class ¼Ò extends µ¿¹°{

	@Override
	void °È´Â´Ù() {
		// TODO Auto-generated method stub
		System.out.println("¼ÒÃ³·³ °È´Â´Ù");
	}

	@Override
	void ¸Ô´Â´Ù() {
		System.out.println("¼ÒÃ³·³ ¸Ô´Â´Ù");
		// TODO Auto-generated method stub
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		µ¿¹° a=new »ç¶÷();
		a.°È´Â´Ù();
		a.¸Ô´Â´Ù();
		
		a=new ¼Ò();
		a.°È´Â´Ù();
		a.¸Ô´Â´Ù();
		
		a=new µÅÁö();
		a.°È´Â´Ù();
		a.¸Ô´Â´Ù();

	}

}
