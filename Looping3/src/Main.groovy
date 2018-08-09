class Main {

    public static void main(args) {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		float[] temp = new float[count];
		float max = 0;
		for(int i=0;i<count;i++){
			temp[i] = Float.parseFloat(br.readLine());
		}
		
		max = temp[0];
        for(int i=1;i<count;i++){
            if(temp[i]>max)
				max = temp[i];
        }
		println(max);
		float creditLimit = max + ((1.5*max)/100);
		println(creditLimit);
		
	}
}
