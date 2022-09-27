public class Main {

    public static void main (String[] args) {
        //loop for
        int tab[] = new int[7];
        tab[0] = 6;
        tab[1] = 8;
        tab[2] = 4;
        tab[3] = 1;
        tab[4] = 8;
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Tab element = " + tab[i]);
        }
        for (int x : tab) {
            System.out.println(x);
        }
        // loop while
        int n = 10;
        while (n >= 0) {
            System.out.println("value " + n);
            n--;
        }
        // do while
        do {
            System.out.println("text ");
            n++;
        }
        while (n < 3);
        {
            System.out.println("the end");
        }
        //
        int table[][] = {{4, 5, 6}, {1, 2, 3}};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.println(table[i][j]);
            }
        }
        //
        for (int a = 5; a > 0; a--) {
            for (int b = 5; b < 10; b++)
                System.out.println("Value a = " + a + ", Value b = " + b);
        }
    }
}