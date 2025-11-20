public class CountVowelsConsonants {
    public static int[] CountVC(String s){
        int n=s.length();
        int vowels=0;
        int cons=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
            }
            if(c>='a' && c<='z'){
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                    vowels++;
                }else{
                    cons++;
                }
            }
        }
        return new int[]{vowels,cons};
    }

    public static void main(String[] args){
        String s="aeidliu";
        int[] count=CountVC(s);
        for(int c:count){
            System.out.println(c);
        }
    }
}
