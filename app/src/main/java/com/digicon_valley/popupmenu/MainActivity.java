package com.digicon_valley.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showpopup(View view) {

        PopupMenu popupMenu=new PopupMenu(this,view);
        MenuInflater menuInflater=popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.pop_action,popupMenu.getMenu());

        Popup_Action_Event_handling popupActionEventHandling=new Popup_Action_Event_handling(getApplicationContext());
        popupMenu.setOnMenuItemClickListener(popupActionEventHandling);
        popupMenu.show();

    }
}
