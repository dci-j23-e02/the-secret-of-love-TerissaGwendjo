public class SecretOfLOve {
    public static void main (String []args) {
        String loveSecret = "my_love_is_my_love";
        String loveName = "Derick";
        int year = 1987;
        String cipheredSecret = cipherSecret(loveSecret, loveName, year);
        System.out.println(cipheredSecret);
    }
    public static String cipherSecret(String loveSecret, String loveName, int yearOfBirth){
        //check if the secret is at least 8 characters

        if (loveSecret.length() < 8) {
            return "Secret is too short";
        }

        //concatenate the love secret with the love name
        String concatenatedSecret = loveSecret + loveName;

        // Reverse the concatenated string
        StringBuilder reversedString = new StringBuilder(concatenatedSecret);
        reversedString.reverse();

        // Concatenate the reversed string with the year of birth
        String cipheredSecret = reversedString.toString() + yearOfBirth;

        // Return the ciphered secret
        return cipheredSecret;


    }

}
