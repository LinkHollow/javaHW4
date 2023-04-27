// Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Queue;



public class task02 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        LinkedList<String> array = new LinkedList<>();
        array.add("Первый");
        array.add("Второй");
        array.add("Третий");
        System.out.println(array);
        enqueue(array, "Четвёртый");
        System.out.println(array); //помещает элемент в конец очереди
        dequeue(array);
        System.out.println(array); // возвращает первый элемент из очереди и удаляет его
        System.out.println("Первый элемент: " + first(array)); // возвращает первый элемент из очереди, не удаляя

    }

    static void enqueue(Queue<String> array, String element) {
        array.add(element);
    }

    static String dequeue(Queue<String> array) {
        String temp = array.remove();
        System.out.println("Удалён: " + temp);
        return temp;
    }

    static String first(Queue<String> array) {
        String element = array.element();
        return element;
    }

}