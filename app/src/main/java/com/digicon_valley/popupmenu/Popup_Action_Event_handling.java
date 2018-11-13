package com.digicon_valley.popupmenu;

import android.content.Context;
import android.view.MenuItem;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Popup_Action_Event_handling implements PopupMenu.OnMenuItemClickListener {

    Context context;

    public Popup_Action_Event_handling(Context context){
        this.context=context;
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {

        if (item.getItemId()==R.id.id_adman){

            Toast.makeText(context,"Login As Admin",Toast.LENGTH_SHORT).show();
            return  true;
        }else if (item.getItemId()==R.id.id_user){

            Toast.makeText(context,"Login As User",Toast.LENGTH_SHORT).show();
            return true;
        }

        return false;
    }
}
