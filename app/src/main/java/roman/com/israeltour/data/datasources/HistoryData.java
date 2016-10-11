package roman.com.israeltour.data.datasources;

import roman.com.israeltour.R;

/**
 * Created by roman on 10/10/16.
 */

public enum  HistoryData  {
    INDEPENDENCE(R.string.independence_name, R.string.independence_description),
    SIX_DAY_WAR(R.string.six_day_war_name, R.string.six_day_war_description),
    YOM_KIPUR_WAR(R.string.yom_kipur_war_name, R.string.yom_kipur_war_description);

    private final int nameId;
    private final int descriptionId;

    //instantiates an enum
    HistoryData(int nameId, int descriptionId) {
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
