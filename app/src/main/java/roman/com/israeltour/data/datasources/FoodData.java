package roman.com.israeltour.data.datasources;


import roman.com.israeltour.R;

/**
 * enum class for holding our places - I guess in a real app it should be held in assets or gotten from the internet
 */
public enum FoodData {
    HUMMUS(R.string.hummus_name, R.string.hummus_description),
    BULGUR(R.string.bulgur_name, R.string.bulgur_description),
    FALAFEL(R.string.falafel_name, R.string.falafel_description);

    private final int nameId;
    private final int descriptionId;

    //instantiates an enum
    FoodData(int nameId, int descriptionId) {
        this.nameId = nameId;
        this.descriptionId = descriptionId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }
}
