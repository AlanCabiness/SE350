package hw3;

import java.util.ArrayList;

//Composition
public class StringCollection{
	final private ArrayList<String> og;
	public StringCollection() { og = new ArrayList<String>();}
	public boolean contains (String s){
		for (String item : og){
			if (item==s){
				return true;
			}
		}
		return false;
	}
	public void add(String s) {og.add(s);}
	public void remove(String s) {og.remove(s);}
}


//Inheritance
/*
public class StringCollection  extends ArrayList<String>{
	public boolean contains (String s){
		for (String item : this){
			if (item==s){
				return true;
			}
		}
		return false;
	}
	public void Add (String s){
		this.add(s);
	}
	public void Remove (String s){
		this.remove(s);
	}
}
*/
