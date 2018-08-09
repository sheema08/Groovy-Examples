class Main {
    static void display(double price){
		print("The amount is "+price);
	}
	static double convert(double price, int conversionRate = 60){
		return (price*conversionRate);
	}
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		println("Enter the price:");
		double price = Double.parseDouble(br.readLine());
		int conversionRate = 0;
		println("1.Custom Conversion\n2.Default Conversion\nEnter the choice:");
		int choice = Integer.parseInt(br.readLine());
       
		if(1 == choice){
			println("Enter the conversion rate:");
			conversionRate = Integer.parseInt(br.readLine());
			price = convert(price, conversionRate);
		} else
			price = convert(price);
		
		display(price);	
	}
}
