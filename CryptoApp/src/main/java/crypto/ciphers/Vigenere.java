/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto.ciphers;

import java.util.HashMap;

/**
 *
 * @author jpssilve
 */
public class Vigenere {

    private char[] alphabet;
    private HashMap<Character, Integer> abcNumbers;
    private int modulus;

    public Vigenere() {
        this.alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        this.abcNumbers = new HashMap<>();
        this.modulus = this.alphabet.length;
        hashAlphabet();
    }

    private void hashAlphabet() {
        for (int i = 0; i < this.alphabet.length; i++) {
            this.abcNumbers.put(this.alphabet[i], i);
        }
    }

    protected String lengthenKey(String key, int textLen) {
        if (key.length() >= textLen) {
            return key;
        }
        
        String keyMultiple = key;
        int rounds = (int) (textLen / key.length()) - 1;

        while (rounds > 0) {
            keyMultiple += key;
            rounds--;
        }

        if (textLen > keyMultiple.length()) {
            keyMultiple += key.substring(0, textLen - keyMultiple.length());
        }

        return keyMultiple;
    }

    public String encrypt(String key, String plaintext) {
        if (key.length() == 0) {
            return plaintext.toLowerCase();
        }
        
        String plaintextLowerCase = plaintext.toLowerCase();
        String encryptKey = lengthenKey(key.toLowerCase(), plaintextLowerCase.length());
        char[] encryptedChars = new char[plaintext.length()];
        
        for (int i = 0; i < plaintextLowerCase.length(); i++) {
            int keyAlphabetNum = this.abcNumbers.get(encryptKey.charAt(i));
            int plaintextAlphabetNum = this.abcNumbers.get(plaintextLowerCase.charAt(i));

            encryptedChars[i] = this.alphabet[(keyAlphabetNum + plaintextAlphabetNum) % this.modulus];
        }

        return new String(encryptedChars);
    }

    public String decrypt(String key, String ciphertext) {
        if (key.length() == 0) {
            return ciphertext.toLowerCase();
        }
        
        String ciphertextLowerCase = ciphertext.toLowerCase();
        String decryptKey = lengthenKey(key.toLowerCase(), ciphertextLowerCase.length());
        char[] decryptedChars = new char[ciphertext.length()];
        
        for (int i = 0; i < ciphertextLowerCase.length(); i++) {
           int keyAlphabetNum = this.abcNumbers.get(decryptKey.charAt(i));
           int ciphertextAlphabetNum = this.abcNumbers.get(ciphertextLowerCase.charAt(i));
           
           decryptedChars[i] = this.alphabet[(((ciphertextAlphabetNum - keyAlphabetNum) % this.modulus) + this.modulus) % this.modulus];
        }
        
        return new String(decryptedChars);
    }
}
