package roman.com.israeltour.data;


/**
 * enum class for holding our places - I guess in a real app it should be held in assets or gotten from the internet
 */
public enum FoodData {
    HUMMUS("Hummus", "a Levantine and Egyptian food dip or spread made from cooked, mashed chickpeas or other beans"),
    BULGUR("Bulgur", "a cereal food made from the groats of several different wheat species"),
    FALAFEL("Falafel ", "a deep-fried ball or patty made from ground chickpeas, fava beans, or both");

    private final String name;
    private final String description;

    //instantiates an enum
    FoodData(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
