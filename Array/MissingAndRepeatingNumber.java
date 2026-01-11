import java.util.*;
public class MissingAndRepeatingNumber{
    public static int[] missingAndRepeating(int[]arr){
        int[]res=new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        
        // traversing through array and find the frequency of each element
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        // finding the missing and repeating element
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                res[1]=entry.getKey();
            }
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!map.containsKey(i)) {
                res[0] = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the Array");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // displaying the elements
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("The Missing element and Repeating element in the Array is: "+Arrays.toString(missingAndRepeating(arr)));
        sc.close();
    }
}