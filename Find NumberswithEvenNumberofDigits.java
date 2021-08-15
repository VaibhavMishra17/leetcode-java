class Solution {
    public int findNumbers(int[] nums) {
       int c2 = 0;
        for (int num : nums) {
            if (even(num)) {
                c2++;
            }
        }
        return c2;
    }
    
    boolean even(int num) {
        int noOfDigits = digits(num);
        // if (noOfDigits % 2 == 0) {
        //     return true;
        // }
        // return false;
        return noOfDigits % 2 == 0;
    }
    
    int digits(int num){
        
        if (num < 0) {
            num *= -1;
        }
        
        if (num == 0) {
            return 1;
        }
        
//         int c1 = 0;
        
//         while (num > 0) {
//             c1++;
//             num /= 10;
//         }
//         return c1;
        
        return (int)(Math.log10(num)) + 1;
    }
    
//     10-99 ---- EVEN digit
//     1000-9999 --- EVEN digit
//     100000 -- EVEN digit

class Solution {
    public int findNumbers(int[] nums) {
        
        int count=0;
        
        for(int i =0 ; i< nums.length; i++){
            
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        
        return count;
        
    }
}
}