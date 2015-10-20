package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apples {

	public static void main(String... args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"),
				new Apple(155, "green"),
				new Apple(120, "red"));
		List<Apple> heavyApples =
				filterApples(inventory, new AppleHeavyWeightPredicate());
		List<Apple> greenApples =
				filterApples(inventory, new AppleGreenColorPredicate());
	}

	public static List<Apple> filterApples(List<Apple> inventory,
										   quiz.ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory){
			if (p.test(apple)){
				result.add(apple);
			}
		}
		return result;
	}
}
