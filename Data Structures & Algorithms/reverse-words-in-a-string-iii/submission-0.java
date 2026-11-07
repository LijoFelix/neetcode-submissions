class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String ans="";
        for(int i=0;i<words.length;i++){
            String word=new StringBuilder(words[i]).reverse().toString();
            ans+=word;
            if(i<words.length-1){
                ans+=" ";
            }
        }
        return ans;
    }
}
