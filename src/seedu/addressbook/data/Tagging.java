package seedu.addressbook.data;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

import java.util.ArrayList;

public class Tagging {

    private static ArrayList<String> tagsChanges = new ArrayList<String>();

    private final String ADDITION_SYMBOL = "+";
    private final String DELETION_SYMBOL = "-";

    public void addTags(Person person, Tag tag){
        tagsChanges.add("ADDITION_SYMBOL" + " " + person.getName() + tag.tagName);
    }

    public void deleteTags(Person person, Tag tag){
        tagsChanges.add("DELETION_SYMBOL" + " " + person.getName() + tag.tagName);
    }

    public ArrayList<String> getTaggingChanges() {
        return tagsChanges;
    }
}
