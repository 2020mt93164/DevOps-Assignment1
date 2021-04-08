public class HelloWorld{
	public static void main(String[] args) {
		
		HelloWorld instance = new HelloWorld();
		instance.printWelcomeMessage();
		instance.printInstallingSoftwareMessage();

	}
	//changes done by Aditya.sm
	private void printInstallingSoftwareMessage(){  // aditya to do this
	System.out.println("Installing software");
	}
	//Changes done by bhumit.
	private void printWelcomeMessage(){
		System.out.println("Welcome to software installation.");
	}
}