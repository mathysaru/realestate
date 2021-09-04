package com.realestate.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.realestate.SearchResultActivity;
import com.realestate.custom.CustomFragment;

public class Search
  extends CustomFragment
{
  private boolean buy;
  
  private void setupSearchOptions(boolean paramBoolean)
  {
    int j = 0;
    this.buy = paramBoolean;
    View localView1 = getView();
    View localView2 = localView1.findViewById(2131034145);
    if (paramBoolean)
    {
      i = 8;
      localView2.setVisibility(i);
      localView2 = localView1.findViewById(2131034148);
      if (!paramBoolean) {
        break label84;
      }
      i = 8;
      label51:
      localView2.setVisibility(i);
      localView1 = localView1.findViewById(2131034143);
      if (!paramBoolean) {
        break label89;
      }
    }
    label84:
    label89:
    for (int i = j;; i = 8)
    {
      localView1.setVisibility(i);
      return;
      i = 0;
      break;
      i = 0;
      break label51;
    }
  }
  
  public void onClick(View paramView)
  {
    boolean bool = false;
    super.onClick(paramView);
    if ((paramView.getId() == 2131034140) || (paramView.getId() == 2131034141)) {
      if (paramView.getId() == 2131034140)
      {
        bool = true;
        setupSearchOptions(bool);
        paramView.setEnabled(false);
        if (paramView.getId() != 2131034140) {
          break label74;
        }
        getView().findViewById(2131034141).setEnabled(true);
      }
    }
    label74:
    while (paramView.getId() != 2131034135)
    {
      for (;;)
      {
        return;
        bool = false;
      }
      getView().findViewById(2131034140).setEnabled(true);
      return;
    }
    paramView = new Intent(getActivity(), SearchResultActivity.class);
    if (getView().findViewById(2131034140).isEnabled()) {}
    for (;;)
    {
      startActivity(paramView.putExtra("buy", bool));
      return;
      bool = true;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903049, null);
    setTouchNClick(paramLayoutInflater.findViewById(2131034135));
    setTouchNClick(paramLayoutInflater.findViewById(2131034140));
    setTouchNClick(paramLayoutInflater.findViewById(2131034141));
    this.buy = true;
    return paramLayoutInflater;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\realestate\ui\Search.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */