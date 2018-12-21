package com.javarush.task.task13.task1304;

/* 
Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
Не забудь реализовать методы!

Требования:
Класс Screen должен реализовывать(implements) интерфейс Selectable.
Класс Screen должен реализовывать(implements) интерфейс Updatable.
В классе Screen должен быть реализованы методы интерфейса Selectable.
В классе Screen должен быть реализованы методы интерфейса Updatable.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        public boolean isAlcoholic() {
            return false;
        }
        
        public void onSelect() {
            System.out.println(123);
        }
        public void refresh() {
            System.out.println(123);
        }
    }
}
