package ArrayBasics.MajElements;

public class MajPriorityElementsOptimized {
    static void main(String[] args) {
        int[] arr={2,2,1,2,3,2,2};
        int candidate=arr[0];
        int count=1;
        for (int i=1;i< arr.length;i++){
            if (arr[i]==candidate) {
                count++;
            }else {
                count--;
            }
            if(count==0){
                candidate=arr[i];
                count=1;
            }
        }
        System.out.println("Majority Element:"+candidate);
    }
}
