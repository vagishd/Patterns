package Level1;

public class Pattern7 {

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pattern7(int size) {

        this.size = size;
    }

    private void pattern() {
        for (int i = 1; i <= this.size; i++) {
            for (int j = this.size; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Pattern7 pattern7 = new Pattern7(5);
        pattern7.pattern();
    }
}
