package stream;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String... args) {
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH));

		//List<String> threeHighCaloricDishNames =
		long count = menu.stream().filter(dish -> dish.getCalories() > 400).map
				(Dish::getName).limit(3).count();


		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> pairs =
				numbers1.stream()
						.flatMap(i -> numbers2.stream()
										.map(j -> new int[]{i, j})
						)
						.filter(i -> (i[0] + i[1])%3 ==0 )
						.collect(toList());

		//System.out.print(pairs);
		pairs.stream().forEach(i -> System.out.println(i[0] + " " + i[1]));
	}
}
