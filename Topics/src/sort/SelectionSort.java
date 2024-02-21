package sort;

import java.util.List;

public class SelectionSort {

    /*
    Selection Sort

    idea : look through cards from the first(index : 0)
            and pick the smallest one and change position with the card at first index(0)

     */


    public static int[] selectionSort(int[] list){

        for(int i=0; i<list.length; i++){

            int min_value = list[i];
            int min_index = i;

            for(int j=i+1; j<list.length; j++) {
                //find smallest number among unsorted numbers
                if (min_value > list[j]) {
                    min_index = j;
                    min_value = list[j];
                }
            }

            //exchanged the position
            int tmp = list[i];
            list[i] = min_value;
            list[min_index] = tmp;

        }

        return list;

    }


    public static void main(String[] args) {

        int[] array = {7,5,9,999,3,-1,6,88,4,8};

        int[] sorted_list = selectionSort(array);

        for(int i=0; i<sorted_list.length; i++){
            System.out.println(sorted_list[i] +" ");
        }


    }

}
