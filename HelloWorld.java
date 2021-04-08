public class HelloWorld{
	public static void main(String[] args) {
		
		HelloWorld instance = new HelloWorld();
		instance.printWelcomeMessage();
                instance.printInstallationSuccessMessage();

	}

	private void printWelcomeMessage(){
		System.out.println("Welcome to software installation.");
	}
        private void printInstallationSuccessMessage(){    // Arpit to do this
	System.out.println("Checking your system");
}
}