class Main {
   
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		Invoice invoice = null;
		
		String addMore = "Yes";
		String invoiceNo = "";
		String customerName = "";
		List invoiceList = [];
		
		while("Yes".equalsIgnoreCase(addMore)){
			invoice = new Invoice();
			
			println("Invoice Number:");
			invoice.setInvoiceNumber(Integer.parseInt(br.readLine()).toString());
			
			println("Invoice Date:");
			invoice.setInvoiceDate(br.readLine());
			
			println("Price:");
			invoice.setPrice(Double.parseDouble(br.readLine()));
			
			println("Customer Name:");
			invoice.setCustomer(br.readLine());		
			
			invoiceList.add(invoice);
						
			println("Do you want to continue?(Yes/No)");
			addMore = br.readLine();
		}

		invoiceList.sort{x, y-> -(x.price<=>y.price)?:(x.customer<=>y.customer)};
		invoiceList.each{
			println(it);
		}
		/*for(int i=0;invoiceList.size();i++){
			println(invoiceList.get(i));
		}*/
	}
}
