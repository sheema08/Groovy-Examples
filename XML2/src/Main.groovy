import groovy.xml.MarkupBuilder

class Main {

	public static void main(args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		println("Enter the total number of invoices:");
		int count = Integer.parseInt(br.readLine());
		
		int invoiceNo = 0;
		double invoicePrice = 0.0;
		String invoiceDate = "";
		String name = "";
		
		def fileWriter = new FileWriter("invoice.xml")
		def invoiceBuilder = new MarkupBuilder(fileWriter);
		invoiceBuilder.invoices{
			for(int i=1;i<=count;i++){
				println("Enter the invoice "+i+" details:");
				invoiceNo = Integer.parseInt(br.readLine());
				invoicePrice = Double.parseDouble(br.readLine());
				invoiceDate = br.readLine();
				name = br.readLine();
				
				invoice(number:invoiceNo) {
					price(invoicePrice)
					date(invoiceDate)
					customer(name)
				}
			}
		}
		
		fileWriter.close();
	}
}
