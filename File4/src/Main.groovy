
class Main {

	public static void main(args) {		
		
		File file = new File("asset.csv");
		String[] str = (file.text).split("\n");
		String[] temp = new String[4];
		String hardware = "";
		String software = "";
		File hardwareFile = new File("hardware.csv");
		File softwareFile = new File("software.csv");
		file.eachLine{
			temp = it.split(",");
			if("hardware".equals(temp[3]))
				hardware += temp[0]+","+temp[1]+","+temp[2]+"\n";
			else
				software += temp[0]+","+temp[1]+","+temp[2]+"\n";
		}
		hardwareFile.write(hardware);
		softwareFile.write(software);
	}
}
