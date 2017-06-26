/**
 * Created by Alice Colt.
 *
 *
 * Interface Word Dictionary
 */

public interface Dictionary
{

    // Returns if the given 'str' is a valid word
    boolean isWord(String str);

    // Returns if the given 'str' is a prefix of at least one word in the dictionary
    boolean isPrefix(String str);

    
}// Dictionary interface
