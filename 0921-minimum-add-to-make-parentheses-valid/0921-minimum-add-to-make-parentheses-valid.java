class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'&& sb.length()>0 && sb.charAt(sb.length()-1)=='('){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.length();
    }
}