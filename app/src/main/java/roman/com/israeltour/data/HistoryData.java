package roman.com.israeltour.data;

/**
 * Created by roman on 10/10/16.
 */

public enum  HistoryData {
    INDEPENDENCE("Independence", "Israeli Declaration of Independence: the Jewish leadership in Tel-Aviv declared the establishment of a Jewish state in Eretz Israel to be known as the State of Israel"),
    SIX_DAY_WAR("Six Day War", "as fought between Israel and all of its neighboring countries: Egypt, Jordan, Syria and Lebanon, which were aided by other Arab countries"),
    YOM_KIPUR_WAR("Yom Kipur War ", "began with a surprise joint attack on two fronts by the armies of Syria (in the Golan Heights) and Egypt (in the Suez Canal)");

    private final String name;
    private final String description;

    //instantiates an enum
    HistoryData(String name, String description) {
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
