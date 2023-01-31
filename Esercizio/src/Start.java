import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String carBrands[] = new String[]{
                "BMW", "Ferrari", "Mercedes", "Porsche", "Volkswagen"
        };
        System.out.println("The length of array is: " + carBrands.length);
        System.out.println("The 3rd elements of array is: " + carBrands[2]);

        int primeNumbers[] = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        System.out.println("All the elements of array are: " + Arrays.toString(primeNumbers));
    }
}
