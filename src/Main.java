public class Main {


//metode til at kryptere en string. Den kan være hvilken som helst længde.
    public static String encrypt(String s) {

    //Laver et char array så vi kan ændre alle bogstaverne.
        char[] chars = new char[s.length()];

    //loop til at gennemgå alle bogstaverne i "String s"
        for (int i = 0; i < s.length(); i++) {

        //opretter en char "c" som skal være det samme som "String s.charAt(i)"
            char c = s.charAt(i);

        //en char har en ASCII værdi. Den værdi plusser vi op med 451
            //https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
            c += 451;
        //gemmer den nye "c" værdi til chars[i]
            chars[i] = c;
        }
    //returnere vores Chars array som en String
        return String.valueOf(chars);
    }


    //samme metode er brugt i decrypt. Det er bare modsat steps af encrypt
    public static String decrypt(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            c -= 451;
            chars[i] = c;
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        String encrypted = encrypt("adminPassword1234");

        System.out.println("encrypted: " + encrypted);

        String decrypted = decrypt(encrypted);
        System.out.println("decrypted: " + decrypted);
    }
}