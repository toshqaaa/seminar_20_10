import java.util.List;

public class HouseholdStore extends Store implements Seller{
    private int count;

    public HouseholdStore(String nameOfDirector, int count) {
        super(nameOfDirector);
        this.count=count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    void getSlogan() {
        System.out.println("Лучшие бытовые товары в ваших районах");
    }

    @Override
    public void welcome() {
        System.out.println("Добро пожаловать в магазин бытовых товаров");
    }
}
