public class Banana extends Fruits {
    private String vitamin;

    public Banana(String vitamin) {
        super("sweet","Верна,Салустиана,Гамлин","yellow");
        this.vitamin = vitamin;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "vitamin='" + vitamin + '\'' +
                '}';
    }
}