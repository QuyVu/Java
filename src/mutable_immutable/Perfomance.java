package mutable_immutable;

public class Perfomance {
    public static void main(String[] args) {
        int N = 77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println("time to use StringBuffer: " + (System.currentTimeMillis() - t));
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println("Time to use StringBuilder: " + (System.currentTimeMillis() - t));
        }
    }
}
