package Level1;

public class Pattern4 {

    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Pattern4(int size) {

        this.size = size;
    }

    public void pattern() {
        for (int i = this.size; i>=1;i--)
        {
            for(int j=this.size;j>=i;j--)
            {
                System.out.print(""+j);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Pattern4 pattern4 = new Pattern4(5);
        pattern4.pattern();
    }
}
