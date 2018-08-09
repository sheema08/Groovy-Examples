
class Main {

	public static void main(args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		println("Enter the number of items:");
		int noOfItems = Integer.parseInt(br.readLine());
		String str = "";
		
		for(int i=1;i<=noOfItems;i++){
			println("Enter item "+i+" details:");
			str = str +br.readLine()+",";
			str = str +Double.parseDouble(br.readLine())+",";
			str = str +br.readLine()+"\n";
		}
		File file = new File("output.txt");
		file.write(str);	
	}
}
