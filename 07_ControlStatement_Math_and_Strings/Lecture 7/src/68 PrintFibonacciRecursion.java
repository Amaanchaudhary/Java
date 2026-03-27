class PrintFibonacci {
    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num){
        if(num == 1){
            return 0;
        }
        if(num == 2){
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
