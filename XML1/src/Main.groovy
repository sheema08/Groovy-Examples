import groovy.xml.MarkupBuilder
import groovy.util.*

class Main {

	public static void main(args) {		
		def parser = new XmlParser()
		def doc = parser.parse("asset.xml");
		
		doc.asset.each{
			bk->
			print("Asset Id: ")
			println "${bk['@id']}"
			   
			print("Category: ")
			println "${bk.category[0].text()}"
			
			print("Price: ")
			println "${bk.price[0].text()}"
			
			print("Status: ")
			println "${bk.status[0].text()}"
		}
	}
}
