public class ReverseWords2 {
    public static String ReverseString(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
          char c=s.charAt(i);
          if(c!=' '){
            int j=i;
            while(c!=' '){
                i++;
            }
            int end=i;
            sb.append(s.substring(j, end));
          }else{
            i++;
          }
          
        }
        return sb.toString();
    }
}
