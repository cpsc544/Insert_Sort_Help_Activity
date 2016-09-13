package cpsc544.stacksort;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AboutUSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // The following makes it so that the back button goes back to the main page
        Button getMain = (Button) findViewById(R.id.back_btn);
        getMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View mView) {
                Intent main = new Intent(AboutUSActivity.this, MainPage.class);
                startActivity(main);
            }
        });
    }
}
