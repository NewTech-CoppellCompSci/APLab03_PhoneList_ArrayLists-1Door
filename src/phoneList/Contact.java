package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods	
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */

public class Contact {

	private int phone;
	private String name;

	public Contact(String name, int phone) {

		this.phone = phone;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Name: " + name 
			 + "\nPhone: " + phone;

	}

}
