package ch5_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PaikCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Coffee> paikcoffee = Arrays.asList(
				new Coffee("Americano", 1500, Coffee.Origin.Columbia),
				new Coffee("HotChoco", 3000, Coffee.Origin.Columbia),
				new Coffee("Lattee", 2500, Coffee.Origin.Columbia),
				new Coffee("MoccaLattee", 3000, Coffee.Origin.Ethiopia),
				new Coffee("Machiatto", 3500, Coffee.Origin.Ethiopia),
				new Coffee("MilkLattee", 2500, Coffee.Origin.Ethiopia)
				);
		
		System.out.println("���ٹ� �޴���");
		paikcoffee.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(s->System.out.println(s.getMenu() + ":" + s.getPrice()));
		
		System.out.println("\n3000�� �̸� �޴�");
		
		paikcoffee.stream()
			.filter(s->s.getPrice() < 3000)
			.forEach(s->System.out.println(s.getMenu() + ":" + s.getPrice()));
		
		System.out.println("\n�ݷ��� ����");
		
		Map<Coffee.Origin, List<Coffee>> origincoffee = paikcoffee.stream()
				.collect(Collectors.groupingBy(Coffee::getOrigin));
		
		System.out.println("\n�ݷҺ�ƻ� ����");
		
		origincoffee.get(Coffee.Origin.Columbia).stream()
			.sorted()
			.forEach(s->System.out.println(s.getMenu() + ":" + s.getPrice()));
				
		System.out.println("\n��Ƽ���Ǿƻ� ����");
		
		origincoffee.get(Coffee.Origin.Ethiopia).stream()
			.sorted()
			.forEach(s->System.out.println(s.getMenu() + ":" + s.getPrice()));
		
	}

}
