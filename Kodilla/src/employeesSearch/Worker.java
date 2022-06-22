package employeesSearch;

interface Details {
  public void returnDetails();
}

public class Worker implements Details {
  String name;
  String surname;
  int pay;

  public Worker() {
    name = "";
    surname = "";
    pay = 0;
  }

  public Worker(String name, String surname, int pay) {
    this.name = name;
    this.surname = surname;
    this.pay = pay;
  }

  public void returnDetails() {
    System.out.println(name + " " + surname + " " + pay);
  }
}
