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
		

		while (!opt.equals("OFF")) {
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
				case "OFF": break;
				default:
					System.out.println("Command not recognized");
					System.out.println("Please enter a number,enter \"OFF\" to turn off");
					break;
			}
		} 
		turningOff();
	}

	public static void initialMessage() {
		System.out.println("PLease Key in your Option: ");
		System.out.println("*****ON    OFF*****");
		System.out.println("*****0   1   2*****");
		System.out.println("*****3   4   5*****");
		System.out.println("*****6  7  8  9****");
		System.out.println("To begin, turn on the remote control,enter \"ON\" to turn on");

	}

	public static void pressButton() {
		System.out.println("BOOP");
		System.out.println("Please enter a number,enter \"OFF\" to turn off");
	}

	public static void turningOff() {
		System.out.println("TURNING OFF");
	}

	public static void turningOn() {
		System.out.println("TURNING ON...");
		System.out.println("Please enter a number,enter \"OFF\" to turn off");
	}
	
}