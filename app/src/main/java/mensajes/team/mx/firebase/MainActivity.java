package mensajes.team.mx.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    TextView text_view;
    ImageView image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_view = (TextView)findViewById(R.id.text_view);
        image_view = (ImageView)findViewById(R.id.image_view);

        if(getIntent().getExtras() != null) {
            for(String key: getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                text_view.append("\n" + key + ": " + value);
            }
        }


        Glide.with(this)
                .load("http://inthecheesefactory.com/uploads/source/glidepicasso/cover.jpg")
                .into(image_view);

    }
}
