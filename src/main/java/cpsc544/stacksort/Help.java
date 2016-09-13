package cpsc544.stacksort;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Help extends AppCompatActivity {

    @Override //these lines of code call the activity_help xml in order to allow the user to view it
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        //button definition
        Button getMain = (Button) findViewById(R.id.back_button);

        // These few lines of code are to make the button on help screen take the app back to the
        // main screen
        getMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View mView) {
                Intent main = new Intent(Help.this, MainPage.class);
                startActivity(main);
            }
        });
    }
}