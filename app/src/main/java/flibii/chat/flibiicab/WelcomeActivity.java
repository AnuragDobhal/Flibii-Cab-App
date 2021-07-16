package flibii.chat.flibiicab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity
{

    private Button WelcomeDriverButton;
    private Button WelcomeCustomerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

       WelcomeCustomerButton =(Button) findViewById(R.id.customer_welcome_btn);
        WelcomeDriverButton =(Button) findViewById(R.id.driver_welcome_btn);

        WelcomeCustomerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent LoginRegisterCustomerIntent = new Intent(WelcomeActivity.this,CustomerLoginRegisterActivity.class);
                startActivity(LoginRegisterCustomerIntent);
            }
        });

        WelcomeDriverButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent LoginRegisterDriverIntent = new Intent(WelcomeActivity.this,DriverLoginRegisterActivity.class);
                startActivity(LoginRegisterDriverIntent);
            }
        });
    }
}
