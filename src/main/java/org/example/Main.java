package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Task two
        int temperature = 2;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Task three
        int speed = 124;
        if (speed > 0 && speed <= 60) {
            System.out.println("Если скорость " + speed + ", то  можно ездить спокойно");
        } else if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        // Task four
        age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 17 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ",  то его место в университете");
        } else if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        // Task five
        age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }

        // Task six
        int numberOfOccupiedPlaces = 150;
        if (numberOfOccupiedPlaces < 60) {
            System.out.println("В вагоне занято " + numberOfOccupiedPlaces + " мест ,еще есть сидячие и стоячие свободные места");
        } else if (numberOfOccupiedPlaces < 102) {
            System.out.println("В вагоне  занято " + numberOfOccupiedPlaces + " мест, есть только стоячие свободные места");
        } else if (numberOfOccupiedPlaces == 102) {
            System.out.println("В вагоне  занято " + numberOfOccupiedPlaces + " места, вагон полностью заполнен");
        } else if (numberOfOccupiedPlaces > 102){
            System.out.println("В вагоне  занято " + numberOfOccupiedPlaces + "... хотя погодите, в вагоне нет столько мест! Все на выход!");

        }

        // Task seven
        int one = 5;
        int two = 5;
        int three = 5;
        if (one > two && one > three){
            System.out.println("Переменая 'one' больше всех, она равняется числу " + one);
        }else if (three > two && one != three){
            System.out.println("Переменая 'three' больше всех, она равняется числу " + three);
        }else if (two > three && one != two){
            System.out.println("Переменая 'two' больше всех, она равняется числу " + two);
        }else if(one == three && one == two){
            System.out.println("Все переменные между собой равны, и равняются числу " + one);
        } else if (one == two) {
            System.out.println("Переменные 'one' и 'two' наибольшие и равняются числу " + one);
        }else if (one == three){
            System.out.println("Переменные 'one' и 'three' наибольшие и равняются числу " + one);
        }else {
            System.out.println("Переменные 'two' и 'three' наибольшие и равняются числу " + two);
        }
    }
}