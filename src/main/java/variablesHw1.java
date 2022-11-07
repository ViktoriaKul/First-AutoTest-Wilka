public class variablesHw1 {
    public static void main (String[] args){

        //section for sentence
        int count = 16;
        String space = " ";
        System.out.println("My group contains" + space + count + space + "persons");

        //section for sum
        int nmb = 8;
        int addend = 2;
        int sum = nmb + addend;
        String equal = "=";
        String plus = "+";
        String textForSum = "8 + 2 = ";
        System.out.println(sum);
        System.out.println(nmb + space + plus + space + addend + space + equal + space + (sum));
        System.out.println(textForSum + (sum));

        //section for multiplication
        int multNmb = 5;
        int multSum = multNmb + multNmb;
        String textForMult = "5 + 5 = ";
        System.out.println(multSum);
        System.out.println(textForMult + (multSum));

        //section for sqrt
        int nmbForSqrt = 16;
        double sqrt = Math.sqrt(nmbForSqrt);
        String textForSqrt = "sqrt(16) = ";
        System.out.println(sqrt);
        System.out.println(textForSqrt + sqrt);
        System.out.println(space);

        //section for min\max
        int intervalStart = 3;
        int intervalEnd = 28;
        int min = Math.min(intervalStart, intervalEnd);
        int max = Math.max(intervalStart, intervalEnd);
        System.out.println("Math.min(3, 28 = " + min);
        System.out.println(max);

        //section for abs
        int nmbForAbs = 16;
        int abs = Math.abs(- nmbForAbs);
        String textForAbs = "Math.abs(-16) = ";
        System.out.println(textForAbs + abs);

    }
}
