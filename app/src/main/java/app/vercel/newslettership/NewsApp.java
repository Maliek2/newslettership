package app.vercel.newslettership;

import android.util.Log;

public class Newslettership{

    public static void logEnvironment() {
        Log.d(NewsApp.class.toString(), BuildConfig.ENV);
    }
}
