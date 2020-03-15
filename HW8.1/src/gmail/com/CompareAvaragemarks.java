package gmail.com;

import java.util.Comparator;

public class CompareAvaragemarks implements Comparator<Object> {
	
	@Override
	public int compare(Object obj1, Object obj2) {
		Student a = (Student) obj1;
		Student b = (Student) obj2;
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a.getAverageRating() > b.getAverageRating()) {
			return 1;
		}
		if (a.getAverageRating() < b.getAverageRating()) {
			return -1;
		}
		return 0;
	}
}
