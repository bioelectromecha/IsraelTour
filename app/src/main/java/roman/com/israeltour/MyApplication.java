package roman.com.israeltour;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by roman on 10/10/16.
 */

public class MyApplication extends Application {
    private static Context sContext;
    private static final String MAIN_PACKAGE_NAME = "roman.com.israeltour";

    @Override
    public void onCreate() {
        super.onCreate();
        MyApplication.sContext = getApplicationContext();
    }

    /**
     * get the application context
     * @return
     */
    public static Context getContext() {
        return MyApplication.sContext;
    }

    /**
     * get the application shared preferences
     * @return
     */
    public static SharedPreferences getSharePreferences() {
        return sContext.getSharedPreferences(MAIN_PACKAGE_NAME, MODE_PRIVATE);
    }
}