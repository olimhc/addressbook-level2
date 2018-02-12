package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValid(String)}
 */
public class Address extends Contact{

    public static final String EXAMPLE = "123, some street";
    private static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    private final String ADDRESS_VALIDATION_REGEX = ".+";


    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate)throws IllegalValueException {
        super(isPrivate);
        CONTACT_VALIDATION_REGEX = ADDRESS_VALIDATION_REGEX;
        String trimmedAddress = address.trim();
        if (!isValid(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = trimmedAddress;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }




}
