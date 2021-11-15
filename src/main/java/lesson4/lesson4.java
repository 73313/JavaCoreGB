package lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lesson4 {
    public static void main(String[] args) {
        item1();
        System.out.println();
        item2();


    }

    private static void item1() {
        //1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        //Посчитать, сколько раз встречается каждое слово.
        System.out.println("Задание 1");
        System.out.println();

        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] setOfWords = {
                "Осень", "Листья", "Зима",
                "Зима", "Трава", "Лето",
                "Весна", "Солнце", "Лето",
                "Жара", "Лето", "Дождь",
                "Снег", "Ветер", "Ветер",
                "Погода", "Лужа", "Солнце", "Ураган", "Лето", "123",
        };

        for (int i = 0; i < setOfWords.length; i++) {
            if (hashMap.containsKey(setOfWords[i]))
                hashMap.put(setOfWords[i], hashMap.get(setOfWords[i]) + 1);
            else
                hashMap.put(setOfWords[i], 1);
        }

        for (Map.Entry<String, Integer> keyAndValue : hashMap.entrySet()) {
            System.out.println(keyAndValue.getKey() + " -" + keyAndValue.getValue() + " " + "повт.");
        }
    }


    private static void item2() {
        //2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий
        // и телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        // добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        // Следует учесть, что под одной фамилией может быть несколько телефонов
        // (в случае однофамильцев),тогда при запросе такой фамилии должны выводиться все телефоны.
        System.out.println("Задание 2");
        System.out.println();

        Phonebook phonebook = new Phonebook();


        phonebook.add("Сезёмин", "89036364596");
        phonebook.add("Иванов", "89648759632");
        phonebook.add("Петров", "89102658932");
        phonebook.add("Диков", "89032567894");
        phonebook.add("Сезёмин", "89256368741");
        phonebook.add("Иванов", "89096542314");
        phonebook.add("Петров", "89123698754");
        phonebook.add("Солошенко", "89032569852");
        phonebook.add("Иванов", "8456963215");
       


        System.out.println(phonebook.get("Сезёмин"));
        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Диков"));
        System.out.println(phonebook.get("Солошенко"));
        System.out.println(phonebook.get("Солош"));
    }
}


