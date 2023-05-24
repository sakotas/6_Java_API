package com.example.homework_1;
import java.util.*;

//Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент,
// метод toString возвращающий строку с элементами множества и
// метод позволяющий читать элементы по индексу.
// * Реализовать все методы из семинара.
// Формат данных Integer.


public class Homework_6 {
        public static void main(String[] args) {
            ownSet newSet = new ownSet();

            Comparator<Integer> comparator = (o1, o2) -> o2 - o1;

            myTreeSet newTreeSet = new myTreeSet(comparator);

            for (int i = 0; i < 5; i++) {
                newSet.add(new Random().nextInt(10));
                newTreeSet.add(new Random().nextInt(10));
            }

            if (newSet.contains(7)){
                System.out.println("Contains");
            } else {
                System.out.println("Not Contains");
            }

            System.out.println("To string: " + newSet.toString());
        }
    }

    class ownSet {
        static final Object OBJECT = new Object();
        private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

        public boolean add(int num) {
            return hashMap.put(num, OBJECT) == null;
        }

        public boolean contains(int num) {
            return hashMap.containsKey(num);
        }

        public Object[] toArray() {
            return hashMap.keySet().toArray();
        }

        public String toString() {
            Object[] tempArr;
            tempArr = hashMap.keySet().toArray();
            String text = "";
            for (int i = 0; i < tempArr.length; i++) {
                text = text + tempArr[i];
            }
            return text;
        }

        public Iterator<Integer> iterator() {
            return hashMap.keySet().iterator();
        }

        public Integer getItem(int index) {
            return (Integer) toArray()[index];
        }

    }

    class myTreeSet {
        private Comparator<Integer> comparator;

        public myTreeSet(Comparator<Integer> comp) {
            comparator = comp;
        }

        private TreeMap<Integer, Object> treeMap = new TreeMap<>(comparator);

        static final Object OBJECT = new Object();

        public boolean add(int num) {
            return treeMap.put(num, OBJECT) == null;
        }

        public boolean contains(int num) {
            return treeMap.containsKey(num);
        }

        public Object[] toArray() {
            return treeMap.keySet().toArray();
        }

        public Iterator<Integer> iterator() {
            return treeMap.keySet().iterator();
        }

        public Integer getItem(int index) {
            return (Integer) toArray()[index];
        }



}
