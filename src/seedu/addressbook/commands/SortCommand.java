package seedu.addressbook.commands;

/**
 * Sorts all person in the address book in alphabetical order.
 */
public class SortCommand extends Command{

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts and all person in the address book in alphabetical order.\n"
            + "Example: " + COMMAND_WORD;
}
