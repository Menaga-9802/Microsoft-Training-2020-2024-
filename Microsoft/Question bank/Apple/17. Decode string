class Solution {
    public String decodeString(String s) {
        Deque<Character> que = new LinkedList<>();
        for(char c : s.toCharArray()) que.offer(c);
        return decode(que);
    }
    private String decode(Deque<Character> que){
        StringBuilder sb = new StringBuilder();
        int num = 0;
        while(!que.isEmpty()){
            char c = que.poll();
            if(Character.isDigit(c)){
                num = num*10+c-'0';
            }else if(c == '['){
                String sub = decode(que);
                for(int i=0; i<num; i++) 
                    sb.append(sub);
                num = 0;
            }else if(c == ']'){
                break;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
