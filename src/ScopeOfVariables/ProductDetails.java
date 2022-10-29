package ScopeOfVariables;

public class ProductDetails {
private String productName;
private double productPrice;
private String promoCode;

public ProductDetails(String prodName,double prodPrice) {
	productName = prodName;
	productPrice = prodPrice;
}
double calculatePriceAfterTaxes(String promoCode) {
	switch (promoCode) {
	case "Promo5":
		productPrice =productPrice - 5;
		break;
	case "Promo150":
		productPrice =productPrice - 150;
		break;
	case "Promo50":
		productPrice =productPrice - 50;
		break;
		default:
			System.out.println("Please enter a correct PromoCode");
		break;
	}
	double finalPrice = productPrice + (productPrice*0.10);
	return finalPrice;
}
void setproductPrice(double newPrice) {
	if(newPrice>400) {
		productPrice = newPrice;
	}
	else {
		System.out.println("Cannot set price below $400");
		
	}
}
void getProductPrice() {
	System.out.println("Product Price: "+productPrice);
}
}
