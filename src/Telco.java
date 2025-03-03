public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private Integer dateAllowance;
    private boolean unliCallText;

    public Telco (String telcoName, double price, Integer dateAllowance, boolean unliCallText){
        this.telcoName = telcoName;
        this.dateAllowance = dateAllowance;
        this.promoPrice = price;
        this.unliCallText = unliCallText;
    }


    @Override
    public String accept(UsagePromo promo, Integer dateAllowance) {
        this.dateAllowance = dateAllowance;
        return promo.showAllowance(telcoName, dateAllowance);
    }

    @Override
    public String accept(UnliCallTextOffer unliPackage, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText) ;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public Integer getDateAllowance() {
        return dateAllowance;
    }

    public void setDateAllowance(int dateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }
    public double getPromoPrice() {
        return promoPrice;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }



}
