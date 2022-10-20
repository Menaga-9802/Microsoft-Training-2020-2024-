class Solution {
    public int findKthLargest(int[] num, int a) {
        Arrays.sort(num);
        return num[((num.length)-a)];
    }
}
