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
		turningOn();
		pressButton();

		do {
			opt = input.next();
			switch (opt) {
				case "0":
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
				case "8":
				case "9":
					pressButton();
					break;
				default:
					System.out.println("Command not recognized");
					System.out.println("Please enter a number,enter \"OFF\" to get out");
					break;
			}
		} while (!opt.equals("OFF"));
		turningOff();
	}

	public static void initialMessage() {
		System.out.println("To begin, turn on the remote control(\"Enter ON\")");

	}

	public static void pressButton() {
		System.out.println("BOOP");
		System.out.println("Please enter a number,enter \"OFF\" to get out");
	}

	public static void turningOff() {
		System.out.println("Turning off");
	}

	public static void turningOn() {
		System.out.println("TURNING ON...");
	}
}