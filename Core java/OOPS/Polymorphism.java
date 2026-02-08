interface Discount {

    void calculateDiscount(double amount);

    void validateCoupon(boolean couponApplied);

    void applyFinalPrice(double amount, boolean couponApplied);
}


class RegularCustomer implements Discount {

    @Override
    public void calculateDiscount(double amount) {
        System.out.println("Regular discount applied");
    }

    @Override
    public void validateCoupon(boolean couponApplied) {
        if (couponApplied) {
            System.out.println("Coupon validated");
        }
    }

    @Override
    public void applyFinalPrice(double amount, boolean couponApplied) {
        System.out.println("Final payable amount calculated and shown");
    }
}


class PremiumCustomer implements Discount {

    @Override
    public void calculateDiscount(double amount) {
        System.out.println("Premium discount applied");
    }

    @Override
    public void validateCoupon(boolean couponApplied) {
        if (couponApplied) {
            System.out.println("Additional coupon discount applied");
        }
    }

    @Override
    public void applyFinalPrice(double amount, boolean couponApplied) {
        System.out.println("Final payable amount calculated and shown");
    }
}


class CorporateCustomer implements Discount {

    @Override
    public void calculateDiscount(double amount) {
        System.out.println("Corporate discount applied");
    }

    @Override
    public void validateCoupon(boolean couponApplied) {
        if (couponApplied) {
            System.out.println("Corporate coupon discount applied");
        }
    }

    @Override
    public void applyFinalPrice(double amount, boolean couponApplied) {
        System.out.println("Final payable amount calculated and shown");
    }
}


public class Polymorphism {

    public static void main(String[] args) {

        Discount discount = new PremiumCustomer();
        double orderAmount = 10000;
        boolean couponApplied = true;

        discount.calculateDiscount(orderAmount);
        discount.validateCoupon(couponApplied);
        discount.applyFinalPrice(orderAmount, couponApplied);
    }
}
