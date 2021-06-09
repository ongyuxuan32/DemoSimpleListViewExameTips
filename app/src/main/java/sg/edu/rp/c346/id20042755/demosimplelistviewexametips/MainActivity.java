package sg.edu.rp.c346.id20042755.demosimplelistviewexametips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    String[] arrTips;
    String[] examtiparr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.ListViewExamTips);
        examtiparr = new String[5];
        examtiparr[0] = "Dont read the code, code it as much as possible during each pratical session";
        examtiparr[1] = "Seek help from the lecturer ASAP, dont wait till you lost in the jungle";
        examtiparr[2] = "Prepare your template source code for each topic";
        examtiparr[3] = "Create a few empty Android project to speed up your coding during exam";
        examtiparr[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                examtiparr);

        lvExamTips.setAdapter(adapter);

    }
}