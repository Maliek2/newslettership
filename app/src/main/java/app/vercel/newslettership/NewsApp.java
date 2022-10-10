package app.vercel.newslettership;

import android.util.Log;

public class NewsApp{

    public static void logEnvironment() {
        Log.d(NewsApp.class.toString(), BuildConfig.ENV);
    }
}
