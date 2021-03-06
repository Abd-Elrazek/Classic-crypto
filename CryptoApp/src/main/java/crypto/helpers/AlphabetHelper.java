package crypto.helpers;

import crypto.datastructures.HashTable;

/**
 * A small helper class that contains methods related to alphabets that are used
 * in encryption.
 *
 * @author jpssilve
 */
public class AlphabetHelper {

    public AlphabetHelper() {

    }

    /**
     * A method which uses the character of the alphabet as the key and stores
     * the position of the character in the alphabet.
     *
     * @param alphabet The alphabet in use, usually abcdefghijklmnopqrstuvwxyz
     * @return a HashMap of character-index key-values
     */
    public HashTable<Character, Integer> hashAlphabet(String alphabet) {
        HashTable<Character, Integer> alphabetIndexes = new HashTable<>();
        for (int i = 0; i < alphabet.length(); i++) {
            alphabetIndexes.hashInsert(alphabet.charAt(i), i);
        }

        return alphabetIndexes;
    }
}
