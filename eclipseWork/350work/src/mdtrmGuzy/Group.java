package mdtrmGuzy;

import java.awt.List;
import java.util.ArrayList;

public class Group implements Unit{
	private String _name;
	private ArrayList<Unit> _children;
	public Group(String name){
		_name = name;
		_children = new ArrayList<Unit>();
	}
	public void add(Unit n){
		_children.add(n);
	}
	public double getYComp() {
		double groupComp = 0;
		for (Unit c:_children){
			groupComp += c.getYComp();
		}
		return groupComp;
	}
	public String toString(String input){
		return _name;
	}
	
}
