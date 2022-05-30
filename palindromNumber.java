public class palindromNumber {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp!=0){
            System.out.println("=====");
            System.out.println("temp: "+temp);
            lastNumber=temp%10;
            System.out.println("lastnumber: "+lastNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("reverseNumber: "+reverseNumber);
            temp/=10;
            System.out.println("yeni temp: "+temp);
        }
        if(number==reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        System.out.println(isPalindrom(345));
    }
}
