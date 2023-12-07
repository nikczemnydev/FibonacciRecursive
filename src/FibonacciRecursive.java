public class FibonacciRecursive {
    static int a = 0;
    static int b = 1;
    static int nextInSeq = 0;
    static int seqLimit = 1000000;

    public static void main(String[] args) {
        System.out.println(a + " " + b);

        FibonacciRecursive();
    }

    static void FibonacciRecursive() {
        nextInSeq = a + b;

        if (nextInSeq < seqLimit) {
            a = b;
            b = nextInSeq;

            System.out.println(" " + nextInSeq);
            FibonacciRecursive();
        }
    }
}