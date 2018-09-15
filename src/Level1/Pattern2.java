package Level1;

public class Pattern2 {

    int size;

    public Pattern2(int size) {
        this.size = size;
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
                System.out.print(""+j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Pattern2 pattern2 = new Pattern2(5);
        pattern2.pattern();
    }
}
