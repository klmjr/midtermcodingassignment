package Exception;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	
	Person p;
	
	public PersonException(Person p) {
		super();
		this.p = p;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

}
