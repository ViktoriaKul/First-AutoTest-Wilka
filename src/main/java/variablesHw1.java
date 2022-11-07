public class variablesHw1 {
    public static void main (String[] args){

        int count = 16;
        String space = " ";
        System.out.println("My group contains" + space + count + space + "persons");

        int nmb = 8;
        int addend = 2;
        int firstSum = nmb + addend;
        String equal = "=";
        String plus = "+";
        System.out.println(firstSum);
        System.out.println(nmb + space + plus + space + addend + space + equal + space + (firstSum));
        System.out.println("8 + 2 = " + (firstSum));

        System.out.println(firstSum);
        System.out.println("5 + 5 = " + (5+5));

        int nmbForSqrt = 16;
        double sqrt = Math.sqrt(nmbForSqrt);
        System.out.println(sqrt);
        System.out.println("sqrt(16) = " + sqrt);
        System.out.println(space);

        int intervalStart = 3;
        int intervalEnd = 28;
        int min = Math.min(intervalStart, intervalEnd);
        int max = Math.max(intervalStart, intervalEnd);
        int abs = Math.abs(- nmbForSqrt);
        System.out.println("Math.min(3, 28 = " + min);
        System.out.println(max);
        System.out.println("Math.abs(-16) = " + abs);

    }
}
