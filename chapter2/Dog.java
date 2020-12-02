//5. Создайте класс Dog, содержащий два поля типа String: name и says. В методе
//   main() создайте два объекта Dog с разными именами (spot и scruffy) и сообщениями.
//   Выведите значения обоих полей для каждого из объектов.

//6. В упражнении 5 создайте новую ссылку на Dog и присвойте ее объекту spot.
//   Сравните ссылки оператором == и методом equals().

public class Dog {
  String name;
  String says;

  public static void main(String[] args) {
    Dog spot = new Dog();
    Dog scruffy = new Dog();
    spot.name = "spot";
    spot.says = "I'm spot";
    scruffy.name = "scruffy";
    scruffy.says = "I'm scruffy";
    System.out.println("spot " + spot.name + " " + spot.says);
    System.out.println("scruffy " + scruffy.name + " " + scruffy.says);
    // 6. start
    Dog newDog = new Dog();
    spot = newDog;
    System.out.println(spot == newDog);
    System.out.println(spot.equals(newDog));
    System.out.println("spot " + spot.name + " " + spot.says);
    System.out.println("scruffy " + scruffy.name + " " + scruffy.says);
  }
}