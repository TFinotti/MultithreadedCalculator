import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultithreadedCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		boolean cont;
		
		do {
			
			System.out.println("Welcome to the Centennial College Multithreaded Integer Calculator");
			System.out.print("Please enter your first integer: ");
			int a = input.nextInt();
			System.out.print("Please enter the second integer: ");
			int b = input.nextInt();
			
			ExecutorService executorService = Executors.newFixedThreadPool(4);
			
			Thread add = new Thread(new Addition(a,b));
			Thread sub = new Thread(new Subtraction(a,b));
			Thread mul = new Thread(new Multiplication(a,b));
			Thread div = new Thread(new Division(a,b));
		
			executorService.execute(add);
			executorService.execute(sub);
			executorService.execute(mul);
			executorService.execute(div);
			
			executorService.shutdown();
			
			try {
		        if (!executorService.awaitTermination(1000, TimeUnit.NANOSECONDS)) {
		        	executorService.shutdownNow();
		        }
		    } catch (InterruptedException ex) {
		    	executorService.shutdownNow();
		        Thread.currentThread().interrupt();
		    }
			
			System.out.print("Do you wish to exit the calculator? (y/n) ");
			
			cont = (input.next().toLowerCase().equals("n")) ? true : false;
			
		} while (cont);
		
		System.out.println("Bye. Have a good day.");
		
		input.close();
		
	}

}
