import java.util.Arrays;
public class MyMain {
    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        int up=0;
        for(int i=(arr.length-1); i>-1; i--){
            reversed[up]=arr[i];
            up+=1;    
        }
        return reversed;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max= Integer.MIN_VALUE;
        int sec= Integer.MIN_VALUE;
        for(int i: arr){
            if(i>max){
                max=i;
            }
        }
         for(int i: arr){
            if(i>sec&&i!=max){
                sec=i;
            }
        }
        return sec;
        
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        int[] rev = reverse(arr);
        for(int i =1;i<arr.length;i++){
            if(arr[i-1]*arr[1]==arr[i] || rev[i-1]*rev[1]==rev[i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] test1={32,16,8,4,2,1};
        int[] test2={32,17,8,4,2,1};
        
        
        System.out.println(Arrays.toString(reverse(test1)));
        System.out.println(Arrays.toString(reverse(test2)));
        System.out.println(secondLargest(test1));
        System.out.println(secondLargest(test2));
        System.out.println(isGeometric(test1));
        System.out.println(isGeometric(test2));

    }
}
