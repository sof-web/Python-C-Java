
import java.util.ArrayList;
import java.util.Stack; // нужно импортировать

class Main {
    public static void main(String[] args) { // исправлено args[]
        // Создаём пустой список
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        // Добавляем элементы
        a.add(1);
        a.add(2);
        a.add(3);
        
        // Печатаем список
        System.out.println(a);  // [1, 2, 3]
        
        // Создание стека (неполный код)
        Stack<Integer> stack = new Stack<>(); // исправлено
        stack.push(10);
        stack.push(20);
        // Должны быть операции pop(), peek() и т.д.
    }
}
