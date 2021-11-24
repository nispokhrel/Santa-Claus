package santaClaus;
/**
 * @author NPokhrel
 */

public class Name {
	private String first; // indicates first name of the person
	private String last; // indicates last name of the person

	public Name() {
		first = "";
		last = "";

	}// end default constructor

	public Name(String fName, String lName) {
		first = fName;
		last = lName;
	}// end constructor

	public void setName(String fName, String lName) {
		setFirst(fName);
		setLast(lName);
	}

	public String getName() {
		return toString();
	}

	public void setFirst(String fName) {
		first = fName;
	}

	public String getFirst() {
		return first;
	}

	public void setLast(String lName) {
		last = lName;
	}

	public String getLast() {
		return last;
	}

	public void giveLastNameTo(Name aName) {
		aName.setLast(last);
	}

	public String toString() {
		return first + " " + last;
	}

}//end
