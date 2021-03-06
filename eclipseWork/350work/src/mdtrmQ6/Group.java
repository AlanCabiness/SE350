package mdtrmQ6;

import java.util.ArrayList;
import java.util.List;

/** A group of people and/or sub-groups. */

public class Group implements Unit {
	private String _name; // Name of the group
	private List<Unit> _children; // People or sub-groups

	public Group(String name) {
		_name = name;
		_children = new ArrayList<Unit>();
	}

	public void add(Unit n) {
		_children.add(n);
	}

	public double getYComp() {
		double sum = 0;
		for (Unit c : _children) {
				sum += c.getYComp();
				System.out.println(c);
		}
		return sum;
	}

	public String toString() {
		return _name;
	}
}