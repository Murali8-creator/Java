public class RecExample {
    public static void main(String[] args) {

        helper(5);
    }
    private static void helper(int n){
        if (n==0)
            return;


        helper(n-1);
        System.out.println(n);
    }
}
