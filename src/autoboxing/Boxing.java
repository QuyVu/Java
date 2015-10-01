package autoboxing;

import java.util.List;

public class Boxing {

	public static int sumEven(List<Integer> li) {
		int sum = 0;
		for (Integer i : li)
			if (i % 2 == 0)
				sum += i;
		return sum;
	}
}
