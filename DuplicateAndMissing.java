import java.util.ArrayList;

public class DuplicateAndMissing {
    public static ArrayList<Integer> duplicateAndMissing(int[] arr){
        int n = arr.length;
        int xr = 0;
        for(int i = 0; i < n; i++){
            xr ^= arr[i];
            xr ^= i + 1;
        }
        int num = xr & ~(xr - 1);
        int zero = 0, one = 0;
        for(int i : arr){
            if((i & num) != 0){
                one ^= i;
            }
            else{
                zero ^= i;
            }
        }
        for(int i = 1; i <= n; i++){
            if((i & num) != 0){
                one ^= i;
            }
            else{
                zero ^= i;
            }
        }
        int count = 0;
        for(int i : arr){
            if(i == one){
                count++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(count == 2){
            ans.add(one);
            ans.add(zero);
            return ans;
        }
        ans.add(zero);
        ans.add(one);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> list = duplicateAndMissing(arr);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
