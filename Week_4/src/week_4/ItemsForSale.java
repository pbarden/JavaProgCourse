/*
 * No license; For PRG215
 * at University of Phoenix
 */
package week_4;

/**
 *
 * @author Dennis Paul Barden
 */
public class ItemsForSale {
    public String itemName;
    public double itemCost;
    public boolean taxable;

    public void PopulateItem(String iName, double iCost, boolean canTax)
    {
        this.itemName = iName;
        this.itemCost = iCost;
        this.taxable = canTax;
    }
}
