package com.company;

public class ArrayVector {

    private double[][] coordinates;
    public double[] vector = {1,3,4};
    public double length = 0;
//конструктор с параметром
    public ArrayVector (double[][] coordinates) {

        this.coordinates = coordinates;

        this.vector[0] = coordinates[0][1]-coordinates[0][0];
        this.vector[1] = coordinates[1][1]-coordinates[1][0];
        this.vector[2] = coordinates[2][1]-coordinates[2][0];
    }
//конструктор по умолчанию
    public ArrayVector () {
        double[][] coordinates = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                coordinates[i][j] = i + j + 5;
            }
        }
        this.coordinates = coordinates;

        this.vector[0] = this.coordinates[0][1]-this.coordinates[0][0];
        this.vector[1] = this.coordinates[1][1]-this.coordinates[1][0];
        this.vector[2] = this.coordinates[2][1]-this.coordinates[2][0];
    }
//функция вывода на экран координат вектора
    public void getElement ()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(this.coordinates[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Вывод на экран Вектора
    public void showVector() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.vector[i]);
        }
    }

// подсчёт длины вектора
    public void culculateLength()
    {
        this.length = Math.sqrt((this.coordinates[0][1]-this.coordinates[0][0])*(this.coordinates[0][1]-this.coordinates[0][0])
        +(this.coordinates[1][1]-this.coordinates[1][0])*(this.coordinates[1][1]-this.coordinates[1][0]) +
                (this.coordinates[2][1]-this.coordinates[2][0])*(this.coordinates[2][1]-this.coordinates[2][0]));
    }
//вывод на экран значение длины
    public void getLength()
    {
        System.out.println("Length of object  " + this.length);
    }

//Нахождение максимальной точки вектора
    public void max()
    {
        double max = this.coordinates[0][0];

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j <2; j++) {
                if (max < this.coordinates[i][j])
                    max = this.coordinates[i][j];
            }
        }
        System.out.println("Max = " + max);
    }
//Нахождение минимальной точки вектора
    public void min()
    {
        double min = this.coordinates[0][0];

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j <2; j++) {
                if (min > this.coordinates[i][j])
                    min = this.coordinates[i][j];
            }
        }
        System.out.println("Min = " + min);
    }
//сортировка
    public void sort()
    {
        double temp = 0;
        for (int m = 0; m < 6; m++) {
            for (int i = 0; i < 3; i ++) {
                for (int j = 0; j <1; j++) {

                    if (this.coordinates[i][j] > this.coordinates[i][j + 1]) {
                        temp = this.coordinates[i][j];
                        this.coordinates[i][j] = this.coordinates[i][j + 1];
                        this.coordinates[i][j + 1] = temp;
                    }
                    if (i == 2) {
                        continue;
                    }
                    else {
                        if (this.coordinates[i][j + 1] > this.coordinates[i + 1][j]) {
                            temp = this.coordinates[i][j + 1];
                            this.coordinates[i][j + 1] = this.coordinates[i + 1][j];
                            this.coordinates[i + 1][j] = temp;
                        }
                    }
                }
            }
        }
    }
    // нахождение евклидовой нормы
    public double evNorm(ArrayVector a) {
            double ev;
            ev = (a.coordinates[0][1]-a.coordinates[0][0])*(this.coordinates[0][1]-this.coordinates[0][0]) +
                    (a.coordinates[1][1]-a.coordinates[1][0])*(this.coordinates[1][1]-this.coordinates[1][0]) +
                    (a.coordinates[2][1]-a.coordinates[2][0])*(this.coordinates[2][1]-this.coordinates[2][0]);
        return ev;
    }
// Умножение вектора на число
    public void mult(double x) {

        for (int i = 0; i < 3; i++) {
            this.vector[i] *= x;
        }
    }
    //Сложение двух векторов
    public double[] sum(ArrayVector a) {

        double[] result = {0, 0, 0};

        for (int i = 0; i < 3; i++) {
            result[i] = this.vector[i] + a.vector[i];
        }
        return result;
    }

    //Скалярное произведение двух векторов
    public double[] multScar(ArrayVector a) {

        double[] result = {0, 0, 0};

        for (int i = 0; i < 3; i++) {
            result[i] = this.vector[i] * a.vector[i];
        }
        return result;
    }

}
