package com.bridgelabz.structuralFacade;

//Create a ShopKeeper concrete class that will use MobileShop interface.
/**Purpose: This class use Mobile Shop interface
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
public class ShopKeeper {
	
	private MobileShop iPhone;
	private MobileShop samsung;
	
	public ShopKeeper()
	{
		iPhone=new Iphone();
		samsung=new Samsung();
	}
	
	public void iPhoneSale()
	{
		// TODO Auto-generated method stub
		iPhone.modelNo();
		iPhone.price();
	}
	
	public void samsungSale() {
		// TODO Auto-generated method stub
		samsung.modelNo();
		samsung.price();
	}
}
