class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1="",ans2="";
        for(String word:word1){
            ans1+=word;
        }
        for(String word:word2){
            ans2+=word;
        }
        return ans1.equals(ans2);
    }
}
