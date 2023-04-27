// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

import java.util.LinkedList;
import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        LinkedList<Integer> ll = CreateList();
        System.out.println(ll);
        int sumLL = countSum(ll);
        System.out.println(sumLL);
        System.out.println(ll);

    }

    public static int countSum(LinkedList<Integer> lst) {
        int res = 0;
        for (int i = 0; i < lst.size(); i++) {
            int el = lst.pollFirst();
            lst.addLast(el);
            res += el;
        }
        return res;
    }

    public static LinkedList<Integer> CreateList() {
        LinkedList<Integer> ll = new LinkedList<>();
        int size = new Random().nextInt(20) + 10;
        for (int i = 0; i < size; i++) {
            int el = new Random().nextInt((100) + 1);
            ll.add(el);
        }
        return ll;
    }
}