package com.google.android.gms.internal;

import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.d;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import com.google.android.gms.plus.model.people.Person.Organizations;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.ArrayList;

public final class gg
  extends b
  implements Person
{
  public gg(d paramd, int paramInt)
  {
    super(paramd, paramInt);
  }
  
  public ArrayList<Person.Organizations> dX()
  {
    return null;
  }
  
  public ArrayList<Person.PlacesLived> dY()
  {
    return null;
  }
  
  public ArrayList<Person.Urls> dZ()
  {
    return null;
  }
  
  public Person ea()
  {
    return new fv(getDisplayName(), getId(), (fv.c)getImage(), getObjectType(), getUrl());
  }
  
  public String getAboutMe()
  {
    return null;
  }
  
  public Person.AgeRange getAgeRange()
  {
    return null;
  }
  
  public String getBirthday()
  {
    return null;
  }
  
  public String getBraggingRights()
  {
    return null;
  }
  
  public int getCircledByCount()
  {
    return 0;
  }
  
  public Person.Cover getCover()
  {
    return null;
  }
  
  public String getCurrentLocation()
  {
    return null;
  }
  
  public String getDisplayName()
  {
    return getString("displayName");
  }
  
  public int getGender()
  {
    return 0;
  }
  
  public String getId()
  {
    return getString("personId");
  }
  
  public Person.Image getImage()
  {
    return new fv.c(getString("image"));
  }
  
  public String getLanguage()
  {
    return null;
  }
  
  public Person.Name getName()
  {
    return null;
  }
  
  public String getNickname()
  {
    return null;
  }
  
  public int getObjectType()
  {
    return fv.e.aa(getString("objectType"));
  }
  
  public int getPlusOneCount()
  {
    return 0;
  }
  
  public int getRelationshipStatus()
  {
    return 0;
  }
  
  public String getTagline()
  {
    return null;
  }
  
  public String getUrl()
  {
    return getString("url");
  }
  
  public boolean hasAboutMe()
  {
    return false;
  }
  
  public boolean hasAgeRange()
  {
    return false;
  }
  
  public boolean hasBirthday()
  {
    return false;
  }
  
  public boolean hasBraggingRights()
  {
    return false;
  }
  
  public boolean hasCircledByCount()
  {
    return false;
  }
  
  public boolean hasCover()
  {
    return false;
  }
  
  public boolean hasCurrentLocation()
  {
    return false;
  }
  
  public boolean hasDisplayName()
  {
    return true;
  }
  
  public boolean hasGender()
  {
    return false;
  }
  
  public boolean hasId()
  {
    return true;
  }
  
  public boolean hasImage()
  {
    return true;
  }
  
  public boolean hasIsPlusUser()
  {
    return false;
  }
  
  public boolean hasLanguage()
  {
    return false;
  }
  
  public boolean hasName()
  {
    return false;
  }
  
  public boolean hasNickname()
  {
    return false;
  }
  
  public boolean hasObjectType()
  {
    return true;
  }
  
  public boolean hasOrganizations()
  {
    return false;
  }
  
  public boolean hasPlacesLived()
  {
    return false;
  }
  
  public boolean hasPlusOneCount()
  {
    return false;
  }
  
  public boolean hasRelationshipStatus()
  {
    return false;
  }
  
  public boolean hasTagline()
  {
    return false;
  }
  
  public boolean hasUrl()
  {
    return true;
  }
  
  public boolean hasUrls()
  {
    return false;
  }
  
  public boolean hasVerified()
  {
    return false;
  }
  
  public boolean isPlusUser()
  {
    return false;
  }
  
  public boolean isVerified()
  {
    return false;
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\gg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */