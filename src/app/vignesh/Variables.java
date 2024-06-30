package app.vignesh;

public class Variables {
    public static void main(String[] args) {
        // primitive variables
        // boolean
        boolean isChild = true;
        boolean isAdult = false;
        System.out.println(isChild);
        System.out.println(isAdult);

        // character
        char a = 'A';
        System.out.println(a);

        // numbers
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println(minByte);
        System.out.println(maxByte);

        short minShort = -32768;
        short maxShort = 32767;
        System.out.println(minShort);
        System.out.println(maxShort);

        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;
        System.out.println(minInt);
        System.out.println(maxInt);

        long minLong = -9_223_372_036_854_775_80L;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println(minLong);
        System.out.println(maxLong);

        float floatValue = 1.23f;
        System.out.println(floatValue);

        double doubleValue = 31.2345;
        System.out.println(doubleValue);

    }
}
