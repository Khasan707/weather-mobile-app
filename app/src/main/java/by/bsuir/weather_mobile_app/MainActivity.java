package by.bsuir.weather_mobile_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ErrorDialogFragment errorDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        errorDialogFragment = new ErrorDialogFragment();

        findViewById(R.id.update_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                errorDialogFragment.show(getSupportFragmentManager(), "errorDialogFragment");
            }
        });
    }
}
