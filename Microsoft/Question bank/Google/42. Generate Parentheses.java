class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<>();
        generatePar(n,n,list,new String(""));
        return list;
    }
     public void generatePar(int p1,int p2,List<String> list,String s){   
        if(p1 == p2){          
            s += '(';
            p1--;
        }
        if(p1 == 0 && p2 > 0){ 
            while(p2 != 0){
                s += ')';
                p2--;
            }
            list.add(s);
            return;
        }
        generatePar(p1-1,p2,list,s+'(');    
        generatePar(p1,p2-1,list,s+')');   
    }
}
