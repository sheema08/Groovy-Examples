
class Main {

	public static void main(args) {		
		
		File file = new File("assetdetails.csv");
		String[] str = (file.text).split("\n");
		String[] temp = new String[4];
		for(int i=0;i<str.length;i++){
			temp = str[i].split(",");
			println(temp[1]+" with asset number "+temp[0]+" is assigned to "+temp[2] +" at "+temp[3]);
		}
	}
}
