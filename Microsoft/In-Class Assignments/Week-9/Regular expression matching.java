class Solution {
    public boolean isMatch(String s, String p) {
        if(p.length()==0){
			if(s.length()==0){
				return true;
			}else{
				return false;
			}
		}
		if(p.length()>=2 && p.charAt(1)=='*'){
			return isMatch(s,p.substring(2,p.length())) || (firstMatch(s,p) && isMatch(s.substring(1,s.length()),p));
		}else{
			return firstMatch(s,p) && isMatch(s.substring(1,s.length()),p.substring(1,p.length()));
		}
    }
	public boolean firstMatch(String s, String p){
		if(s.length()==0 || p.length()==0) return false;
		if(s.charAt(0) == p.charAt(0) || p.charAt(0)=='.'){
			return true;
		}
		return false;
	}
}
