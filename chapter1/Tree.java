// initialization/Overloading.java
// Демонстрация перегрузки конструкторов наряду
// с перегрузкой обычньа методов,
package chapter1;

/** Глава 1 Упражнение 16.
 * class Tree.
 * @author Mukhin
 * @version 1.0
 */
public class Tree {
  int height;

  /** Конструктор класса без аргументов, выводит сообщение в консоль о посадке
   * @throws exceptions Исключения не выдаются
   * @return void
   */
  public void Tree() {
    System.out.println("Сажаем росток");
    height = 0;
  }

  /** Конструктор класса с аргументом, выводит сообщение в консоль о высоте созданного дерева
   * @param initialHeight изначальная высота ростка
   * @throws exceptions Исключения не выдаются
   * @return void
   */
  public void Tree(int initialHeight) {
    height = initialHeight;
    System.out.println("Создание нового дерева высотой " + height + " м.");
  }

  /** Метод info, выводит в консоль сообщение а высоте дерева
   * @throws exceptions Исключения не выдаются
   * @return void
   */
  public void info() {
    System.out.println("Дepeeo высотой " + height + " м.");
  }

  /** Метод info, выводит в консоль сообщение а высоте дерева и названии дерева
   * @param s название дерева
   * @throws exceptions Исключения не выдаются
   * @return void
   */
  public void info(String s) {
    System.out.println(s + ": Дерево высотой " + height + " м.");
  }
}