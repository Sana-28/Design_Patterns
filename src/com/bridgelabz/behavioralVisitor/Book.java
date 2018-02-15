package com.bridgelabz.behavioralVisitor;

/**Purpose: This class is to implement methods
 * of Interface Item element 
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
class Book implements ItemElement
{
    private int price;
    private String isbnNumber;
  
    public Book(int cost, String isbn)
    {
        this.price=cost;
        this.isbnNumber=isbn;
    }
  
    public int getPrice() 
    {
        return price;
    }
  
    public String getIsbnNumber() 
    {
        return isbnNumber;
    }
  
    @Override
    public int accept(ShoppingCartVisitor visitor) 
    {
        return visitor.visit(this);
    }
  
}