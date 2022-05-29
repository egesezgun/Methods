public class defMethod {

    static void world(){
        System.out.println("Metot tanımları");
    }
    static int power(int base, int exp){
        int result= 1;
        for(int i=1; i<=exp; i++){
            result*= base;
        }
        return result;
    }
    public static void main(String[] args) {
        world();
        System.out.println(power(2,4));
    }
}

