package com.testExercise.ex.engine;

import java.util.*;

public class ResponseChars {

    public static String counts(String word) {  // Метод принимает на вход строку и возвращает готовую строку с ответом
        int count = 1; // задаем начальное количество символов для каждого полученного из строки символа
        word = word.replaceAll("\\s+",""); // убираем все пробелы не по одному, т.к. они могут быть ошибочно введены до,
        // после или во время ввода информации, мы намеренно выделяем Строчные и Заглавные буквы как отдельную категорию

        HashMap<String, Integer> answer = new HashMap<>();// Создаем мапу ключом которой будет являться сам наше уникальное слово
        for (int i = 0; i < word.length(); i++) { //проходимся циклом по строке для получения ключей к хешмапе
            String keys = "\""+word.charAt(i)+"\"";// Создаем ключ для записи с кавычками " "
            if (!answer.containsKey(keys)) { //если символ уникальный - мы записываем в мапу со значением count = 1
                answer.put(keys, count);
            } else answer.put(keys, answer.get(keys) + 1); //если символ уже присутсвует в мапе, то добавляем инкремент +1 к значению
        }
        List<Map.Entry<String , Integer>> list = new ArrayList<>(answer.entrySet()); //создаем лист для сортировки
        list.sort((Comparator<? super Map.Entry<String, Integer>>) (a, b) -> b.getValue() - a.getValue());//сортируем значения в листе новым компаратором

        String str = list.toString();//Преобразуем полученный лист к строке для вывода ответа
        String string = str.replaceAll("=", ":");//заменяем в строке знаки в соответствии с требованием
        string = string.substring(1, string.length() - 1 );// убираем прямоугольные кавычки в начале и конце строки []
        return string; //возвращаем ответ в соответствии с требованием
    }
}
