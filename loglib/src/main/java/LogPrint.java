import android.util.Log;

/**
 * Created by maddy on 5/9/17.
 */

public class LogPrint {
    private String logTag = "Log Gradle Tag";

    public LogPrint(String value){
        Log.d(logTag,value);
    }
}
