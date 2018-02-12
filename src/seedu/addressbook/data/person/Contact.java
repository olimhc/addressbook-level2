package seedu.addressbook.data.person;

/**
 * Holds the contact variables
 */
public class Contact {
    protected boolean isPrivate;
    public String value;
    public static String CONTACT_VALIDATION_REGEX = ""; //to be overwritten in sub-class


    public Contact(boolean isPrivate){
        this.isPrivate = isPrivate;
    }

    /**
     * Returns true if a given string is in its valid format
     *  @Override
     */
    public boolean isValid(String test){
        return test.matches(CONTACT_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isPrivate() {
        return isPrivate;
    }
}

