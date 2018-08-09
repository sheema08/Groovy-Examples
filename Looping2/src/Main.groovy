import java.text.DecimalFormat


class Main {

    public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] temp = new String[2];
		float total = 0;
		for(int i=0;i<count;i++){
			temp = br.readLine().split(" ");
			total += (Float.parseFloat(temp[0]) * Integer.parseInt(temp[1]));
		}
		DecimalFormat df = new DecimalFormat("#.00");
		float tax = (total * Float.parseFloat(br.readLine()))/100;
		
		total += tax;
		println(df.format(total));
	}
}
