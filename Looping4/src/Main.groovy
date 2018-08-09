class Main {

    public static void main(args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	double cost = Double.parseDouble(br.readLine());
		int depreciationPer = Integer.parseInt(br.readLine());
		int life = Integer.parseInt(br.readLine());
		println(cost);
	
		int i=life-1;
        
		for(;i>0;i--){
			cost = cost - ((cost*depreciationPer)/100);
			println(cost.round(2));
		}		
	}
}
