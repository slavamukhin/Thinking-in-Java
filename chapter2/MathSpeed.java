//4. Напишите программу, которая вычисляет скорость для постоянных значений
//   расстояния и времени.

public class MathSpeed {
  static int path = 100;
  static int time = 11;
  public static void main(String[] args) {
    float v  = path / time;
    System.out.println(v);
  }
}