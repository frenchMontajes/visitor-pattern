public interface TelcoSubscription {
    String accept(UsagePromo promo, Integer dateAllowance);
    String accept(UnliCallTextOffer unliPackage, boolean unliCallText);
}
