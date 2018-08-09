
class Main {

	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int columns = Integer.parseInt(br.readLine());
		int type = Integer.parseInt(br.readLine());
		String[] temp = new String[2];
		String[] item = new String[type];				
		int[] total = new int[type];
		int k = 0;
		int index = 0;
		
		for(int i=0;i<type;i++){
			temp = br.readLine().split(" ");
			item[i] = temp[0];
			total[i] = Integer.parseInt(temp[1]);
			k += total[i];
		}
		String[] items = new String[k];
		for(int i=0;i<type;i++){			
			for(int j=0;j<total[i];j++){
				items[index] = item[i];
				index++;
			}
		}
		
		int rows = 0;
		rows = k/columns;
		if(k%columns !=0)
			rows++;
		
		index = 0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){	
				if(index < items.size()){			
					print(items[index]);
					index++;				
				}	
			}
			if(items.size() != index)
				println("");
		}
	}
}
