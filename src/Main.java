import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("Введите количество элементов массива:");
                int[] myArray = new int[scan.nextInt()];

                System.out.println("Введите элементы массива:");
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = scan.nextInt();
                }


                int product = 1;
                for (int i = 0; i < myArray.length; i++) {
                    product *= myArray[i];
                }


                System.out.println("Произведение всех элементов массива: " + product);
            }
        }

//double[] mas = new double[4];
//        mas [0] = 45.8;
//        mas [1] = 78.3;
//        mas [2] = 54.7;
//        mas [3] = 23.9;
//        double num = 1;
//
//
//        for(int i = 0; i < mas.length; i++){
//            num *= mas[i];
//        }
//        System.out.println(" = " + num);