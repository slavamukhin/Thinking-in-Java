//6. Напишите программу, включающую метод storage(), приведенный ранее в это главе.

//int storage(String s) {
//  return s.length()*2;
//}

public class Exercise6 {
  static int storage(String s) {
    return s.length() * 2;
  }
  public static void main(String[] args) {
    System.out.println(storage("Упраднение 6"));
  }
}