class Main {

	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		println("Enter the number of items:");
		int price = 0;
		int quantity = 0;
		int tax = 0;
		double total = 0.0;
		int no = Integer.parseInt(br.readLine());
		for(int i=1;i<=no;i++){
			println("Enter Asset"+ i +"detail:");
			println("Price:");
			price = Integer.parseInt(br.readLine());
			println("Quantity:");
			quantity = Integer.parseInt(br.readLine());
			println("Tax percentage:");
			tax = Integer.parseInt(br.readLine());
			total += (price*quantity)+((price*quantity*tax)/100);
		}
		println("Total amount to be paid "+total.round(2));
	}
}
