package id.fauzi.food_dicoding;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PreviewActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_IMAGES = "extra_images";
    private String title = "Detail";

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        setActionBarTitle(title);

        ImageView IvImgReceived = findViewById(R.id.tv_imgReceived);
        TextView tvNameReceived = findViewById(R.id.tv_nameReceived);
        TextView tvDetailReceived = findViewById(R.id.tv_detailReceived);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        int img = getIntent().getIntExtra(EXTRA_IMAGES,1);

        tvNameReceived.setText(name);
        tvDetailReceived.setText(detail);
        IvImgReceived.setImageResource(img);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
