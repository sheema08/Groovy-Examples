import groovy.xml.MarkupBuilder
import groovy.util.*

class Main {

	public static void main(args) {		
		def parser = new XmlParser()
		def doc = parser.parse(new File("invoice.xml"));
		
		def priceList = [];
		double price;
		
		def map = doc.children().groupBy { it.customer.text() }.each{			
			k, v ->
			v.each{
				price += Double.parseDouble(it.price.text()); 
			}
			println(k +" : "+price);
			price = 0.0;
		}		
	}
}
