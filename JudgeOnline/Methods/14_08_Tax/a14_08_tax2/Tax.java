package a14_08_tax2;

public class Tax {

    public static final float TAX = 21.0f;

    public static float tax(float price) {
        float result = price * (TAX / 100);
        return result;
    }

    public static float priceWithTax(float price) {
        float result = price + tax(price);
        return result;
    }

    public static float getTaxFromPrice(float price) {
        // It is like if the total represented 100 + TAX rather than just 100. It represents the original 100% plus the tax
        float total = 100 + TAX;
        float result = price * (TAX / total);
        return result;
    }

}
