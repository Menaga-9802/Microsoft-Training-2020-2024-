class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs = new HashSet<>();
        int k=0;int n=0;
        for(int i=0;i<9;i++)
        {
            hs.clear();
            for(int j=0;j<9;j++)
            {
                if(hs.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.')
                    hs.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++)
        {
            hs.clear();
            for(int j=0;j<9;j++)
            {
                if(hs.contains(board[j][i]))
                    return false;
                if(board[j][i]!='.')
                    hs.add(board[j][i]);
            }   
        }
        hs.clear();
        for(int i=0;i<9;i++)
        {
            for(int j=n;j<9;j++)
            {
                if(hs.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.')
                    hs.add(board[i][j]);
                k++;   
                if(j % 3 == 2)
                {
                    if(i % 3 == 2)  
                    {
                        hs.clear();
                    }
                    if(k==27)
                    {
                        n=j+1;
                        k=0;
                        i=-1;
                        break;
                    }
                    else 
                        break;
                } 
            }
        }
        return true;
    }
}
