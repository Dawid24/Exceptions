
public class Main {
    public static void main(String[] args) {
        int index = 5;

        try {
            int[] tab = new int[50];
            tab[index] = 6;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Poleciał błąd: ");
            e.printStackTrace();

        } finally {
            System.out.println("Finally");
        }

        System.out.println("bla bla bla");
    }
}
