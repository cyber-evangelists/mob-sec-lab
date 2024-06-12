package infosecadventures.allsafe.plugin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Loader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
    }

    public static Object loadPlugin(){
        try {
            Runtime.getRuntime().exec("touch /data/data/infosecadventures.allsafe/compromised1337").waitFor();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return null;
    }
}
