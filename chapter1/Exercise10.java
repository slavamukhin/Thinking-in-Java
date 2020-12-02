//10. Напишите программу, которая выводит три параметра командной строки. Для
//    получения аргументов вам потребуется обращение к элементам массива строк
//    (String).

public class Exercise10 {
  public static void main(String[] args) {
    System.out.println("первый = " + args[0]);
    System.out.println("второй = " + args[1]);
    System.out.println("третий = " + args[2]);
  }
}