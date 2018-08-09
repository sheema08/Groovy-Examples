class Main {
   
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		String addMore = "Yes";
		String search = "";
		def customerMap = [:];
		def dateMap = [:];
		String name, date;
		double price, temp = 0.0;
		while("Yes".equalsIgnoreCase(addMore)){
			temp = 0.0;
			
			println("Customer Name:");
			name = br.readLine();
			
			println("Invoice date:");
			date = br.readLine();
			
			println("Price:");
			price = Double.parseDouble(br.readLine());
						
			if(customerMap.get(name) != null)
				temp = customerMap.get(name);

			if(temp == 0.0)
				customerMap.put(name, price);
			else{
				price += temp;
				customerMap.put(name, price);
			}

			temp = 0.0;price = 0.0;
			if(dateMap.get(date) != null)
				temp = dateMap.get(date);

			if(temp == 0.0)
				dateMap.put(date, price);
			else{
				price += temp;
				dateMap.put(date, price);
			}
			
			println("Do you want to add another invoice?(Yes/No)");
			addMore = br.readLine();
		} 
		dateMap.sort();
		customerMap.sort();

		println("Total amount per customer:");
		customerMap.each{
			k,v -> println("${k} -- ${v}");
		}
		
		println("Total amount per day:");
		dateMap.each{
			k,v -> println("${k} -- ${v}");
		}
	}
}
