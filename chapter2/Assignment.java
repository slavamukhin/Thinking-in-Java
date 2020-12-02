//2. Создайте класс с полем типа float. Используйте его для демонстрации совмещения имен.


class Test {
  float test;
}
public class Assignment {

  public static void main(String[] args) {
    Test test1 = new Test();
    Test test2 = new Test();
    test1.test = 1;
    test2.test = 3;
    System.out.println("test1: " + test1.test);
    System.out.println("test2: " + test2.test);
    test1 = test2;
    System.out.println("test1: " + test1.test);
    System.out.println("test2: " + test2.test);
  }
}