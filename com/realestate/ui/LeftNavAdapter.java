package com.realestate.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.realestate.model.Data;
import java.util.ArrayList;

public class LeftNavAdapter
  extends BaseAdapter
{
  private Context context;
  private ArrayList<Data> items;
  private int selected;
  
  public LeftNavAdapter(Context paramContext, ArrayList<Data> paramArrayList)
  {
    this.context = paramContext;
    this.items = paramArrayList;
  }
  
  public int getCount()
  {
    return this.items.size();
  }
  
  public Data getItem(int paramInt)
  {
    return (Data)this.items.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = LayoutInflater.from(this.context).inflate(2130903045, null);
    }
    paramView = (TextView)paramViewGroup;
    paramView.setText(getItem(paramInt).getTitle1());
    if (paramInt == this.selected)
    {
      paramView.setCompoundDrawablesWithIntrinsicBounds(getItem(paramInt).getImage2(), 0, 0, 0);
      paramView.setBackgroundColor(this.context.getResources().getColor(2130968595));
      paramView.setTextColor(-1);
      return paramViewGroup;
    }
    paramView.setCompoundDrawablesWithIntrinsicBounds(getItem(paramInt).getImage1(), 0, 0, 0);
    paramView.setBackgroundResource(0);
    paramView.setTextColor(this.context.getResources().getColor(2130968594));
    return paramViewGroup;
  }
  
  public void setSelection(int paramInt)
  {
    this.selected = paramInt;
    notifyDataSetChanged();
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\realestate\ui\LeftNavAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */