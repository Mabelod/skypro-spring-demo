package pro.sky.skyprospringdemo.example;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Integer[] numbersArray = {1, 2, 3};
        List<Integer> numbersList = new ArrayList<>(List.of(9, 2, 3, 5));
        Map<String, Integer> numbersMap =new HashMap<>( Map.of("four", 4, "five", 5));
        Set<Integer> numbersSet = new HashSet<>(List.of(1, 40, 40, 12));
        numbersMap.put("two", 2);

        //Получение значения элемента по ключу
        Integer num = numbersArray[0]; numbersList.get(0); numbersMap.get("two"); /*-----*/

        // Запись значения в элемент
        numbersArray[1] = 10; numbersList.set(1, 10); numbersMap.put("one", 1); /*-----*/

        // Получение размера
        int length = numbersArray.length; numbersList.size(); numbersMap.size(); numbersSet.size();

        //Получение строки с содержимым коллекции
        Arrays.toString(numbersArray); numbersList.toString(); numbersMap.toString(); numbersSet.toString();

        //Добавление элемента в конец коллекции
        numbersList.add(56); numbersMap.put("three", 3); numbersSet.add(256);

        // Проверить есть ли элемент в коллекции
        /* ---------*/ numbersList.contains(56); numbersMap.containsValue(3); numbersSet.contains(45);

        System.out.println(numbersMap.toString());
        System.out.println(numbersSet);
    }
}
