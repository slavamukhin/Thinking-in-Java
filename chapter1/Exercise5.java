//5. Измените упражнение 4 так, чтобы данным класса DataOnly присваивались
//   значения, а затем распечатайте их в методе main().

import chapter1.DataOnly;
import java.util.Date;

public class Exercise5 {
  public static void main(String[] args) {
    DataOnly data = new DataOnly();
    data.date = new Date();
    System.out.println(data.date);
  }
}