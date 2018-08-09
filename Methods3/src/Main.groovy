class Main {
   
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		println("1.First admin\n2.Second admin\n3.Third admin\nEnter the choice:");
		int choice = Integer.parseInt(br.readLine());
		
		Asset asset = new Asset();
		if(1 == choice){
			println("Asset number:");
			asset.setAssetNumber(Integer.parseInt(br.readLine()).toString());
			
			println("Assigned date:");
			asset.setLastAssignedDate(br.readLine());
			
			println("Price:");
			asset.setPrice(br.readLine());			
		} else if(2 == choice){
			println("Asset name:");
			asset.setName(br.readLine());
			
			println("Assigned date:");
			asset.setLastAssignedDate(br.readLine());
			
			println("Price:");
			asset.setPrice(br.readLine());
		} else {
			if(3 == choice){
				println("Asset model:");
				asset.setModel(br.readLine());
				println("Assigned date:");
				asset.setLastAssignedDate(br.readLine());
				println("Price:");
				asset.setPrice(br.readLine());
			}
		}
		println(asset);
		
	}
}
