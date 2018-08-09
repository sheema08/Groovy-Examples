import groovy.time.TimeCategory

class Main {
   
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		println("1.Student Form\n2.Faculty Form\nEnter the choice:");
		int choice = Integer.parseInt(br.readLine());
		
		Date date = new Date();
		String format = "dd-MM-yyy";
		Customer customer = Customer.constructCustomerObject();
		if(choice == 1){			
			println("Firstname:");			
			customer.setFirstName(br.readLine());
			
			println("Date of birth:");
			date = date.parse("dd/MM/yyy", br.readLine());	
			customer.setDateOfBirth(date.format(format));
			
			println("Contact number:");
			customer.setContactNumber(br.readLine());
		} else {
			println("Firstname:");			
			customer.setFirstName(br.readLine());
			
			println("Lastname:");
			customer.setLastName(br.readLine());
			
			println("Email:");
			customer.setEmail(br.readLine());
			
			println("Date of birth:");
			date = date.parse("dd/MM/yyy", br.readLine());	
			customer.setDateOfBirth(date.format(format));
			
			println("Contact number");
			customer.setContactNumber(br.readLine());
		}
		
		println(customer);
	}
}
