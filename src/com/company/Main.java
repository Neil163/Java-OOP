package com.company;

public class Main {

    public static void main(String[] args) {

        double[][] arrayAB = new double[][] {{2,3},{0,9},{-10,3}};
        double[][] arrayFG = new double[][] {{0,-15},{3,-1},{0,14}};
        double ev;
        double[] summa = {0, 0, 0};
        double[] multScar = {0, 0, 0};
        ArrayVector AB = new ArrayVector(arrayAB);
        ArrayVector DN = new ArrayVector();
        ArrayVector FG = new ArrayVector(arrayFG);
//        AB.getElement();
//        DN.getElement();
//
//        AB.culculateLength();
//        DN.culculateLength();
//
//        AB.getLength();
//        DN.getLength();
//Нахождение максимального и минимального значения
//        System.out.println("Нахождение максимального и минимального значения");
//        AB.max();
//        AB.min();
// Сортировка массива координат
//        System.out.println("Сортировка массива координат");
//        AB.sort();
//        System.out.println("Sort result:");
//        AB.getElement();
//        ev = AB.evNorm(DN);
//        System.out.println("Evklidovoy normal = " + ev );
// умножение вектора на число
//        System.ou.println("умножение вектора на число");
//        AB.showVector();
//        AB.mult(4);
//        AB.showVector();
//сумма векторов
//        System.out.println("сумма векторов");
//        AB.showVector();
//        DN.showVector();
//
//        summa = AB.sum(DN);
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(summa[i]);
//        }
// Скалярное произведение двух векторов
        System.out.println("Скалярное произведение двух векторов ");
        AB.showVector();
        System.out.println("---------------");
        FG.showVector();
        System.out.println("---------------");
        multScar = AB.multScar(FG);

        for (int i = 0; i < 3; i++) {
            System.out.println(multScar[i]);
        }

    }
}
