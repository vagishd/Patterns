package Level1;

public class Pattern3 {

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pattern3(int size) {

        this.size = size;
    }

    public void pattern() {
        for (int i = 1; i <= this.size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("" + i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Pattern3 pattern3 = new Pattern3(5);
        pattern3.pattern();
    }
}
