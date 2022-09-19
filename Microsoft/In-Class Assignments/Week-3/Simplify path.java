class Solution{ 
public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        String[] dirs = path.split("/");      

        for(String s : dirs){
            if(s.equals(".") || s.equals("")) 
                continue;
            if(s.equals("..")){              
                if(!list.isEmpty())          
                    list.remove(list.size()-1);
            }else
                list.add(s);                  
        }
		
        return  "/"+String.join("/", list) ; 
    }
}
