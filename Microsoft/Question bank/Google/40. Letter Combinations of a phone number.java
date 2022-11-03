class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList<>();
        if(digits.length() == 0) return output;
        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        magicFunction(output, digits, "", 0, mapping);
        return output;
    }
     public void magicFunction(List<String> output, String digits, String current, int index, String[] mapping){
         if(index == digits.length()){
             output.add(current);
             return;
         }
         String letters = mapping[digits.charAt(index) - '0'];
         for(int i = 0; i < letters.length(); i++){
             magicFunction(output, digits, current + letters.charAt(i), index + 1, mapping);
         }
     }
}
