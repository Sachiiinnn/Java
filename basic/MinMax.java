package basic;
// public class min_max_array{
//         static int arr[] = {1,2,3,5,12,-12};
//         static int n = arr.length;
//     public static void main(String[] args) {
//         min_value();
//         max_value();
//     }

//     static void min_value(){ 
//         int min = Integer.MAX_VALUE;
//         for(int i= 0; i < n; i++){
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//         }
//         System.out.println(min);
//     }
//     static void max_value(){ 
//         int max = Integer.MIN_VALUE;
//         for(int i= 0; i < n; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


public class MinMax{
    public static void main(String[] args) {
        int[] arr = {1, 2,3 ,4 ,-4,34,11,6,5};
        int max = arr[0];  
        int min = arr[0];  
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum element" + min);
        System.out.println("Maximum element" + max);
    }
}