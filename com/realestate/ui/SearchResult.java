package com.realestate.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.realestate.MapViewActivity;
import com.realestate.PropertyDetail;
import com.realestate.SearchResultActivity;
import com.realestate.custom.CustomFragment;
import java.util.ArrayList;

public class SearchResult
  extends CustomFragment
{
  private GoogleMap mMap;
  private MapView mMapView;
  private boolean rent;
  private ArrayList<String[]> sList;
  
  private void loadDummyResults()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.rent)
    {
      localArrayList.add(new String[] { "$750 per week", "South Extenstion 324", "15 Fair bank place", "6", "2", "1", "Type: House" });
      localArrayList.add(new String[] { "$599 per week", "North Extenstion 454", "14 Mount view place", "4", "3", "2", "Type: Apartment" });
    }
    for (;;)
    {
      this.sList = new ArrayList(localArrayList);
      this.sList.addAll(localArrayList);
      return;
      localArrayList.add(new String[] { "$950,00-$1,200,00", "South Extenstion 324", "15 Fair bank place", "6", "2", "1" });
      localArrayList.add(new String[] { "$550,00-$5,200,00", "North Extenstion 454", "14 Mount view place", "4", "3", "2" });
    }
  }
  
  private void setSearchResultList(View paramView)
  {
    loadDummyResults();
    paramView = (ListView)paramView.findViewById(2131034128);
    paramView.addFooterView(getLayoutInflater(null).inflate(2130903044, null));
    paramView.setAdapter(new SearchAdapter(null));
    paramView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        if (paramAnonymousInt != SearchResult.this.sList.size()) {
          SearchResult.this.startActivity(new Intent(SearchResult.this.getActivity(), PropertyDetail.class));
        }
      }
    });
  }
  
  private void setupMap(View paramView, Bundle paramBundle)
  {
    try
    {
      MapsInitializer.initialize(getActivity());
      this.mMapView = ((MapView)paramView.findViewById(2131034134));
      this.mMapView.onCreate(paramBundle);
      return;
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;)
      {
        localGooglePlayServicesNotAvailableException.printStackTrace();
      }
    }
  }
  
  private void setupMarker()
  {
    int i = 0;
    this.mMap.clear();
    LatLng[] arrayOfLatLng = new LatLng[4];
    arrayOfLatLng[0] = new LatLng(-33.89159150356934D, 151.21157605201006D);
    arrayOfLatLng[1] = new LatLng(-33.89021413257428D, 151.21306367218494D);
    arrayOfLatLng[2] = new LatLng(-33.89021413257428D, 151.21709771454334D);
    arrayOfLatLng[3] = new LatLng(-33.890261446151726D, 151.21967263519764D);
    int j = arrayOfLatLng.length;
    for (;;)
    {
      if (i >= j)
      {
        this.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(arrayOfLatLng[2], 15.0F));
        return;
      }
      LatLng localLatLng = arrayOfLatLng[i];
      MarkerOptions localMarkerOptions = new MarkerOptions();
      localMarkerOptions.position(localLatLng).title("South Extenstion 324").snippet("Sydney, Australia");
      localMarkerOptions.icon(BitmapDescriptorFactory.fromResource(2130837569));
      this.mMap.addMarker(localMarkerOptions);
      i += 1;
    }
  }
  
  private void showSortPopup()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(getActivity());
    localBuilder.setTitle(2131099681);
    localBuilder.setSingleChoiceItems(2131296256, 0, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    });
    localBuilder.create().show();
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    paramMenuInflater.inflate(2131427328, paramMenu);
    super.onCreateOptionsMenu(paramMenu, paramMenuInflater);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    boolean bool = true;
    paramLayoutInflater = paramLayoutInflater.inflate(2130903050, null);
    setHasOptionsMenu(true);
    setupMap(paramLayoutInflater, paramBundle);
    if (getArguments() != null) {}
    for (;;)
    {
      this.rent = bool;
      setSearchResultList(paramLayoutInflater);
      return paramLayoutInflater;
      bool = false;
    }
  }
  
  public void onDestroy()
  {
    this.mMapView.onDestroy();
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131034151) {
      showSortPopup();
    }
    for (;;)
    {
      return super.onOptionsItemSelected(paramMenuItem);
      if (paramMenuItem.getItemId() == 2131034149) {
        startActivity(new Intent(getActivity(), MapViewActivity.class));
      } else if (paramMenuItem.getItemId() == 2131034150) {
        startActivity(new Intent(getActivity(), SearchResultActivity.class));
      }
    }
  }
  
  public void onPause()
  {
    this.mMapView.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.mMapView.onResume();
    this.mMap = this.mMapView.getMap();
    if (this.mMap != null)
    {
      this.mMap.setMyLocationEnabled(false);
      this.mMap.setInfoWindowAdapter(null);
      setupMarker();
    }
  }
  
  private class SearchAdapter
    extends BaseAdapter
  {
    private SearchAdapter() {}
    
    public int getCount()
    {
      return SearchResult.this.sList.size();
    }
    
    public String[] getItem(int paramInt)
    {
      return (String[])SearchResult.this.sList.get(paramInt);
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      int i;
      if (paramView == null)
      {
        paramView = SearchResult.this.getLayoutInflater(null);
        if (SearchResult.this.rent)
        {
          i = 2130903048;
          paramViewGroup = paramView.inflate(i, null);
        }
      }
      else
      {
        paramView = getItem(paramInt);
        ((TextView)paramViewGroup.findViewById(2131034121)).setText(paramView[0]);
        ((TextView)paramViewGroup.findViewById(2131034122)).setText(paramView[1]);
        ((TextView)paramViewGroup.findViewById(2131034123)).setText(paramView[2]);
        ((TextView)paramViewGroup.findViewById(2131034124)).setText(paramView[3]);
        ((TextView)paramViewGroup.findViewById(2131034125)).setText(paramView[4]);
        ((TextView)paramViewGroup.findViewById(2131034126)).setText(paramView[5]);
        if (SearchResult.this.rent) {
          ((TextView)paramViewGroup.findViewById(2131034139)).setText(paramView[6]);
        }
        paramView = (ImageView)paramViewGroup.findViewById(2131034120);
        if (!SearchResult.this.rent) {
          break label235;
        }
        if (paramInt % 2 != 0) {
          break label228;
        }
        i = 2130837570;
        label189:
        paramView.setImageResource(i);
        paramView = (ImageView)paramViewGroup.findViewById(2131034127);
        if (paramInt % 2 == 0) {
          break label261;
        }
      }
      label228:
      label235:
      label261:
      for (paramInt = 2130837505;; paramInt = 2130837573)
      {
        paramView.setImageResource(paramInt);
        return paramViewGroup;
        i = 2130903041;
        break;
        i = 2130837571;
        break label189;
        if (paramInt % 2 == 0) {}
        for (i = 2130837509;; i = 2130837510)
        {
          paramView.setImageResource(i);
          break;
        }
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\realestate\ui\SearchResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */