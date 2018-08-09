import groovy.xml.MarkupBuilder
import groovy.util.*

class Main3 {

	public static void main(args) {		
		def parser = new XmlParser()
		def doc = parser.parse(new File("invoice.xml"));
		
		def priceList = [];
		double price;
		
		def names = doc.invoice.collect{
			it.customer.text();
		};
		def countMap = names.unique(false).collect{
			it;
		}
		
		countMap.each{
			count->
			priceList = doc.invoice.findAll{
				count == it.customer.text()			
			}.collect{
				it.price.text();	
			}
			price = 0;
			priceList.each{
				price += Double.parseDouble(it);
			}
			println(count + " : "+ price);
		}
		
	}
}
