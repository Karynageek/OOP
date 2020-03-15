package gmail.com;
import java.util.Comparator;
public class CompareSurname implements Comparator<Object> {
	public CompareSurname() {
		super();
	}
	@Override
	public int compare(Object obj1, Object obj2) {
		if (obj1 == obj2) {
			return 0;
		}
		if (obj1 == null) {
			return -1;
		}
		if (obj2 == null) {
			return 1;
		}
		Student a = (Student) obj1;
		Student b = (Student) obj2;
		return (a.getSurname().compareTo(b.getSurname()));
	}
}

