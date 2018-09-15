package Level1;

public class Pattern6 {

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pattern6(int size) {

        this.size = size;
    }

    private void pattern() {
        for (int i = this.size; i >=1; i--) {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {


        Pattern6 pattern6 = new Pattern6(5);
        pattern6.pattern();
    }
}
