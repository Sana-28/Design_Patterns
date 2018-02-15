package com.bridgelabz.behavioralVisitor;

/**Purpose: This class contains main method to test Visitor Pattern
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
class ShoppingCartClient 
{
    public static void main(String[] args) 
    {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
  
        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }
  
    /**This method is to calculate the price of all items
     * @param items
     * @return
     */
    private static int calculatePrice(ItemElement[] items) 
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
  
}