package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Entre com o número de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da figura #" + i);
			System.out.print("É um retângulo ou círculo? r/c? ");
			char c = sc.next().charAt(0);
			System.out.print("Qual a cor? (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (c == 'r') {
				System.out.print("LARGURA: ");
				double width = sc.nextDouble();
				System.out.print("ALTURA: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("RAIO ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}

		}

		System.out.println();
		System.out.println("SHAPE AREAS");

		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
			sc.close();
		}
	}
}
