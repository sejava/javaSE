package mazur.goit.module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by pan on 08.06.16.
 */
public class ModuleFiveTest extends  ArraysUtil{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double[] array = new double[5];
        System.out.println("Введіть " + array.length + " елеменів масиву");
        try {

            for(int i=0; i<array.length; i++){
                array[i] = Double.parseDouble(reader.readLine());

            }

            System.out.println("Minumum Element - " + findSmallestElement(array));
            System.out.println("Maximum element - " + findBiggestElement(array));


            System.out.println("Виберіть спосіб сортіровки масив : \n 1 - від найменьшого елемента \n 2 - від найбільшого елементу");
            int r = Integer.parseInt(reader.readLine());
            if (r == 1){
                for (double a: bubleSortAscending(array)) {
                    System.out.println(a);
                }
            }else if (r == 2){
                for (double number : maxSort(array)){
                    System.out.println(number);
                }
            }
        }
        catch(NumberFormatException exceptionx){
            System.out.println("EROR! Pleas write numbers");
        }
    }
    }

