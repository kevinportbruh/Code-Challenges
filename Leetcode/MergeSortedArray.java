//@author Kevin Portillo, Self-Proclaimed Code Wizard 🧙‍♂️
class MergeSortedArray{
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0 || (n==0 && m==0)){
            return;
        }else if(m==0&& n>0){
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
            return;
        }
        //hard 1 pass ver, go thru each item in both arrays and add them to a temp array
        int[] temp = new int[m+n];
        int idx=0;
        int sdx=0;//second index for nums2
       for(int i = 0; i<m+n;i++){   
            //idx may not go over m+n and sdx may not go over n
            if(sdx>=n){
                temp[i]= nums1[idx];
                idx++;
            }else if (idx>=m){
                temp[i]=nums2[sdx];
                sdx++;  
            }else{
                //debug
                /** 
                System.out.println("idd:" +idx + "sdx: "+sdx);
                System.out.println("nums1[idx]" + nums1[idx]);
                System.out.println("nums2[sdx]" + nums2[sdx]);
                */
                if(nums1[idx] <= nums2[sdx]){
                    temp[i]=nums1[idx];
                    idx++;
                }else{
                    temp[i]=nums2[sdx];
                    sdx++;
                }
               
            }
            /**Debug 
            for(int f=0; f<temp.length;f++){
                System.out.println("temp[f]" + temp[f]);
            }
            System.out.println("========");
            */
        }
        System.arraycopy(temp, 0, nums1, 0, nums1.length);
    }

}