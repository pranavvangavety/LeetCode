import java.util.Arrays;

public class Merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n -1;
        int p = m+n -1;

        while(p1>=0 && p2>=0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while(p2>=0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};
        int m = 3,n=3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

}
