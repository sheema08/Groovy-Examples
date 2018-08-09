import groovy.xml.MarkupBuilder
import groovy.util.*

class Main1 {

	public static void main(args) {		
		def parser = new XmlParser()
		def doc = parser.parse(new File("invoice.xml"));
		
		String name, tempName;
		double price;
		
		def names = doc.invoice.collect{
			it.customer.text();
		};
		def countMap = names.unique(false).collect{
			it;
		}
		def pricesList;
		
		for(int i=0;i<countMap.size();i++){
			tempName = countMap.get(i);
			price = 0;
			pricesList = doc.invoice.findAll{
				node->
				tempName == node.customer.text()
			}.collect{
				it.price.text();
			};
			pricesList.each{
				price += Double.parseDouble(it);
			}
			println(tempName +" : "+price);
		}
	}
}
