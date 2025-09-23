
public class LC_165 {

    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int[] ar1 = new int[ver1.length];
        int[] ar2 = new int[ver2.length];
        for (int i = 0; i < ver1.length; i++) {
            ar1[i] = Integer.parseInt(ver1[i]);
        }
        for (int i = 0; i < ver2.length; i++) {
            ar2[i] = Integer.parseInt(ver2[i]);
        }
        int i = 0;

        while (i < ar1.length && i < ar2.length) {
            int a = 0;
            int b = 0;
            if (i < ar1.length) {
                a = ar1[i];
            }
            if (i < ar2.length) {
                b = ar2[i];
            }
            if (a > b) {
                return 1;
            } else if (a < b) {
                return -1;
            }
            i++;
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.2", "1.10"));
    }
}
