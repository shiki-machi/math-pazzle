/* Q01:１０進数で回文。
    10進数、2進数、８進数のいずれで表現しても回文数となる数のうち、
    10進数の10以上で最小の値は？
*/ 
public class Question1{
    public static void main(String[] args){
        int i=11;
        
        while(true){
            String binary = Integer.toBinaryString(i);
            String oct = Integer.toOctalString(i);
            String num = String.valueOf(i);
            
            boolean binaryCheck = isPalindrome(binary);
            boolean octCheck = isPalindrome(oct);
            boolean numCheck = isPalindrome(num);

            if(binaryCheck==true && octCheck==true && numCheck==true){
                break;
            }else{
                i++;
            }
        }
        System.out.println(i);
    }

    public static boolean isPalindrome(String sentence){
        StringBuilder sb = new StringBuilder(sentence);
        return sentence.equals(sb.reverse().toString());
    }
}