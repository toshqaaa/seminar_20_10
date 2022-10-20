import java.util.ArrayList;
import java.util.List;

public class ProductStore extends Store implements Communication{

    ProductStore(String nameOfDirector) {
        super(nameOfDirector);
    }

    @Override
    void getSlogan() {
        System.out.println("Самый сок");
    }

    @Override
    public void welcome() {
        System.out.println("Добро пожаловать в продуктовый магазин");
    }
}
