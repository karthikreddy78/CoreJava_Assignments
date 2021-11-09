package CollectionsAssignment;

import java.util.Comparator;

public class EmployeeSalComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Long.compare(o1.getSal(), o2.getSal());
	}

}
