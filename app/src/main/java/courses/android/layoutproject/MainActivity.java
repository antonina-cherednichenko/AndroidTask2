package courses.android.layoutproject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.main_layout);
        mainLayout.addView(createRightLayout());
    }

    private LinearLayout createRightLayout() {
        LinearLayout rightLayout = new LinearLayout(this);
        rightLayout.setOrientation(LinearLayout.VERTICAL);
        rightLayout.setBackgroundColor(Color.GREEN);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
        int dpValue = 10; // margin in dips
        float d = this.getResources().getDisplayMetrics().density;
        int margin = (int) (dpValue * d);
        params.setMargins(margin, margin, margin, margin);
        rightLayout.setLayoutParams(params);


        rightLayout.addView(createTextView());
        rightLayout.addView(createTextView());
        rightLayout.addView(createTextView());

        return rightLayout;
    }


    private TextView createTextView() {
        TextView textView = new TextView(this);
        textView.setBackgroundColor(Color.WHITE);
        textView.setText(R.string.some_text);

        textView.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_launcher, 0, 0, 0);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        int dpValue = 5; // margin in dips
        float d = this.getResources().getDisplayMetrics().density;
        int margin = (int) (dpValue * d);
        params.setMargins(margin, margin, margin, margin);
        textView.setLayoutParams(params);
        return textView;

    }
}