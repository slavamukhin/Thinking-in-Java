// 7.  Превратите фрагменты кода с классом lncrementable в работающую программу
//class Incrementable {
//  static void increment() {
//    StaticTest.i++;
//  }
//}
import chapter1.Incrementable;
import chapter1.StaticTest;

public class Exercise7 {
  public static void main(String[] args) {
    Incrementable inc = new Incrementable();
    inc.increment();
    System.out.println(StaticTest.i);
  }
}