package roman.com.israeltour.data.dataobjects;

/**
 * The class is a dataobject that holds a food
 */
public class Food {
    private int mNameId;
    private int mDescription;

    /**
     *  main and only constructor
     */
    public Food(int nameId, int descriptionId) {
        mNameId = nameId;
        mDescription = descriptionId;
    }

    public int getNameId() {
        return mNameId;
    }

    public void setNameId(int nameId) {
        mNameId = nameId;
    }

    public int getDescriptionId() {
        return mDescription;
    }

    public void setDescription(int description) {
        mDescription = description;
    }

}
