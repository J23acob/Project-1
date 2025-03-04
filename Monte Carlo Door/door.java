public class door {
    private boolean hasCar;
    private String name;

    public door(String name) {
        this.hasCar = false;
        this.name = name;
    }

    public void setCar() {
        this.hasCar = true;
    }

    public boolean hasCar() {
        return hasCar;
    }

    public String getName() {
        return name;
    }
}
