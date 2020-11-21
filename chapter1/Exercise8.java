//8. Напишите программу, которая демонстрирует, что независимо от количества
//   созданных объектов класс содержит только один экземпляр поля static.
import chapter1.StaticTest;

public class Exercise8 {
  public static void main(String[] args) {
    StaticTest first = new StaticTest();
    StaticTest second = new StaticTest();
    first.only1 = 100;
    System.out.println(second.only1);
  }
}