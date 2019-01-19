package day48_inheritance02_super;

public class testBin {
	public static void main(String[]args) {
		
		Bin yourBin= new Bin();
		System.out.println(yourBin.toString());
		
		yourBin.add("book");
		yourBin.add("notebook");
		yourBin.add("iPad");
		
		System.out.println(yourBin.toString());
		
		yourBin.remove("book");
		System.out.println(yourBin.toString());
		
		
		RecycleBin rBin= new RecycleBin();
			rBin.add("Bottle");
			System.out.println(rBin);
			
		}
		
	}


