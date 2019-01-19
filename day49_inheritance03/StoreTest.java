package day49_inheritance03;

public class StoreTest {
    public static void main(String[] args) {
        //how many ways to create Store objects?
        //3 ways:
        //Store store1 = new Store(); <== not good. No defalt constructor
        Store store1 = new Store("Grocery");
        Store store2 = new Store(10000.0);
        Store store3 = new Store("Computer Store", 5123.56);
        
        System.out.println("=========PETSMART OBJECTS=======");
        
        PetSmart petSmart1 = new PetSmart();
        
        System.out.println("=====PETSMART WITH RENT OBJECT CREATION====");
        PetSmart petSmart2 = new PetSmart(12432.45);
        
        System.out.println("Petsmart1 type: " + petSmart1.getType());
        System.out.println("Petsmart2 type: " + petSmart2.getType());
        
        System.out.println("Petsmart1 rent: " + petSmart1.getRent());
        System.out.println("Petsmart2 rent: " + petSmart2.getRent());
        
        
    }
}

