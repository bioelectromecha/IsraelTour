package roman.com.israeltour.data.datasources;


import roman.com.israeltour.R;

/**
 * enum class for holding our places - I guess in a real app it should be held in assets or gotten from the internet
 */
public enum PersonData {
    ADI_SHAMIR(R.string.adi_shamir_name, R.string.adi_shamir_description),
    DOV_MORAN(R.string.dov_moran_name, R.string.dov_moran_description),
    BENJAMIN_NETANYAHU(R.string.benjamin_netanyahu_name, R.string.benjamin_netanyahu_description);

    private final int nameId;
    private final int descriptionId;

    //instantiates an enum
    PersonData(int name, int descriptionId) {
        this.nameId = name;
        this.descriptionId = descriptionId;
    }

    public int getNameId() {
        return nameId;
    }

    public int getDescription() {
        return 0;
    }

    public int getDescriptionId() {
        return descriptionId;
    }



}
