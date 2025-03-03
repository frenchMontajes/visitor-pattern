import java.util.*;
public class UnliCallTextPackage implements UnliCallTextOffer {
    private static Map<String, Boolean> offermap = new HashMap<>();
    static {
        offermap.put("Smart", false);
        offermap.put("Globe", true);
        offermap.put("Ditto", true);

    }
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return offermap.get(telcoName) + " ";
    }
}
