import java.util.List;

public abstract class Store {
    String nameOfDirector;
    List<String> address;

    Store(String nameOfDirector) {
        this.nameOfDirector=nameOfDirector;
    }

    public String getNameOfDirector() {
        return nameOfDirector;
    }

    public void setNameOfDirector(String nameOfDirector) {
        this.nameOfDirector = nameOfDirector;
    }

    public List<String> getAddress() {
        return address;
    }

    abstract void getSlogan();
}
