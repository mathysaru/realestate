package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public abstract interface e
  extends IInterface
{
  public abstract boolean a(e parame)
    throws RemoteException;
  
  public abstract int getFillColor()
    throws RemoteException;
  
  public abstract List getHoles()
    throws RemoteException;
  
  public abstract String getId()
    throws RemoteException;
  
  public abstract List<LatLng> getPoints()
    throws RemoteException;
  
  public abstract int getStrokeColor()
    throws RemoteException;
  
  public abstract float getStrokeWidth()
    throws RemoteException;
  
  public abstract float getZIndex()
    throws RemoteException;
  
  public abstract int hashCodeRemote()
    throws RemoteException;
  
  public abstract boolean isGeodesic()
    throws RemoteException;
  
  public abstract boolean isVisible()
    throws RemoteException;
  
  public abstract void remove()
    throws RemoteException;
  
  public abstract void setFillColor(int paramInt)
    throws RemoteException;
  
  public abstract void setGeodesic(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void setHoles(List paramList)
    throws RemoteException;
  
  public abstract void setPoints(List<LatLng> paramList)
    throws RemoteException;
  
  public abstract void setStrokeColor(int paramInt)
    throws RemoteException;
  
  public abstract void setStrokeWidth(float paramFloat)
    throws RemoteException;
  
  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;
  
  public abstract void setZIndex(float paramFloat)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements e
  {
    public static e ag(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof e))) {
        return (e)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      int i = 0;
      boolean bool2 = false;
      int j = 0;
      int k = 0;
      boolean bool1 = false;
      float f;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        remove();
        paramParcel2.writeNoException();
        return true;
      case 2: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        paramParcel1 = getId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        setPoints(paramParcel1.createTypedArrayList(LatLng.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        paramParcel1 = getPoints();
        paramParcel2.writeNoException();
        paramParcel2.writeTypedList(paramParcel1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        setHoles(paramParcel1.readArrayList(getClass().getClassLoader()));
        paramParcel2.writeNoException();
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        paramParcel1 = getHoles();
        paramParcel2.writeNoException();
        paramParcel2.writeList(paramParcel1);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        setStrokeWidth(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        f = getStrokeWidth();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        setStrokeColor(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        paramInt1 = getStrokeColor();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        setFillColor(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        paramInt1 = getFillColor();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        setZIndex(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 14: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        f = getZIndex();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f);
        return true;
      case 15: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        setVisible(bool1);
        paramParcel2.writeNoException();
        return true;
      case 16: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        bool1 = isVisible();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool1) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        return true;
      case 17: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        bool1 = bool2;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        setGeodesic(bool1);
        paramParcel2.writeNoException();
        return true;
      case 18: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        bool1 = isGeodesic();
        paramParcel2.writeNoException();
        paramInt1 = j;
        if (bool1) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        return true;
      case 19: 
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        bool1 = a(ag(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        paramInt1 = k;
        if (bool1) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      paramInt1 = hashCodeRemote();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    
    private static class a
      implements e
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      /* Error */
      public boolean a(e parame)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: invokestatic 28	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   10: astore 5
        //   12: aload 4
        //   14: ldc 30
        //   16: invokevirtual 34	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   19: aload_1
        //   20: ifnull +62 -> 82
        //   23: aload_1
        //   24: invokeinterface 38 1 0
        //   29: astore_1
        //   30: aload 4
        //   32: aload_1
        //   33: invokevirtual 41	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/maps/model/internal/e$a$a:dG	Landroid/os/IBinder;
        //   40: bipush 19
        //   42: aload 4
        //   44: aload 5
        //   46: iconst_0
        //   47: invokeinterface 47 5 0
        //   52: pop
        //   53: aload 5
        //   55: invokevirtual 50	android/os/Parcel:readException	()V
        //   58: aload 5
        //   60: invokevirtual 54	android/os/Parcel:readInt	()I
        //   63: istore_2
        //   64: iload_2
        //   65: ifeq +5 -> 70
        //   68: iconst_1
        //   69: istore_3
        //   70: aload 5
        //   72: invokevirtual 57	android/os/Parcel:recycle	()V
        //   75: aload 4
        //   77: invokevirtual 57	android/os/Parcel:recycle	()V
        //   80: iload_3
        //   81: ireturn
        //   82: aconst_null
        //   83: astore_1
        //   84: goto -54 -> 30
        //   87: astore_1
        //   88: aload 5
        //   90: invokevirtual 57	android/os/Parcel:recycle	()V
        //   93: aload 4
        //   95: invokevirtual 57	android/os/Parcel:recycle	()V
        //   98: aload_1
        //   99: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	100	0	this	a
        //   0	100	1	parame	e
        //   63	2	2	i	int
        //   1	80	3	bool	boolean
        //   5	89	4	localParcel1	Parcel
        //   10	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   12	19	87	finally
        //   23	30	87	finally
        //   30	64	87	finally
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
      
      public int getFillColor()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public List getHoles()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ArrayList localArrayList = localParcel2.readArrayList(getClass().getClassLoader());
          return localArrayList;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public String getId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public List<LatLng> getPoints()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ArrayList localArrayList = localParcel2.createTypedArrayList(LatLng.CREATOR);
          return localArrayList;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int getStrokeColor()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public float getStrokeWidth()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          float f = localParcel2.readFloat();
          return f;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public float getZIndex()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          float f = localParcel2.readFloat();
          return f;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int hashCodeRemote()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean isGeodesic()
        throws RemoteException
      {
        boolean bool = false;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public boolean isVisible()
        throws RemoteException
      {
        boolean bool = false;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void remove()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          this.dG.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setFillColor(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          localParcel1.writeInt(paramInt);
          this.dG.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setGeodesic(boolean paramBoolean)
        throws RemoteException
      {
        int i = 0;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.dG.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setHoles(List paramList)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          localParcel1.writeList(paramList);
          this.dG.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setPoints(List<LatLng> paramList)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          localParcel1.writeTypedList(paramList);
          this.dG.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setStrokeColor(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          localParcel1.writeInt(paramInt);
          this.dG.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setStrokeWidth(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          localParcel1.writeFloat(paramFloat);
          this.dG.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setVisible(boolean paramBoolean)
        throws RemoteException
      {
        int i = 0;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.dG.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void setZIndex(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
          localParcel1.writeFloat(paramFloat);
          this.dG.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */