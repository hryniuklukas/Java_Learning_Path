package flightSearch;

public class Flight {
  String departure;
  String arrival;
  double price;

  public Flight(String departure, String arrival, double price) {
    this.departure = departure;
    this.arrival = arrival;
    this.price = price;
  }

  public void returnValues() {
    System.out.println("Flight from " + this.departure + " to " + this.arrival);
  }

  public void changePrice(int percent) {
    this.price = this.price * (1 + (percent * 0.01));
    System.out.println("Price changed by " + (percent) + "%");
  }
}
