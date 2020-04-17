package polymorphism.compiletime.in;

public class Facebook {
	String name;

	public Facebook(String name) {
		this.name = name;
	}

	public void login(int otp) {
		System.out.println("Successfully Loged-In using OTP");
	}

	public void login(String email, String password) {
		System.out.println("Successfully Loged-In using Email & Password");
	}

	public static void main(String[] args) {

		Facebook fb = new Facebook("Khusi");
		System.out.println(fb.name);
		fb.login(1234);
		fb.login("xyz@gmail.com", "xyz2314");
	}
}
