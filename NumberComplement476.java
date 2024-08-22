public class NumberComplement476 {
    public static int findComplement(int num) {
        
        String ans="";
        String numBinary=Integer.toBinaryString(num);
        for(int i=0;i<numBinary.length();i++){
            if(numBinary.charAt(i)=='0'){
                ans+='1';
            }
            else{
                ans+='0';
            }
        }
        return Integer.parseInt(ans,2);
    }
    public static void main(String[] args) {
        int num=5;
        int ans=findComplement(num);
        System.out.println(ans);

    }
}
