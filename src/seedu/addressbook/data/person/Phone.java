package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's phone number in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValid(String)}
 */
public class Phone extends Contact{

    public static final String EXAMPLE = "123456789";
    private static final String MESSAGE_PHONE_CONSTRAINTS = "Person phone numbers should only contain numbers";
    private static final String PHONE_VALIDATION_REGEX = "\\d+";

    /**
     * Validates given phone number.
     *
     * @throws IllegalValueException if given phone string is invalid.
     */
    public Phone(String phone, boolean isPrivate) throws IllegalValueException {
        super(isPrivate);
        CONTACT_VALIDATION_REGEX = PHONE_VALIDATION_REGEX;
        String trimmedPhone = phone.trim();
        if (!isValid(trimmedPhone)) {
            throw new IllegalValueException(MESSAGE_PHONE_CONSTRAINTS);
        }
        this.value = trimmedPhone;
    }

    /**
     * Returns true if the given string is a valid person phone number.
     */

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Phone // instanceof handles nulls
                && this.value.equals(((Phone) other).value)); // state check
    }

}
