package employeesSearch;

public class Boss extends Worker {
  int bonus;

  public Boss(String name, String surname, int pay, int bonus) {
    this.name = name;
    this.surname = surname;
    this.pay = pay;
    this.bonus = bonus;
  }

  @Override
  public void returnDetails() {
    System.out.println(name + " " + surname + " " + pay + " " + bonus);
  }
}
