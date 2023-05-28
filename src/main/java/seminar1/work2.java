
//2) Вывести все простые числа от 1 до 1000//
package seminar1;

public class work2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1001; i++) {
            // поставили флаг
            boolean isPrime = true;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
