class Solution {

// public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         int p = -1;
//         // int[] reversedNums2 = Arrays.copyOf(nums2, nums2.length);
//         // reverseArray(reversedNums2);
//         mp.put(nums2[nums2.length -1],-1);
//         int max = nums2[nums2.length-1];
//         for(int i = nums2.length-2; i>=0; i--){
//           int current= nums2[i];
//             if(current < max){
//                 if(i!=nums2.length && nums2[i+1] > current) max = nums2[i+1];
//                 mp.put(current,max );
                
//             }
//             else mp.put(current,-1);
            
//             max = Math.max(current,max);
            
//         }
//         int[] res = new int [nums1.length];
//         for(int i =0; i< nums1.length; i++){
//             res[i] = mp.get(nums1[i]);
//         }
//         return res;
//     }

    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      HashMap<Integer, Integer> mp = new HashMap<Integer,Integer>();
    Stack<Integer> st = new Stack<>();
        for(int  n : nums2){
            while(!st.isEmpty() && n > st.peek()){
                mp.put(st.pop(),n);
            }
            st.push(n);
        }
        int i=0;
        while(i<nums1.length){
            nums1[i] = mp.getOrDefault(nums1[i],-1);
            i++;
        }
        return nums1;
    } 
}