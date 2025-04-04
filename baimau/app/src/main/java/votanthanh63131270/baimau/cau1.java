package votanthanh63131270.baimau;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class cau1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau1);

        EditText edtSoA = findViewById(R.id.edtSoA);
        EditText edtSoB = findViewById(R.id.edtSoB);
        Button btnTinhTong = findViewById(R.id.btnTinhTong);
        TextView txtKetQua = findViewById(R.id.txtKetQua);

        btnTinhTong.setOnClickListener(view -> {
            String strA = edtSoA.getText().toString();
            String strB = edtSoB.getText().toString();

            if (!strA.isEmpty() && !strB.isEmpty()) {
                int a = Integer.parseInt(strA);
                int b = Integer.parseInt(strB);
                txtKetQua.setText("Kết quả: " + (a + b));
            } else {
                txtKetQua.setText("Vui lòng nhập đủ hai số!");
            }
        });
    }
}
