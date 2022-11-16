public class narcissistic_number {
    public static void main(String[] args) {
        int digit = 1;
        int dividedNumber;
        int sumAfterPow;
        int finalSum;
        for(int x = 1;x<=9;x++){
            System.out.println("The number "+ x +" is a narcissistic number");
        }
        for(int i = 10;i<100;i++){
            dividedNumber = i;
            digit = 1;
            finalSum =0;
            while(digit>0 || dividedNumber > 0){
                digit = dividedNumber % 10;
                sumAfterPow = digit * digit;
                finalSum += sumAfterPow;
                dividedNumber = dividedNumber / 10;

            }
            if(finalSum == i){
                System.out.println("The number "+ i +" is a narcissistic nubmer");
            }
        }
        for(int j = 100; j<1000; j++){
            dividedNumber = j;
            digit = 1;
            finalSum =0;
            while(digit>0 || dividedNumber > 0){
                digit = dividedNumber % 10;
                sumAfterPow = digit * digit * digit;
                finalSum += sumAfterPow;
                dividedNumber = dividedNumber / 10;
            }
            if(finalSum == j){
                System.out.println("The number "+ j +" is a narcissistic nubmer");
            }
        }
    }
}
