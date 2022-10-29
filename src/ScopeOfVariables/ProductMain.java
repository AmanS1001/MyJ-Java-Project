package ScopeOfVariables;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDetails laptop = new ProductDetails("HP", 800);
		ProductDetails monitor = new ProductDetails("BenQ", 230);
		ProductDetails mouse = new ProductDetails("Microsoft", 24);
		ProductDetails keyboard = new ProductDetails("Microsoft", 32);

//ProductDetails[] products = {laptop,monitor,mouse,keyboard};
//double laptopPrice = laptop.calculatePriceAfterTaxes("Promo150");
//double monitorPrice =monitor.calculatePriceAfterTaxes("Promo50");
//double mousePrice = mouse.calculatePriceAfterTaxes("Promo5");
//double keyboardPrice = keyboard.calculatePriceAfterTaxes("Promo5");
//
////System.out.println("Monitor Price: "+monitorPrice);
////System.out.println("Laptop Price: "+laptopPrice);
////System.out.println("Mouse Price: "+mousePrice);
////System.out.println("Keyboard Price: "+keyboardPrice);
//System.out.println("Laptop Name: "+laptop.productName);
//
////System.out.println("Monitor Price: "+monitor.calculatePriceAfterTaxes("Promo50")+"$");
////System.out.println("Laptop Price: "+laptop.calculatePriceAfterTaxes("Promo150")+"$");
//
//laptop.productName = "Dell";
//laptop.productPrice = 750;
//
//System.out.println("Laptop Name: "+ laptop.productName);

		laptop.setproductPrice(600);
		laptop.getProductPrice();
	}

}
