package com.brandonang.malabonday;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.View;

public class MalabonDay extends AndroidNonvisibleComponent {

  //Activity & Context
  private Activity activity;
  private Context context;

  public MalabonDay(ComponentContainer container) {
    super(container.$form());
    this.activity = container.$context();
    this.context = container.$context();
  }

  @SimpleFunction
  public String RegisterMalabonDayDate(int day, int month, int year){
    String malabonDayDate = day + "/" + month + "/" + year;
    return malabonDayDate;
  }

  @SimpleFunction
  public void SetupMalabonDay(AndroidViewComponent layout, int date){
    View view = layout.getView();
    FrameLayout frameLayout = (FrameLayout) view;
    TextView label = new TextView(this.context);
    label.setText("Happy Malabon Day" + date);
    frameLayout.addView(label);
  }
}