public class read_charin_string {
    public static void main (String []args){
        String str ="hello";
        int count = 0;
        int len =0;
        for(char  ch : str.toCharArray()){
            System.out.println(ch);
            count++;
            len=len+1;
        }
        System.out.println("Length of the string is: " + len);
        System.out.println("Count of characters is: " + count);
    }
}
