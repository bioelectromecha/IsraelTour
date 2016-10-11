package roman.com.israeltour.data;


import roman.com.israeltour.R;


/**
 * enum class for holding our places - I guess in a real app it should be held in assets or gotten from the internet
 */
public enum PlaceData {
    BAHAI_GARDENS("Bahai Gardens", "The Terraces of the Bahá'í Faith, also known as the Hanging Gardens of Haifa, are garden terraces around the Shrine of the Báb on Mount Carmel in Haifa, Israel.", R.drawable.ic_bahai_gardens),
    CHURCH_OF_HOLY_SCRIPTURE("Church of Holy Scripture", "The Church of the Holy Sepulchre is a church within the Christian Quarter of the Old City of Jerusalem.", R.drawable.ic_church_of_holy_scripture),
    DOME_OF_THE_ROCK("Dome of the Rock", "The Dome of the Rock ) is a shrine located on the Temple Mount in the Old City of Jerusalem", R.drawable.ic_dome_of_the_rock);

    private final String name;
    private final String description;
    private final int drawableId;

    //instantiates an enum
    PlaceData(String name, String description, int drawableId) {
        this.name = name;
        this.description = description;
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDrawableId() {
        return drawableId;
    }
}
