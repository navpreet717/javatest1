public class Main {	
	public static void main(String[] args) throws InterruptedException {
		Rabbit rabbit = new Rabbit( 500, 1000);
		rabbit.sayHello();
		
		boolean runForever = true;

		while (runForever == true) {
			System.out.println("Carrot");
			Thread.sleep(3000);
		}
	}

}
