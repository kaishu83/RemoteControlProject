import java.util.Scanner;

public class RemoteControlApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		initialMessage();
		String opt = input.next();
		while (!opt.equals("ON")) {
			initialMessage();
			opt = input.next();
			
		}

		System.out.println("TURNING ON...");
	}

	public static void initialMessage() {
		System.out.println("To begin, turn on the remote control(\"Enter ON\")");

	}

	public static void pressButton() {
		System.out.println("BOOP");
	}

}
