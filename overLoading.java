public class overLoading {

    static void print (){
        System.out.println("Parametre olmadan metot");
    }
    static void print(int a){
        System.out.println("Parametreler :" + a);
    }
    static int print(int b , int a){
        return a+b;
    }

    public static void main(String[] args) {
        print();
        print(29);
        System.out.println(print(2,3));

    }

}
