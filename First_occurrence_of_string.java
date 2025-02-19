public class First_occurrence_of_string {

    public static int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for(int i = 0;i<=h.length - n.length;i++){
            int j;
            for(j =0;j<n.length;j++){
                if(h[i+j] != n[j]){
                    break;
                }
            }
            if(j == n.length){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        String haystack = "butsad";
        String needle = "sad";
        int r = strStr(haystack, needle);
        System.out.println(r);
    }
}
