public class StringtoIntegerAtoi8 {
    public static int myAtoi(String s) {
       
        int negative=1;
      
        s=s.trim();
        long num=0;
        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)=='-'){
              
                negative=-1;
                continue;
            }
            if(i==0 && s.charAt(i)=='+') continue;
             if(Character.isDigit(s.charAt(i))){
                if((num*10+(s.charAt(i)-'0')) * negative>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                 if((num*10+(s.charAt(i)-'0')) * negative<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                num=num*10+(s.charAt(i)-'0');
            }
            if(Character.isAlphabetic(s.charAt(i)) || !Character.isDigit(s.charAt(i))) break;
        
        }
        
       return (int)(num * negative);
     
        }
        public static void main(String[] args) {
            String num="-1337c0d3";
            int res=myAtoi(num);
            System.out.println(res);
        }
        
}
