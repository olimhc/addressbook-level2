package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.ArrayList;
import java.util.List;

/**
 * Sorts all person in the address book in alphabetical order.
 */
public class SortCommand extends Command{

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts and all person in the address book in alphabetical order.\n"
            + "Example: " + COMMAND_WORD;

    /**
     * @param unsortedPersons
     * @return Returns a sorted List of persons.
     */
    private List<ReadOnlyPerson> sortByName(List<ReadOnlyPerson> unsortedPersons){
        unsortedPersons.sort((person1,person2)-> (person1.getName().toString()).compareToIgnoreCase(person2.getName().toString()));
        return unsortedPersons;
    }

    @Override
    public CommandResult execute(){
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        List<ReadOnlyPerson> unsortedPersons = new ArrayList<>(allPersons);
        List<ReadOnlyPerson> sortedPersons = sortByName(unsortedPersons);
        return new CommandResult(getMessageForPersonListShownSummary(sortedPersons), sortedPersons);
    }


}
