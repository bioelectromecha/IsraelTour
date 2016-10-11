package roman.com.israeltour.data.dataobjects;

/**
 * The class is a dataobject that holds a food
 */
public class Food {
    private String mName;
    private String mDescription;

    /**
     *  main and only constructor
     * @param name name of the food
     * @param description short description of what the food is about
     */
    public Food(String name, String description) {
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
