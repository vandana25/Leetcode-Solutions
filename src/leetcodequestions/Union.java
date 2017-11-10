package leetcodequestions;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Union {

	private static Scanner scan = new Scanner(System.in);
	private HashMap<Integer, Integer> hm;

	public Union(Integer s) {
		// Use HashMap of the exact size.
		hm = new HashMap<>(s);
		for (int i = 0; i < s; i++)
			hm.put(i, i);
	}

	public static void main(String[] args) {

		System.out.println("Enter number of objects");
		int s = scan.nextInt();
		Union u = new Union(s);

		while (true) {
			System.out.println("You can use the following options:");
			System.out.println("1. Add a connection");
			System.out.println("2. Check connection");
			System.out.println("3. Exit");
			String option = scan.next(), input;
			String[] inputNumbers;
			switch (option) {
			case "1":
				System.out.println("Enter the numbers to be connected separated by a comma(no spaces). Example: 5,6");
				input = scan.next();
				inputNumbers = input.trim().split(",");
				int a = Integer.parseInt(inputNumbers[0]);
				int b = Integer.parseInt(inputNumbers[1]);
				if (a < 0 || b < 0 || a >= u.hm.size() || b >= u.hm.size()) {
					System.out.println("Numbers are invalid");
					continue;
				}
				u.addConnection(a, b);
				break;
			case "2":
				System.out.println("Enter two numbers to check their connection. Example: 5,6");
				input = scan.next();
				inputNumbers = input.trim().split(",");
				a = Integer.parseInt(inputNumbers[0]);
				b = Integer.parseInt(inputNumbers[1]);
				if (a < 0 || b < 0 || a >= u.hm.size() || b >= u.hm.size()) {
					System.out.println("Numbers are invalid");
					continue;
				}
				u.isConnected(a, b);
				break;
			case "3":
				System.out.println("Bye!");
				return;
			default:
				continue;
			}
		}
	}

	public void addConnection(int a, int b) {
		int value = hm.get(b);
		int prev_value = hm.get(a);
		hm.put(a, value);
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue().equals(prev_value))
				hm.put(entry.getKey(), value);
		}
		System.out.println("Connection created between " + a + " and " + b);
	}

	public void isConnected(int a, int b) {
		int value = hm.get(a);
		int secondValue = hm.get(b);
		if (value == secondValue)
			System.out.println("Yes, " + a + " and " + b + " are connected.");
		else
			System.out.println("No, " + a + " and " + b + " are not connected");
	}
}