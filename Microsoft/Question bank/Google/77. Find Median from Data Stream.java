class MedianFinder {
    
    PriorityQueue<Integer> lower = new PriorityQueue<>((a, b) -> b - a);
    PriorityQueue<Integer> greater = new PriorityQueue<>();
    double median = 0;

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(lower.isEmpty() || lower.peek() > num){
            lower.add(num);
        }else{
            greater.add(num);
        }
        rebalance();
        updateMedian();
    }
    
    public void rebalance(){
        if(lower.size() - greater.size() > 1){
            int lowerTop = lower.remove();
            greater.add(lowerTop);
        }else if(greater.size() - lower.size() > 1){
            int greaterTop = greater.remove();
            lower.add(greaterTop);
        }
    }
    
    public void updateMedian(){
        if(lower.size() > greater.size()){
            median = lower.peek();
        }else if(greater.size() > lower.size()){
            median = greater.peek();
        }else{
            median = (double) (lower.peek() + greater.peek()) / 2;
        }
    }
    
    public double findMedian() {
        return median;
    }
}
