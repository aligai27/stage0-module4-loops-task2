package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        while(count <= printToInclusive) {
            int count_in = 1;
            int count_div = 0;
            while(count_in <= count) {
                count_div = count%count_in == 0 ? count_div + 1 : count_div;
                count_in++;
            }
            if(count_div == 2) {
                System.out.println(count);
            }
            count++;
        }

    }
}
