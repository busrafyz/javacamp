package coffeProject;

public class Customer implements CustomerDao {
	
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private long idCardNumber;
	
	public Customer(int id, String firstName, String lastName, int birthYear, long idCardNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.idCardNumber = idCardNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public long getIdCardNumber() {
		return idCardNumber;
	}

	public void setIdCardNumber(long idCardNumber) {
		this.idCardNumber = idCardNumber;
	}


	




	
	

}
