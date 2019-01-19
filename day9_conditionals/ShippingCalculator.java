package day9_conditionals;

public class ShippingCalculator {
public static void main(String[]args) {
	

	
	//  price, ,speed
	// regular shipping rates:
	// purchase price     cost
	// 1-100              $17
	// 101-300            $10
	// 300 +        free shipping
	//
	//Express Shipping rates:
	// price                cost
	// 1-100				$35
	//101-300				$25
	//300 +					$15
	
	int shippingMode=2; //1- regular, 2=express
	double purchasePrice =500;
	double shippingCost=0;
			
	if(shippingMode==1) {
		System.out.println("---REGULAR SHIPPING SELECTED---");
		if(purchasePrice>= 1.0 && purchasePrice<= 100.0) {
			shippingCost =17.0;
			
		}else if(purchasePrice >101.0 && purchasePrice <= 300) {
			shippingCost=10.0;
		}else if(purchasePrice >300.0) {
			shippingCost=0.0;
		}
	}else if(shippingMode==2) {
		
			System.out.println("---EXPRESS SHIPPING SELECTED---");
			if(purchasePrice>= 1.0 && purchasePrice<= 100.0) {
				shippingCost =35.0;
				
			}else if(purchasePrice >101.0 && purchasePrice <= 300) {
				shippingCost=25.0;
			}else if(purchasePrice >300.0) {
				shippingCost=15.0;
			}
		
		System.out.println("Total shipping cost: " +shippingCost);
		

			}
	}
}


	
		
		
		
	



