package Level1;

public class P1 {

    int arr[];
    int size;

    public P1(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public P1(int size) {
        this.size = size;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void pattern() {
        for (int i = 1; i <= this.size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        P1 pattern = new P1(5);
        pattern.pattern();

    }

}
