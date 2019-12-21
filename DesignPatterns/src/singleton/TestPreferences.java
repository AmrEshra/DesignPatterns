package singleton;

public class TestPreferences {

	public static void main(String[] args) {

		Preferences.getInstance().helloSingleton();
		System.out.println(Preferences.getInstance());
		
		MyPreferences.getInstance().helloSingleton();
		System.out.println(MyPreferences.getInstance());
//        MyPreferences.getInstance().helloSingleton();

	}

}
