class Main {
   
	public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		Asset asset = null;
		
		String addMore = "Yes";
		String search = "";
		List assetList = [];
		List assetNoList = [];
		while("Yes".equalsIgnoreCase(addMore)){
			asset = new Asset();
			
			println("Asset name:");
			asset.setName(br.readLine());
			
			println("Asset number:");
			asset.setAssetNumber(Integer.parseInt(br.readLine()).toString());
			
			println("Asset model:");
			asset.setModel(br.readLine());
			
			println("Assigned date:");
			asset.setLastAssignedDate(br.readLine());
			
			println("Price:");
			asset.setPrice(br.readLine());		
			
			assetList.add(asset);
						
			println("Do you want to continue?(Yes/No)");
			addMore = br.readLine();
		}

		assetList.each{
			println it;
		}

	}
}
