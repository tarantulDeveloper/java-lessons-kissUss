package task_7;
public abstract class Accessory {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Accessory(int price) {
        this.price = price;
    }
}

