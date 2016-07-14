package ir.hri.bl;

public class DefaultProduct implements IProduct {
    @Override
    public String ShipFrom() {
        return "not available";
    }
}
