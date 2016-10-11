package roman.com.israeltour.data.datasources;


import roman.com.israeltour.R;


/**
 * enum class for holding our places - I guess in a real app it should be held in assets or gotten from the internet
 */
public enum PlaceData {
    BAHAI_GARDENS(R.string.bahai_gardens_name, R.string.bahai_gardens_description, R.drawable.ic_bahai_gardens),
    CHURCH_OF_HOLY_SCRIPTURE(R.string.church_of_holy_name, R.string.church_of_holy_description, R.drawable.ic_church_of_holy_scripture),
    DOME_OF_THE_ROCK(R.string.dome_of_the_rock_name, R.string.dome_of_the_rock_description, R.drawable.ic_dome_of_the_rock);

    private final int nameId;
    private final int descriptionId;
    private final int drawableId;

    //instantiates an enum
    PlaceData(int nameId, int descriptionId, int drawableId) {
        this.nameId = nameId;
        this.descriptionId = descriptionId;
        this.drawableId = drawableId;
    }

    public int getName() {
        return nameId;
    }

    public int getDescription() {
        return descriptionId;
    }

    public int getDrawableId() {
        return drawableId;
    }
}
