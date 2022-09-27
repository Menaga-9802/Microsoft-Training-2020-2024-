class MyCircularDeque {
    ArrayList<Integer> list;
    static int p=0;
    public MyCircularDeque(int k) {
        list=new ArrayList();
        p=k;
    }
    
    public boolean insertFront(int value) {
        if(list.size()<p){
            list.add(0,value);
            return true;
        }
        return false;
    }
    
    public boolean insertLast(int value) {
         if(list.size()<p){
            list.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deleteFront() {
        if(list.size()>0){
            list.remove(0);
            return true;
        }
        return false;
    }
    
    public boolean deleteLast() {
         if(list.size()>0){
            list.remove(list.size()-1);
            return true;
        }
        return false;
        
    }
    
    public int getFront() {
        if(list.size()>0)
            return list.get(0);
        return -1;
    }
    
    public int getRear() {
        if(list.size()>0)
            return list.get(list.size()-1);
        return -1;
    }
    
    public boolean isEmpty() {
        if(list.size()==0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(list.size()==p)
            return true;
        return false;
    }
}
