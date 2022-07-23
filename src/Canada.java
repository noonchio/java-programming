public class Canada {
    public static void main(String[] args) {
        int x = average(1,10);
        System.out.println(x);
    }

    public static int average(int min, int max){
        int total = 0;

        for(int i = 0; i < max; i++) {
            total += i;
        }


        return total;

    }
}
