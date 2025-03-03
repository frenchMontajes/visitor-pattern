public class TelcoPromo {
    public static void main(String[] args){
        Telco smart = new Telco("Smart", 500,15,false);
        Telco globe = new Telco("Globe", 450, 10,true);
        Telco ditto = new Telco("Ditto", 400, 8,true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo, smart.getDateAllowance()) + " for " + smart.getPromoPrice() + " pesos");
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo, globe.getDateAllowance()) + " for " + smart.getPromoPrice() + " pesos");
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo, ditto.getDateAllowance()) + " for " + smart.getPromoPrice() + " pesos");

        System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli, smart.isUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli, globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + ditto.accept(unli, ditto.getUnliCallText()));
    }
}
