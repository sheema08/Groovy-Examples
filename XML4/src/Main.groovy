import groovy.xml.MarkupBuilder
import groovy.util.*

class Main {

	public static void main(args) {		
		def parser = new XmlParser();
		def assetXml = parser.parse("asset.xml");
		def logXml = parser.parse("log.xml");
		def userXml = parser.parse("user.xml");
		
		String assetName, assetId, userName, userId, date;
		
		logXml.log.each{
			
			assetId = it.assetid.text();	
			userId = it.userid.text();
			date = it.date.text();
			
			assetName = assetXml.asset.find{it.id.text() == assetId}.name.text();
			
			userName = userXml.user.find{it.id.text() == userId}.name.text();
			
			println(assetName +" with asset id "+assetId +" is assigned to "+userName +" with user id "+userId+" at "+date);					
		}
	}
}
