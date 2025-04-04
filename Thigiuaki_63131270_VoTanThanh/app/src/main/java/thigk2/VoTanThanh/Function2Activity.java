package thigk2.VoTanThanh;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Function2Activity extends AppCompatActivity {

    private EditText editTextMonth, editTextYear;
    private Button btnCheck;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function2);

        editTextMonth = findViewById(R.id.editTextText);
        editTextYear = findViewById(R.id.editTextText2);
        btnCheck = findViewById(R.id.btn_check);
        textViewResult = findViewById(R.id.textView7);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String month = editTextMonth.getText().toString().trim();
                String year = editTextYear.getText().toString().trim();

                if (month.equals("4") && year.equals("1975")) {
                    textViewResult.setText("Đúng! Chiến dịch Hồ Chí Minh toàn thắng vào 30/4/1975.");
                    textViewResult.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
                } else {
                    textViewResult.setText("Sai! Hãy thử lại.");
                    textViewResult.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                }
            }
        });
    }
}