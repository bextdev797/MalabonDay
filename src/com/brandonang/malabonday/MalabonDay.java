package com.brandonang.malabonday;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.common.PropertyTypeConstants;
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
  private boolean addConfettiVariable;

  public MalabonDay(ComponentContainer container) {
    super(container.$form());
    this.activity = container.$context();
    this.context = container.$context();
  }
  
  @DesignerProperty(defaultValue = "True", editorType = PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN)
  @SimpleProperty
  public void AddConfettiToMalabonDay(boolean addConfetti){
    boolean addConfettiVariable = addConfetti;
  }

  @SimpleProperty
  public boolean AddConfettiToMalabonDay(){
    return addConfettiVariable;
  }

  @SimpleFunction(description = "To Add Date of Malabon Events")
  public String RegisterMalabonDayDate(int day, int month, int year){
    String malabonDayDate = day + "/" + month + "/" + year;
    return malabonDayDate;
  }

  @SimpleFunction(description = "Setting up Malabon Day in a Layout")
  public void SetupMalabonDay(AndroidViewComponent layout, String date, boolean addConfetti){
    if(addConfetti = true){
      View view = layout.getView();
      FrameLayout frameLayout = (FrameLayout) view;
      TextView label = new TextView(this.context);
      label.setText("Happy Malabon Day 🎉" + date);
      frameLayout.addView(label);
    } else {
      View view = layout.getView();
      FrameLayout frameLayout = (FrameLayout) view;
      TextView label = new TextView(this.context);
      label.setText("Happy Malabon Day" + date);
      frameLayout.addView(label);
    }
  }
}
