package fcu.iecs.hw1;

public class HW1 {

	public static void main(String[] args) {
		String lryics = "Let it go! Let it go! Cannot hold it back anymore";
		
		String temp = new String(lryics.replaceAll("it","her"));
		String lryic = new String(temp.replaceAll("Cannot","Can't"));
		System.out.println(lryic);

	}

}
