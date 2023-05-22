package com.example.chuong5_android;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnTst, BtnCustomdialog, btnDongYId, btnHuyId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitWidget();
        btnTst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Đây là Toast", Toast.LENGTH_SHORT).show();
            }
        });
        BtnCustomdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogXacNhan();
            }
        });
    }

    // Init Widget - Khanhvtrng12
    void InitWidget() {
        btnTst = findViewById(R.id.btn_Toast);
        BtnCustomdialog = findViewById(R.id.Btn_CustomDialog);
        btnDongYId = findViewById(R.id.btnDongYId);
        btnHuyId = findViewById(R.id.btnHuyId);
    }

    //gán menu vào bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    //click chon item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings)
            Toast.makeText(this, "Bạn Đã Chọn Settings", Toast.LENGTH_SHORT).show();
        if (id == R.id.tool)
            Toast.makeText(this, "Bạn Đã Chọn Tool", Toast.LENGTH_SHORT).show();
        if (id == R.id.Exit)
            Toast.makeText(this, "Bạn Đã Chọn Exit", Toast.LENGTH_SHORT).show();
        if (id == R.id.thongtin)
            Toast.makeText(this, "Bạn Đã Chọn Thông Tin Phiên Bản", Toast.LENGTH_SHORT).show();
        if (id == R.id.qlnv)
            Toast.makeText(this, "Bạn Đã Chọn quản Lý Nhân Viên", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    private void DialogXacNhan() {
        final Dialog dialog = new Dialog(this);
        dialog.setTitle("Xác nhận ?");
        dialog.setContentView(R.layout.custom_dialog_xac_nhan);
        Button btnDongY = (Button) dialog.findViewById(R.id.btnDongYId);
        Button btnHuy = (Button) dialog.findViewById(R.id.btnHuyId);
        btnDongY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}