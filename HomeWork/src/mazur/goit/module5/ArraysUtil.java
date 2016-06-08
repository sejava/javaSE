package mazur.goit.module5;

/**
 * Created by pan on 08.06.16.
 */
public class ArraysUtil {
    public static double findSmallestElement(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static double findBiggestElement(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double[] bubleSortAscending(double[] array){
        double[] sortedArray = array;
        for (int i = 0; i < sortedArray.length - 1 ; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j+1]){
                    double temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static double[] maxSort(double[] arr){
        double[] sortArray = arr;
        for (int i = 0; i < sortArray.length -1 ; i++) {
            for (int j = 0; j < sortArray.length -1; j++) {
                if(sortArray[j] < sortArray[j + 1]){
                    double temp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = temp;
                }
            }
        }
        return sortArray;
    }
}
