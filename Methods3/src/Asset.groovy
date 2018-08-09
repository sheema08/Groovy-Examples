import java.text.DecimalFormat

class Asset {
	String name;
	String assetNumber;
	String model;
	String lastAssignedDate;
	String price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLastAssignedDate() {
		return lastAssignedDate;
	}

	public void setLastAssignedDate(String lastAssignedDate) {
		this.lastAssignedDate = lastAssignedDate.replaceAll("/", "-");
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String toString(){
		DecimalFormat df = new DecimalFormat("#.0#");
		return "Asset.No : "+getAssetNumber() +" | Name : "+getName()+" | Model : "+getModel()+" | Last Assigned Date : "+getLastAssignedDate()+" | Price : "+df.format(Double.parseDouble(getPrice()));
	}
	
}
