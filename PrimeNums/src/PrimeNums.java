public class PrimeNums {

    public static void main(String[] args) {
        isPrime();
       PrimeClass();
    }

    public static void isPrime() {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers:");
        System.out.println(primeNumbers);
    }
    public static void PrimeClass() {

        int n =0;
        int numb = 1900;
        String primeClass = " ";
        for(n =1900; n <= 2100; n++){
            int counter= 0;
            for(numb = n; numb>=1; numb --){
                if(n%numb==0){
                    counter = counter +1;
                }
            }
            if(counter ==2){
                primeClass = primeClass + n + " ";
            }
        }
        System.out.println("Prime Classes:");
        System.out.println(primeClass);
    }
    }

