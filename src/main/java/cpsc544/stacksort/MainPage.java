package cpsc544.stacksort;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {
    //*******************************************************************************************
    // the lines of code below are in order to make the application begin on the main page
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);


        // variable definitions
        ImageButton getHelp = (ImageButton) findViewById(R.id.helpBtn);
        ImageButton getAbout = (ImageButton) findViewById(R.id.aboutButton);
        Button getSort = (Button) findViewById(R.id.sortBtn);
        final EditText in;
        final TextView out;
        int upperLimit = 99999999;
        int lowerLimit = 10;


        //***************************************************************************************
        // the following lines of code are to make the help button take you to the help activity
        getHelp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View mView) {
                Intent help = new Intent(MainPage.this, Help.class);
                startActivity(help);
            }
        });
        //****************************************************************************************
        // The following lines of code are to make the about button take you to the about us page
        getAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View nView) {
                Intent about = new Intent(MainPage.this, AboutUSActivity.class);
                startActivity(about);
            }
        });
// the following lines of code takes the user input and prints it out
        getSort.setOnClickListener(new View.OnClickListener() {
            public void onClick(View oView) {

                EditText name = (EditText) findViewById(R.id.userInput);
            }
        });


        in = (EditText) findViewById(R.id.userInput);
        out = (TextView) findViewById(R.id.userOutput);
        Button sortingButton = (Button) findViewById(R.id.sortBtn);


        sortingButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int upperLimit = 99999999;                                      // max 8 numbers
                int lowerLimit = 10;                                            // minimum of 2 numbers
                String display = in.getText().toString();
                out.setText("");                                                // this is to clear old entries
                int myNum = Integer.parseInt(display);                          // converts the input into an integer

                // error checking ***************************************************************
                if (myNum < lowerLimit) {
                    display = "Error! Please Enter at least 2 integers";
                }
                if (myNum > upperLimit) {
                    display = "Error! You have entered too many numbers";
                }


//*************************Borrowed this code will have to come back and re do

                int[] array = new int[display.length()];
                for (int i = 0; i < display.length(); i++) {
                    try {
                        array[i] = Integer.parseInt(display);                // converts display to integer array
                    } catch (NumberFormatException nfe) {
                    }

                    out.append("\n" + array[i]); //************************ this line is the output line at this momennt
                }

            }

        });

    }

    public void insertionSort(int input[], TextView out) {
        int n = input.length;
        for (int j = 1; j < n; j++) {
            int key = input[j];
            int i = j-1;
            while ( (i > -1) && ( input [i] > key ) ) {
                input [i+1] = input [i];
                i--;

                out.append(" " + input[i]);
            }
            input[i+1] = key;


        }
    }
}
