package applicationOne;

import java.util.Scanner;

public class Points {

	public static int withoutWarpSymbol(int i, char ar) {
		if (ar == '>') {
			i++;
		}
		if (ar == '<') {
			i--;
		}
		if (ar == 'v') {
			i++;
		}
		if (ar == '^') {
			i--;
		}
		return i;
	}

	public static int withWarpSymbol(int i, char ar) {
		if (ar == '>') {
			i--;
		}
		if (ar == '<') {
			i++;
		}
		if (ar == 'v') {
			i--;
		}
		if (ar == '^') {
			i++;
		}
		return i;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		boolean arrows = true;
		String condition;

		System.out.println("Please enter a value for x: ");
		x = sc.nextInt();

		System.out.println("Please enter a value for y: ");
		y = sc.nextInt();

		System.out.println("Please enter the given directions: ");
		condition = sc.next();
		sc.close();

		for (int i = 0; i < condition.length(); i++) {

			if (arrows) {
				if (condition.charAt(i) == '<' || condition.charAt(i) == '>') {
					x = withoutWarpSymbol(x, condition.charAt(i));
				} else {
					y = withoutWarpSymbol(y, condition.charAt(i));
				}
			} else {
				if (condition.charAt(i) == '<' || condition.charAt(i) == '>') {
					x = withWarpSymbol(x, condition.charAt(i));
				} else {
					y = withWarpSymbol(y, condition.charAt(i));
				}
			}

			if (condition.charAt(i) == '~') {
				if (arrows) {
					arrows = false;
				} else {
					arrows = true;
				}
			}
		}
		System.out.println("(" + x + ";" + y + ")");

	}

}
