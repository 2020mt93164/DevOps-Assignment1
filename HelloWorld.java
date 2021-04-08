public class HelloWorld{
	public static void main(String[] args) {
		
		HelloWorld instance = new HelloWorld();
		instance.printWelcomeMessage();
		instance.printCheckingSystemMessage();

	}

	private void printWelcomeMessage(){
		System.out.println("Welcome to software installation.");
	}
	
	private void printCheckingSystemMessage(){
	System.out.println("Checking your system");
}
}