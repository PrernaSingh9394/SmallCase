package testcases;

public class MainPage {

	public static void main(String[] args) throws NumberFormatException, InterruptedException 
	{
		AmazonPage amaz=new AmazonPage();
				
		String amazon_Price=amaz.amazonGetPrice().trim();
		
		System.out.println("Price of the Product present in Amazon Cart is :"+amazon_Price);
		
		amaz.browserQuit1();
		
		FlipkartPage flip=new FlipkartPage();
		
		String flip_Price=flip.flipkartGetPrice();
		
		System.out.println("Price of the Product present in Flipkart Cart is :"+flip_Price);
		
		flip.browserQuit();
		
		if(Double.parseDouble(amazon_Price)>Double.parseDouble(flip_Price))
		{
			System.out.println("Product Price is cheaper in Flipkart");
		}
		else
		{
			System.out.println("Product Price is cheaper in Amazon");
		}
		
	
		
	}

}
