package com.bridgelabz.behavioralVisitor;

/**Purpose: This class is to define methods
 * of Interface Shopping Cart Visitor
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
interface ShoppingCartVisitor 
{
  
    int visit(Book book);
    int visit(Fruit fruit);
}