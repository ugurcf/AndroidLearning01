package com.ugurciftc.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public CheckBox chocolate,sprinkles,nuts,cherries,cookie;
    public Button showToast;
    Toast toast;
    CheckBox[] checkboxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chocolate=findViewById(R.id.checkbox1);
        sprinkles=findViewById(R.id.checkbox2);
        nuts=findViewById(R.id.checkbox3);
        cherries=findViewById(R.id.checkbox4);
        cookie=findViewById(R.id.checkbox5);
        checkboxes= new CheckBox[]{chocolate,sprinkles,nuts,cherries,cookie};
    }
    public void showToast(View view){ //YAPILABİLECEK EN KÖTÜ KOD ÖRNEĞİ AŞAĞIDADIR !
        //5in 5lisi
        if(chocolate.isChecked()==true && sprinkles.isChecked()==true && nuts.isChecked()==true && cherries.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-nuts-cherries-orio cookie crumbles ",Toast.LENGTH_LONG).show();
        }
        //5in 4lüsü
        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true && nuts.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-nuts-cherries  ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true && nuts.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-nuts-orio cookie crumbles  ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true && cherries.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-cherries-orio cookie crumbles  ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && cherries.isChecked()==true && nuts.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-nuts-cherries-orio cookie crumbles  ",Toast.LENGTH_LONG).show();
        }
        else if(cherries.isChecked()==true && sprinkles.isChecked()==true && nuts.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles-nuts-cherries-orio cookie crumbles  ",Toast.LENGTH_LONG).show();
        }
        //5in 3lüsü
        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true && nuts.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-nuts   ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-cherries   ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles-orio cookie crumbles   ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && nuts.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-nuts-cherries   ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && nuts.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-nuts-orio cookie crumbles  ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && cherries.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-cherries-orio cookie crumbles   ",Toast.LENGTH_LONG).show();
        }
        else if(sprinkles.isChecked()==true && nuts.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles-nuts-cherries   ",Toast.LENGTH_LONG).show();
        }
        else if(sprinkles.isChecked()==true && nuts.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles-nuts-orio cookie crumbles  ",Toast.LENGTH_LONG).show();
        }
        else if(cookie.isChecked()==true && nuts.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Nuts-cherries-cookie   ",Toast.LENGTH_LONG).show();
        }
        //2Lİ SEÇİMLER

        else if(chocolate.isChecked()==true && sprinkles.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-sprinkles    ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && nuts.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-crushed nuts   ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-cherries   ",Toast.LENGTH_LONG).show();
        }
        else if(chocolate.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup-orio cookie crumbles    ",Toast.LENGTH_LONG).show();
        }
        else if(sprinkles.isChecked()==true && nuts.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles-crushed nuts",Toast.LENGTH_LONG).show();
        }
        else if(sprinkles.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles-cherries",Toast.LENGTH_LONG).show();
        }
        else if(sprinkles.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles-orio cookie crumbles   ",Toast.LENGTH_LONG).show();
        }
        else if(nuts.isChecked()==true && cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Crushed nuts-cherries ",Toast.LENGTH_LONG).show();
        }
        else if(nuts.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Crushed nuts-orio cookie crumbles ",Toast.LENGTH_LONG).show();
        }
        else if(cherries.isChecked()==true && cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Cherries-orio cookie crumbles ",Toast.LENGTH_LONG).show();
        }
        //TEKLİ SEÇİMLER
        else if(chocolate.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Chocolate syrup",Toast.LENGTH_LONG).show();
        }
        else if(sprinkles.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Sprinkles",Toast.LENGTH_LONG).show();
        }
        else if(nuts.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Crushed Nuts",Toast.LENGTH_LONG).show();
        }
        else if(cherries.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Cherries",Toast.LENGTH_LONG).show();
        }
        else if(cookie.isChecked()==true){
            Toast.makeText(MainActivity.this,"Toppings: Orio Cookie Crumbles",Toast.LENGTH_LONG).show();
        }

    }
}
