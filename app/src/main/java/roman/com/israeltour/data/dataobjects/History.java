package roman.com.israeltour.data.dataobjects;

/**
 * The class is a dataobject that holds a piece of history
 */
public class History {
    private String mName;
    private String mDescription;

    /**
     *  main and only constructor
     * @param name name of the history piece
     * @param description short description of what the place is about
     */
    public History(String name, String description) {
        mName = name;
        mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

}
