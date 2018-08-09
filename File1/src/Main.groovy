
class Main {

	public static void main(args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fileName = br.readLine();
		
		File file = new File(fileName);
		String s = file.text;
		println(s);		
	}
}
