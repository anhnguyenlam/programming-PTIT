import java.util.Scanner;

public class JAVA07_sap_xep_chon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(a[min] > a[j]) min = j;
            }
            if(min != i) swap(a, min , i);
            System.out.print("Buoc " + (i+1) + ": ");
            for (int j = 0; j < n; j++) System.out.print(a[j] + " ");
            System.out.print("\n");
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
