package appewtc.masterung.bsrufriend;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passEditText;
    private ImageView imageView;
    private RadioGroup radioGroup;
    private Button button;
    private String nameString, userString, passString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

    }   // Main Method

    private void buttonController() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Get Value From Edit text
                nameString = nameEditText.getText().toString().trim();
                userString = userEditText.getText().toString().trim();
                passString = passEditText.getText().toString().trim();

                //Check Space
                if (nameString.equals("") || userString.equals("") || passString.equals("")) {
                    // True ==> Have Space

                }

            }   // onClick
        });

    }   // buttonController

    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText3);
        userEditText = (EditText) findViewById(R.id.editText4);
        passEditText = (EditText) findViewById(R.id.editText5);
        imageView = (ImageView) findViewById(R.id.imageView4);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        button = (Button) findViewById(R.id.button3);

    }   // bindWidget

}   // Main Class
