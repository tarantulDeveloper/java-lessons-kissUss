package task_7;

public abstract class Flower {
    private int freshness;
    private int price;
    private double stemLength;

    public Flower(int freshness, int price, double stemLength) {
        this.freshness = freshness;
        this.price = price;
        this.stemLength = stemLength;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getStemLength() {
        return stemLength;
    }

    public void setStemLength(double stemLength) {
        this.stemLength = stemLength;
    }

    public String toString() {
        return "Freshness is " + freshness + " days, stem length is " + stemLength +"cm, price is " + price + "som";
    }
}
