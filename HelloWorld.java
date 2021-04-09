public class HelloWorld{
	public static void main(String[] args) {
		
		HelloWorld instance = new HelloWorld();
		instance.printWelcomeMessage();
		instance.printCheckingSystemMessage();
		instance.printInstallingSoftwareMessage();
		instance.printInstallationSuccessMessage();
	}
	
	private void printWelcomeMessage(){
		System.out.println("Welcome to software installation.");
	}
	private void printCheckingSystemMessage(){
		System.out.println("Checking your system");
	}
	private void printInstallingSoftwareMessage(){  
		System.out.println("Installing software");
	}
	private void printInstallationSuccessMessage(){  
		System.out.println("Software installed successfully");
	}	
}
