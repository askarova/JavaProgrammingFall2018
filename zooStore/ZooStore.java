package zooStore;

public class ZooStore {
	public static void main(String []args) {
	
	Animal[] animalList = new Animal[3];
	
	
	Animal dog = new Animal();
	Animal cat = new Animal();
	Animal horse = new Animal();
	
	dog.setName("Bethovin");
	dog.setWeight(120);
	dog.setColor("Pink");
	
	cat.setName("pasha");
	cat.setWeight(150);
	cat.setColor("Orange");
	
	horse.setName("bigfoot");
	horse.setWeight(300);
	horse.setColor("rainbow");
	
	animalList[0] = dog;
	animalList[1] = cat;
	animalList[2] = horse;
	
	//from animalList print animal name who's color starts with "r"
	
	for(int i=0; i<animalList.length; i++) {
	  if(animalList[i].getColor().substring(0, 1).equals("r")) 
	System.out.println(animalList[i].getName());
	    
	 }
 //second element 
	 
}
}