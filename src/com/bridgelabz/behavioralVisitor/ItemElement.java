package com.bridgelabz.behavioralVisitor;

/**Purpose: This class is to define methods
 * of Interface Item Element
 * @author SANa SHAiKH
 * @since 13/01/2018
 */
interface ItemElement
{
    public int accept(ShoppingCartVisitor visitor);
}