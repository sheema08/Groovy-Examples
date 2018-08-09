import groovy.time.TimeCategory

class Main {
   
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		println("1.Hardware Asset\n2.Software Asset\nEnter the choice:");
		int choice = Integer.parseInt(br.readLine());
		
		println("Enter the bought date:");
		Date date = new Date();
		Date licenseDate = new Date();
		String format = "";
		if(choice == 1){
			date = date.parse("dd/MM/yyy", br.readLine());
			format = "dd-MM-yyy";
			
			println("Enter expiry year:");
			int expiryYear = Integer.parseInt(br.readLine());
			use (groovy.time.TimeCategory) {
				licenseDate = date + expiryYear.year;
			}
		} else {
			date = date.parse("dd/MM/yyy", br.readLine());
			format = "dd/MM/yyy";
			
			println("Enter expiry year:");
			int expiryYear = Integer.parseInt(br.readLine());
			
			println("Enter expiry month:");
			int expiryMonth = Integer.parseInt(br.readLine());
			use (groovy.time.TimeCategory) {
				licenseDate = date + expiryYear.year+expiryMonth.months;
			}
		}
		
		println("License date:"+licenseDate.format(format));
	}
}
