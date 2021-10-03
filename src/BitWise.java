public class BitWise {
    public int divby2(int x) {
        return x >> 1; // returning the value

    }

    public int multBy2(int x) {
        return x << 1; 
    }

    public int log2(int x) {
        int count = 0;
        while ((x >>= 1) != 0)
            count++; // storing the value 

        return count;
    }
}
