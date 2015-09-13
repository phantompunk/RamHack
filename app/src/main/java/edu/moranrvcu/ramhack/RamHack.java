package edu.moranrvcu.ramhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.reimaginebanking.api.java.NessieClient;

public class RamHack extends AppCompatActivity {

    NessieClient nessieClient = NessieClient.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        nessieClient.setAPIKey("ad0641a1b2d5df46729a934857de7498");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ram_hack);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ram_hack, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
