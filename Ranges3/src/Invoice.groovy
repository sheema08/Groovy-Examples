
class Invoice {
	String invoiceNumber;
	String invoiceDate;
	double price;
	String customer;
	
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate.replaceAll("/", "-");
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public String toString(){
		return String.format("Invoice Number : "+getInvoiceNumber()+" | Date : "+getInvoiceDate()+" | Price : "+getPrice()+" | Customer Name : "+getCustomer());
	}
}
