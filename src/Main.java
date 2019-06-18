public class Main {	
	public static void main(String[] args) throws InterruptedException {
		Rabbit rabbit = new Rabbit( 5, 10);
		rabbit.sayHello();
		rabbit.yPosition += 15;
		
		boolean runForever = true;

		while (runForever == true) {
			System.out.println("Carrot");
			Thread.sleep(3000);
		}
	}

}
