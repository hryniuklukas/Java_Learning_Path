package park;

public class Vehicle implements Identification {
    String numberPlates;
    @Override
    public String returnNumberPlates() {
        return numberPlates;
    }
}
