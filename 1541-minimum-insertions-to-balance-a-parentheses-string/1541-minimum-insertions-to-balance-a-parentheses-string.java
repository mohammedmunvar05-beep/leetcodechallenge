class Solution {
    public int minInsertions(String s) {
        int open=0;
        int add=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                open++;
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                }
                else{
                    add++;
                }
            if(open>0){
                open--;
            }
            else{
                add++;
            }
        }
        }
        return add+open*2;

        
    }
}