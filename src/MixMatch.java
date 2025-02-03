public class MixMatch {
    public static void main(String[] args){
        String varString = "Hello";
        char varChar = 'B';
        short varShort = 1000;
        int varInt = 200877899;
        long varLong = 123456789L;
        float varFloat = 2.23f;
        double varDouble = 2.1454;
        boolean varBool = true;

        System.out.println(varString + " <- String stores a sequence of characters.");
        System.out.println(varChar + " <- Char stores a single character.");
        System.out.println(varShort + " <- Short stores whole numbers, ranging from -32768 to 32767. ");
        System.out.println(varInt + " <- Integer is a 32-bit signed integer that stores whole numbers with a wider range, from -2,147,483,648 to 2,147,483,647, inclusive.");
        System.out.println(varLong + " <- Long is a 64-bit signed integer that stores large whole numbers ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, inclusive.");
        System.out.println(varFloat + " <- Float stores decimal numbers with 6-7 significant digits.");
        System.out.println(varDouble + " <- Double stores decimal numbers with 15-16 significant digits.");
        System.out.println(varBool + " <- Boolean stores true or false values.");

        System.out.println("Variables: " + varInt + ", " + varDouble + ", " + varBool + ", " + varString);
    }
}