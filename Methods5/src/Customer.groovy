
class Customer {
	String firstName;
	String lastName;
	String email;
	String dateOfBirth;
	String contactNumber;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public static Customer constructCustomerObject(){
		return new Customer();
	}
	public String toString(){
		String str = "Firstname : "+getFirstName()+" | Lastname : "+ getLastName()+" | Email : "+getEmail()+" | Date of birth : "+getDateOfBirth()+" | Contact number : "+getContactNumber();
		return str;
	}
}
