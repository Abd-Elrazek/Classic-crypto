package crypto.helpers;

/**
 * A helper class to keep track of the most likely characters in a Vigenere
 * encryption key, based on the double chi-squared value that is the second
 * parameter.
 *
 * @author jpssilve
 */
public class CharacterValue implements Comparable<CharacterValue> {

    private char character;
    private double value;

    /**
     *
     * @param character The character candidate for the encryption key
     * @param value A double value that corresponds to the character
     */
    public CharacterValue(char character, double value) {
        this.character = character;
        this.value = value;
    }

    public char getCharacter() {
        return character;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        CharacterValue comparison = (CharacterValue) obj;

        return this.character == comparison.character && Double.valueOf(this.value).equals(comparison.value);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.character;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
        return hash;
    }

    /**
     * CharacterValues are ordered based on the double value only and using the
     * natural order of double values.
     *
     * @param other The CharacterValue to be compared to
     * @return A negative value if this double value is smaller than the other
     * double value, 0 if they are equal and positive otherwise
     */
    @Override
    public int compareTo(CharacterValue other) {
        return Double.compare(this.value, other.value);
    }
}
