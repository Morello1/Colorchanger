package lt.vtvpmc.ems.colorchanger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ImageView image_view;
    private Button buttonRed;
    private Button buttonGreen;
    private Button buttonBlue;
    private Button buttonBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image_view=(ImageView)findViewById(R.id.image_view);
        buttonRed=(Button)findViewById(R.id.buttonRed);
        buttonGreen=(Button)findViewById(R.id.buttonGreen);
        buttonBlue=(Button)findViewById(R.id.buttonBlue);
        buttonBackground=(Button)findViewById(R.id.buttonBackground);

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                image_view.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                image_view.setBackgroundColor(getResources().getColor(R.color.Blue));
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                image_view.setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

    }
}
