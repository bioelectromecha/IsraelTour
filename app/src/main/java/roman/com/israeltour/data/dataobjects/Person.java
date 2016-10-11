package roman.com.israeltour.data.dataobjects;

/**
 * The class is a dataobject that holds a person
 */
public class Person {
    private int mNameId;
    private int mDescriptionId;

    /**
     *  main and only constructor
     * @param name name of the a peron
     * @param description short description of what the person is about
     */
    public Person(int name, int description) {
        mNameId = name;
        mDescriptionId = description;
    }

    public int getName() {
        return mNameId;
    }

    public void setName(int name) {
        mNameId = name;
    }

    public int getDescription() {
        return mDescriptionId;
    }

    public void setDescription(int description) {
        mDescriptionId = description;
    }

}
