//3. Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен при вызове методов.

class Test {
  float test;
}

public class PassObject {
  public static void main(String[] args) {
    Test test1 = new Test();
    test1.test = 5;
    System.out.println("test1: " + test1.test);
    setTest(test1);
    System.out.println("test1: " + test1.test);
  }

  static void setTest(Test value) {
    value.test = 8;
  }
}