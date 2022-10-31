class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        int k = temp.length/2;
        merge(temp, nums1, nums2);
        if (temp.length % 2 != 0) {
            return (double) temp[k];
        }
        return ((double) (temp[k]) + (double) (temp[k - 1])) / 2;
        
    }
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0; 
        int j = 0; 
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
