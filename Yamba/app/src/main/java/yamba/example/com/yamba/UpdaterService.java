package yamba.example.com.yamba;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by cotyembry on 3/23/15.
 */
public class UpdaterService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
