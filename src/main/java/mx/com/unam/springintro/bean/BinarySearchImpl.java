package mx.com.unam.springintro.bean;

import mx.com.unam.springintro.service.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;

public class BinarySearchImpl {

    @Autowired
    SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSerach){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Search the array
        return 3;
    }
}
