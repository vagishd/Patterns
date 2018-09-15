package Level1;

public class Pattern5 {

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pattern5(int size) {

        this.size = size;
    }

    private void pattern() {
        for (int i = this.size; i >= 1; i--) {
            for (int j = this.size; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Pattern5 pattern5 = new Pattern5(5);
        pattern5.pattern();
    }
}
