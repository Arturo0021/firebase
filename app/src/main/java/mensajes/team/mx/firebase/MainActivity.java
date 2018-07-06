package mensajes.team.mx.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_view = (TextView)findViewById(R.id.text_view);

        if(getIntent().getExtras() != null) {
            for(String key: getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                text_view.append("\n" + key + ": " + value);
            }
        }

    }
}
