class Main {
   
    public static void main(args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		Asset asset = null;
		
		String addMore = "Yes";
		String search = "";
		List assetList = [];
		while("Yes".equalsIgnoreCase(addMore)){
			asset = new Asset();
			
			println("Enter the asset details:");
			asset.setName(br.readLine());
			asset.setAssetNumber(br.readLine());
			asset.setAssigneeName(br.readLine());
			asset.setAssignedDate(br.readLine());	
			
			assetList.add(asset);
						
			println "Do you want to continue(yes/no)";
			addMore = br.readLine();
		} 
		
		println "Enter the asset type:";
		search = br.readLine();
		
		println "Asserts with type $search :";

		assetList.findAll{
			search.equalsIgnoreCase(it.name)
		}.collect {
			println it.assetNumber;
		}
	}
}
