package gmail.com;

import java.util.Comparator;

public class BallSizeCorparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 != null && o2 == null) {
			return 1;
		}
		if (o1 == null && o2 != null) {
			return -1;
		}
		if (o1 == null && o2 == null) {
			return 0;
		}
		Ball a = (Ball) o1;
		Ball b = (Ball) o2;

		if (a.getSize() > b.getSize()) {
			return 1;
		}
		if (a.getSize() < b.getSize()) {
			return -1;
		}
		return 0;
	}
}
