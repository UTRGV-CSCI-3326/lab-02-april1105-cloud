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

        System.out.println(varString + " <- String, stores a sequence of characters.");
        System.out.println(varChar + " <- Char, stores a single character.");
        System.out.println(varShort + " <- Short, stores whole numbers, ranging from -32768 to 32,767. ");
        System.out.println(varInt + " <- Integer, stores whole numbers with a wider range, going into the billions, both negative and positive.");
        System.out.println(varLong + " <- Long, stores large whole numbers from the quintillions, both positive and negative.");
        System.out.println(varFloat + " <- Float, stores decimal numbers with 6-7 significant digits.");
        System.out.println(varDouble + " <- Double, stores decimal numbers with 15-16 significant digits.");
        System.out.println(varBool + " <- Boolean, stores true or false values.");

        System.out.println("Variables: " + varInt + ", " + varDouble + ", " + varBool + ", " + varString);
    }
}