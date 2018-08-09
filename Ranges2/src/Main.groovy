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
			invoice.setPrice(Double.parseDouble(br.readLine()).toString());
			
			println("Customer Name:");
			invoice.setCustomer(br.readLine());		
			
			invoiceList.add(invoice);
						
			println("Do you want to continue?(Yes/No)");
			addMore = br.readLine();
		}

		println("Enter the invoice number:");
		invoiceNo = br.readLine();
		
		
		invoiceList.collect{
			if(invoiceNo.equalsIgnoreCase(it.invoiceNumber))
				println(it);
		}
		
		println("Enter the customer name:");
		customerName = br.readLine();
		invoiceList.collect{
			if(customerName.equalsIgnoreCase(it.customer))
				println(it);
		}
	}
}
