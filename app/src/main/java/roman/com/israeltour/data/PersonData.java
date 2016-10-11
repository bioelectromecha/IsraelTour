package roman.com.israeltour.data;


/**
 * enum class for holding our places - I guess in a real app it should be held in assets or gotten from the internet
 */
public enum PersonData {
    ADI_SHAMIR("Adi Shamir", "an Israeli cryptographer. He is a co-inventor of the RSA algorithm (along with Ron Rivest and Len Adleman)"),
    DOV_MORAN("Dov Moran", "an Israeli entrepreneur, inventor, and investor, best known as the inventor of the USB memory stick."),
    BENJAMIN_NETANYAHU("Benjamin Netanyahu ", "The prime minister of Israel");

    private final String name;
    private final String description;

    //instantiates an enum
    PersonData(String name, String description) {
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
