package com.ugurciftc.scrollingtext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView2);
        registerForContextMenu(textView);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_1:
                Toast.makeText(this,"Option 1 Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option_2:
                Toast.makeText(this,"Option 2 Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option_3:
                Toast.makeText(this,"Option 3 Selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return  super.onContextItemSelected(item);
        }
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.example_menu,menu);

    }
}
