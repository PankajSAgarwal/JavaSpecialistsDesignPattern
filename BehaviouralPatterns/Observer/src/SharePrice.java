

public class SharePrice {
    private final String share;
    private final double price;

    public SharePrice(String share, double price) {
        this.share = share;
        this.price = price;
    }

    public String getShare() {
        return share;
    }

    public double getPrice() {
        return price;
    }
}
