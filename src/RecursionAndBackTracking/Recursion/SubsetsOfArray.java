package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    static void subset(int[] arr, int index, List<Integer> current) {
            //base Case
        if(index== arr.length){
            System.out.println(current);
            return;
        }
        //Take the element
        current.add(arr[index]);
        subset(arr, index+1, current);

        //BackTracking
        current.remove(current.size()-1);

        //skill and explore
        subset(arr, index+1, current);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subset(arr,0, new ArrayList<>());
    }
}