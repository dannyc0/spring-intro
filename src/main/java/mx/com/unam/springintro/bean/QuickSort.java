package mx.com.unam.springintro.bean;

import mx.com.unam.springintro.service.SortAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
