package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;

public abstract interface er
  extends IInterface
{
  public abstract String L(String paramString)
    throws RemoteException;
  
  public abstract String M(String paramString)
    throws RemoteException;
  
  public abstract void N(String paramString)
    throws RemoteException;
  
  public abstract int O(String paramString)
    throws RemoteException;
  
  public abstract Uri P(String paramString)
    throws RemoteException;
  
  public abstract int a(eq parameq, byte[] paramArrayOfByte, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void a(IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(eq parameq)
    throws RemoteException;
  
  public abstract void a(eq parameq, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void a(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void a(eq parameq, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, Bundle paramBundle, int paramInt1, int paramInt2)
    throws RemoteException;
  
  public abstract void a(eq parameq, IBinder paramIBinder, int paramInt, String[] paramArrayOfString, Bundle paramBundle, boolean paramBoolean, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, IBinder paramIBinder, String paramString, boolean paramBoolean, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, long paramLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, long paramLong, String paramString2)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(eq parameq, String paramString, boolean paramBoolean, long[] paramArrayOfLong)
    throws RemoteException;
  
  public abstract void a(eq parameq, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void a(String paramString1, String paramString2, int paramInt)
    throws RemoteException;
  
  public abstract int b(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
    throws RemoteException;
  
  public abstract void b(eq parameq)
    throws RemoteException;
  
  public abstract void b(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void b(eq parameq, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void bT()
    throws RemoteException;
  
  public abstract d bU()
    throws RemoteException;
  
  public abstract boolean bV()
    throws RemoteException;
  
  public abstract d bW()
    throws RemoteException;
  
  public abstract Bundle ba()
    throws RemoteException;
  
  public abstract void c(eq parameq)
    throws RemoteException;
  
  public abstract void c(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void c(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void c(eq parameq, String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void c(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void c(eq parameq, boolean paramBoolean)
    throws RemoteException;
  
  public abstract void clearNotifications(int paramInt)
    throws RemoteException;
  
  public abstract void d(eq parameq)
    throws RemoteException;
  
  public abstract void d(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void d(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void d(eq parameq, String paramString, boolean paramBoolean)
    throws RemoteException;
  
  public abstract ParcelFileDescriptor e(Uri paramUri)
    throws RemoteException;
  
  public abstract void e(eq parameq)
    throws RemoteException;
  
  public abstract void e(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;
  
  public abstract void e(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void f(long paramLong)
    throws RemoteException;
  
  public abstract void f(eq parameq)
    throws RemoteException;
  
  public abstract void f(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void f(String paramString1, String paramString2)
    throws RemoteException;
  
  public abstract void g(long paramLong)
    throws RemoteException;
  
  public abstract void g(eq parameq)
    throws RemoteException;
  
  public abstract void g(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract String getAppId()
    throws RemoteException;
  
  public abstract String getCurrentAccountName()
    throws RemoteException;
  
  public abstract String getCurrentPlayerId()
    throws RemoteException;
  
  public abstract void h(eq parameq)
    throws RemoteException;
  
  public abstract void h(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void i(eq parameq)
    throws RemoteException;
  
  public abstract void i(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void i(String paramString, int paramInt)
    throws RemoteException;
  
  public abstract int j(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void j(String paramString, int paramInt)
    throws RemoteException;
  
  public abstract void k(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void k(String paramString, int paramInt)
    throws RemoteException;
  
  public abstract void l(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void m(eq parameq, String paramString)
    throws RemoteException;
  
  public abstract void setUseNewPlayerNotificationsFirstParty(boolean paramBoolean)
    throws RemoteException;
  
  public static abstract class a
    extends Binder
    implements er
  {
    public static er C(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
      if ((localIInterface != null) && ((localIInterface instanceof er))) {
        return (er)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      Object localObject4 = null;
      Object localObject1 = null;
      Object localObject2 = null;
      IBinder localIBinder = null;
      Object localObject3 = null;
      boolean bool1 = false;
      boolean bool8 = false;
      boolean bool3 = false;
      boolean bool5 = false;
      boolean bool9 = false;
      int i = 0;
      boolean bool10 = false;
      boolean bool11 = false;
      boolean bool12 = false;
      boolean bool13 = false;
      boolean bool6 = false;
      boolean bool7 = false;
      boolean bool4 = false;
      boolean bool14 = false;
      boolean bool15 = false;
      boolean bool16 = false;
      boolean bool17 = false;
      boolean bool18 = false;
      boolean bool2 = false;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.games.internal.IGamesService");
        return true;
      case 5001: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5002: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5003: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = getAppId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5004: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = ba();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5005: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = paramParcel1.readStrongBinder();
        localObject1 = localObject3;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a((IBinder)localObject2, (Bundle)localObject1);
        paramParcel2.writeNoException();
        return true;
      case 5006: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        bT();
        paramParcel2.writeNoException();
        return true;
      case 5007: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = getCurrentAccountName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5064: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = L(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5065: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5008: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5009: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5010: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        b(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5011: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((eq)localObject1, (String)localObject2, bool1, paramParcel1.createLongArray());
          paramParcel2.writeNoException();
          return true;
        }
      case 5012: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = getCurrentPlayerId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5013: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = bU();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5014: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        c(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5015: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          a((eq)localObject1, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
        }
      case 5016: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5017: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        b(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5018: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        d(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5019: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        i = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((eq)localObject1, (String)localObject2, paramInt1, paramInt2, i, bool1);
          paramParcel2.writeNoException();
          return true;
        }
      case 5020: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        i = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          b((eq)localObject1, (String)localObject2, paramInt1, paramInt2, i, bool1);
          paramParcel2.writeNoException();
          return true;
        }
      case 5021: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = eq.a.B(paramParcel1.readStrongBinder());
        localObject1 = localObject4;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a((eq)localObject2, (Bundle)localObject1, paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5022: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        c(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5023: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = eq.a.B(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readString();
        localObject4 = paramParcel1.readStrongBinder();
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        a((eq)localObject2, (String)localObject3, (IBinder)localObject4, (Bundle)localObject1);
        paramParcel2.writeNoException();
        return true;
      case 5024: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject3 = eq.a.B(paramParcel1.readStrongBinder());
        localObject4 = paramParcel1.readString();
        localIBinder = paramParcel1.readStrongBinder();
        localObject1 = localObject2;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        }
        b((eq)localObject3, (String)localObject4, localIBinder, (Bundle)localObject1);
        paramParcel2.writeNoException();
        return true;
      case 5025: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        localObject3 = paramParcel1.readStrongBinder();
        if (paramParcel1.readInt() != 0) {}
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
        {
          a((eq)localObject1, (String)localObject2, paramInt1, (IBinder)localObject3, paramParcel1);
          paramParcel2.writeNoException();
          return true;
        }
      case 5026: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        d(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5027: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        e(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5028: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        j(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5029: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        i(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5058: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5059: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        g(paramParcel1.readLong());
        paramParcel2.writeNoException();
        return true;
      case 5030: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject2 = eq.a.B(paramParcel1.readStrongBinder());
        localObject3 = paramParcel1.readStrongBinder();
        paramInt1 = paramParcel1.readInt();
        localObject4 = paramParcel1.createStringArray();
        if (paramParcel1.readInt() != 0)
        {
          localObject1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0) {
            break label2080;
          }
        }
        for (bool1 = true;; bool1 = false)
        {
          a((eq)localObject2, (IBinder)localObject3, paramInt1, (String[])localObject4, (Bundle)localObject1, bool1, paramParcel1.readLong());
          paramParcel2.writeNoException();
          return true;
          localObject1 = null;
          break;
        }
      case 5031: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readStrongBinder();
        localObject3 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          a((eq)localObject1, (IBinder)localObject2, (String)localObject3, bool1, paramParcel1.readLong());
          paramParcel2.writeNoException();
          return true;
        }
      case 5032: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        e(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5033: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramInt1 = a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5034: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramInt1 = b(paramParcel1.createByteArray(), paramParcel1.readString(), paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5035: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = M(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 5036: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        clearNotifications(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5037: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5038: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        b(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5039: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        i = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a((eq)localObject1, (String)localObject2, (String)localObject3, paramInt1, paramInt2, i, bool1);
        paramParcel2.writeNoException();
        return true;
      case 5040: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        i = paramParcel1.readInt();
        bool1 = bool8;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        b((eq)localObject1, (String)localObject2, (String)localObject3, paramInt1, paramInt2, i, bool1);
        paramParcel2.writeNoException();
        return true;
      case 5041: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        c(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5042: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        g(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5043: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        h(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5044: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        paramInt2 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label2671;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          a((eq)localObject1, paramInt1, paramInt2, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
          bool1 = false;
          break;
        }
      case 5045: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label2748;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          a((eq)localObject1, (String)localObject2, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
          bool1 = false;
          break;
        }
      case 5046: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          bool2 = bool3;
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          b((eq)localObject1, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
        }
      case 5047: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        f(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5048: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          bool2 = bool5;
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          c((eq)localObject1, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
        }
      case 5049: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        g(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5050: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        N(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5051: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5052: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        i(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5053: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramInt1 = j(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5060: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramInt1 = O(paramParcel1.readString());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5054: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        bool1 = bool9;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a((eq)localObject1, (String)localObject2, bool1);
        paramParcel2.writeNoException();
        return true;
      case 5061: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        k(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5055: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        k(paramParcel1.readString(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5067: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        bool1 = bV();
        paramParcel2.writeNoException();
        paramInt1 = i;
        if (bool1) {
          paramInt1 = 1;
        }
        paramParcel2.writeInt(paramInt1);
        return true;
      case 5068: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        bool1 = bool10;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        setUseNewPlayerNotificationsFirstParty(bool1);
        paramParcel2.writeNoException();
        return true;
      case 5056: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        h(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5057: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        l(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5062: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        i(eq.a.B(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5063: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        bool1 = bool11;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a((eq)localObject1, bool1);
        paramParcel2.writeNoException();
        return true;
      case 5066: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = P(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5501: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label3465;
          }
        }
        for (bool2 = true;; bool2 = false)
        {
          b((eq)localObject1, (String)localObject2, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
          bool1 = false;
          break;
        }
      case 5502: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        paramParcel1 = bW();
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 6001: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        bool1 = bool12;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        b((eq)localObject1, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6002: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        bool1 = bool13;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        a((eq)localObject1, (String)localObject2, (String)localObject3, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6003: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          bool2 = bool6;
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          d((eq)localObject1, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
        }
      case 6004: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool1 = true;; bool1 = false)
        {
          bool2 = bool7;
          if (paramParcel1.readInt() != 0) {
            bool2 = true;
          }
          e((eq)localObject1, paramInt1, bool1, bool2);
          paramParcel2.writeNoException();
          return true;
        }
      case 6501: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
        {
          bool1 = true;
          if (paramParcel1.readInt() == 0) {
            break label3841;
          }
          bool2 = true;
          if (paramParcel1.readInt() == 0) {
            break label3847;
          }
        }
        for (bool3 = true;; bool3 = false)
        {
          if (paramParcel1.readInt() != 0) {
            bool4 = true;
          }
          a((eq)localObject1, (String)localObject2, paramInt1, bool1, bool2, bool3, bool4);
          paramParcel2.writeNoException();
          return true;
          bool1 = false;
          break;
          bool2 = false;
          break label3792;
        }
      case 6502: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        bool1 = bool14;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        b((eq)localObject1, (String)localObject2, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6503: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        bool1 = bool15;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        c((eq)localObject1, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6504: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        bool1 = bool16;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        c((eq)localObject1, (String)localObject2, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6505: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        bool1 = bool17;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        d((eq)localObject1, (String)localObject2, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6506: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = eq.a.B(paramParcel1.readStrongBinder());
        localObject2 = paramParcel1.readString();
        localObject3 = paramParcel1.readString();
        bool1 = bool18;
        if (paramParcel1.readInt() != 0) {
          bool1 = true;
        }
        b((eq)localObject1, (String)localObject2, (String)localObject3, bool1);
        paramParcel2.writeNoException();
        return true;
      case 6507: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        localObject1 = localIBinder;
        if (paramParcel1.readInt() != 0) {
          localObject1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        }
        paramParcel1 = e((Uri)localObject1);
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
        {
          paramParcel2.writeInt(1);
          paramParcel1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 7001: 
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        m(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 7002: 
        label2080:
        label2671:
        label2748:
        label3465:
        label3792:
        label3841:
        label3847:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
        a(eq.a.B(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readLong(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesService");
      localObject1 = eq.a.B(paramParcel1.readStrongBinder());
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      localObject3 = paramParcel1.readStrongBinder();
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        b((eq)localObject1, (String)localObject2, paramInt1, (IBinder)localObject3, paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    
    private static class a
      implements er
    {
      private IBinder dG;
      
      a(IBinder paramIBinder)
      {
        this.dG = paramIBinder;
      }
      
      public String L(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5064, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public String M(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5035, localParcel1, localParcel2, 0);
          localParcel2.readException();
          paramString = localParcel2.readString();
          return paramString;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void N(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5050, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public int O(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          this.dG.transact(5060, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public Uri P(String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_2
        //   15: aload_1
        //   16: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   19: aload_0
        //   20: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   23: sipush 5066
        //   26: aload_2
        //   27: aload_3
        //   28: iconst_0
        //   29: invokeinterface 44 5 0
        //   34: pop
        //   35: aload_3
        //   36: invokevirtual 47	android/os/Parcel:readException	()V
        //   39: aload_3
        //   40: invokevirtual 63	android/os/Parcel:readInt	()I
        //   43: ifeq +26 -> 69
        //   46: getstatic 71	android/net/Uri:CREATOR	Landroid/os/Parcelable$Creator;
        //   49: aload_3
        //   50: invokeinterface 77 2 0
        //   55: checkcast 67	android/net/Uri
        //   58: astore_1
        //   59: aload_3
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_2
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: aload_1
        //   68: areturn
        //   69: aconst_null
        //   70: astore_1
        //   71: goto -12 -> 59
        //   74: astore_1
        //   75: aload_3
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_2
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	paramString	String
        //   3	77	2	localParcel1	Parcel
        //   7	69	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	59	74	finally
      }
      
      /* Error */
      public int a(eq parameq, byte[] paramArrayOfByte, String paramString1, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 6
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 7
        //   10: aload 6
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +78 -> 96
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 6
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 6
        //   36: aload_2
        //   37: invokevirtual 91	android/os/Parcel:writeByteArray	([B)V
        //   40: aload 6
        //   42: aload_3
        //   43: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload 6
        //   48: aload 4
        //   50: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   53: aload_0
        //   54: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   57: sipush 5033
        //   60: aload 6
        //   62: aload 7
        //   64: iconst_0
        //   65: invokeinterface 44 5 0
        //   70: pop
        //   71: aload 7
        //   73: invokevirtual 47	android/os/Parcel:readException	()V
        //   76: aload 7
        //   78: invokevirtual 63	android/os/Parcel:readInt	()I
        //   81: istore 5
        //   83: aload 7
        //   85: invokevirtual 54	android/os/Parcel:recycle	()V
        //   88: aload 6
        //   90: invokevirtual 54	android/os/Parcel:recycle	()V
        //   93: iload 5
        //   95: ireturn
        //   96: aconst_null
        //   97: astore_1
        //   98: goto -70 -> 28
        //   101: astore_1
        //   102: aload 7
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload 6
        //   109: invokevirtual 54	android/os/Parcel:recycle	()V
        //   112: aload_1
        //   113: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	114	0	this	a
        //   0	114	1	parameq	eq
        //   0	114	2	paramArrayOfByte	byte[]
        //   0	114	3	paramString1	String
        //   0	114	4	paramString2	String
        //   81	13	5	i	int
        //   3	105	6	localParcel1	Parcel
        //   8	95	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	101	finally
        //   21	28	101	finally
        //   28	83	101	finally
      }
      
      /* Error */
      public void a(IBinder paramIBinder, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_3
        //   16: aload_1
        //   17: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   20: aload_2
        //   21: ifnull +46 -> 67
        //   24: aload_3
        //   25: iconst_1
        //   26: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   29: aload_2
        //   30: aload_3
        //   31: iconst_0
        //   32: invokevirtual 102	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   35: aload_0
        //   36: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   39: sipush 5005
        //   42: aload_3
        //   43: aload 4
        //   45: iconst_0
        //   46: invokeinterface 44 5 0
        //   51: pop
        //   52: aload 4
        //   54: invokevirtual 47	android/os/Parcel:readException	()V
        //   57: aload 4
        //   59: invokevirtual 54	android/os/Parcel:recycle	()V
        //   62: aload_3
        //   63: invokevirtual 54	android/os/Parcel:recycle	()V
        //   66: return
        //   67: aload_3
        //   68: iconst_0
        //   69: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   72: goto -37 -> 35
        //   75: astore_1
        //   76: aload 4
        //   78: invokevirtual 54	android/os/Parcel:recycle	()V
        //   81: aload_3
        //   82: invokevirtual 54	android/os/Parcel:recycle	()V
        //   85: aload_1
        //   86: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	87	0	this	a
        //   0	87	1	paramIBinder	IBinder
        //   0	87	2	paramBundle	Bundle
        //   3	79	3	localParcel1	Parcel
        //   7	70	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	20	75	finally
        //   24	35	75	finally
        //   35	57	75	finally
        //   67	72	75	finally
      }
      
      /* Error */
      public void a(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5002
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void a(eq parameq, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +89 -> 110
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 7
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 7
        //   39: iload_2
        //   40: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   43: aload 7
        //   45: iload_3
        //   46: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   49: iload 4
        //   51: ifeq +64 -> 115
        //   54: iconst_1
        //   55: istore_2
        //   56: aload 7
        //   58: iload_2
        //   59: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   62: iload 5
        //   64: ifeq +56 -> 120
        //   67: iload 6
        //   69: istore_2
        //   70: aload 7
        //   72: iload_2
        //   73: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   76: aload_0
        //   77: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   80: sipush 5044
        //   83: aload 7
        //   85: aload 8
        //   87: iconst_0
        //   88: invokeinterface 44 5 0
        //   93: pop
        //   94: aload 8
        //   96: invokevirtual 47	android/os/Parcel:readException	()V
        //   99: aload 8
        //   101: invokevirtual 54	android/os/Parcel:recycle	()V
        //   104: aload 7
        //   106: invokevirtual 54	android/os/Parcel:recycle	()V
        //   109: return
        //   110: aconst_null
        //   111: astore_1
        //   112: goto -81 -> 31
        //   115: iconst_0
        //   116: istore_2
        //   117: goto -61 -> 56
        //   120: iconst_0
        //   121: istore_2
        //   122: goto -52 -> 70
        //   125: astore_1
        //   126: aload 8
        //   128: invokevirtual 54	android/os/Parcel:recycle	()V
        //   131: aload 7
        //   133: invokevirtual 54	android/os/Parcel:recycle	()V
        //   136: aload_1
        //   137: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	138	0	this	a
        //   0	138	1	parameq	eq
        //   0	138	2	paramInt1	int
        //   0	138	3	paramInt2	int
        //   0	138	4	paramBoolean1	boolean
        //   0	138	5	paramBoolean2	boolean
        //   1	67	6	i	int
        //   6	126	7	localParcel1	Parcel
        //   11	116	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	125	finally
        //   24	31	125	finally
        //   31	49	125	finally
        //   56	62	125	finally
        //   70	99	125	finally
      }
      
      /* Error */
      public void a(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +82 -> 103
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: iload_2
        //   40: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   43: iload_3
        //   44: ifeq +64 -> 108
        //   47: iconst_1
        //   48: istore_2
        //   49: aload 6
        //   51: iload_2
        //   52: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   55: iload 4
        //   57: ifeq +56 -> 113
        //   60: iload 5
        //   62: istore_2
        //   63: aload 6
        //   65: iload_2
        //   66: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   69: aload_0
        //   70: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   73: sipush 5015
        //   76: aload 6
        //   78: aload 7
        //   80: iconst_0
        //   81: invokeinterface 44 5 0
        //   86: pop
        //   87: aload 7
        //   89: invokevirtual 47	android/os/Parcel:readException	()V
        //   92: aload 7
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: return
        //   103: aconst_null
        //   104: astore_1
        //   105: goto -74 -> 31
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -61 -> 49
        //   113: iconst_0
        //   114: istore_2
        //   115: goto -52 -> 63
        //   118: astore_1
        //   119: aload 7
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 6
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramInt	int
        //   0	131	3	paramBoolean1	boolean
        //   0	131	4	paramBoolean2	boolean
        //   1	60	5	i	int
        //   6	119	6	localParcel1	Parcel
        //   11	109	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	43	118	finally
        //   49	55	118	finally
        //   63	92	118	finally
      }
      
      /* Error */
      public void a(eq parameq, long paramLong)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +56 -> 74
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 4
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 4
        //   36: lload_2
        //   37: invokevirtual 110	android/os/Parcel:writeLong	(J)V
        //   40: aload_0
        //   41: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   44: sipush 5058
        //   47: aload 4
        //   49: aload 5
        //   51: iconst_0
        //   52: invokeinterface 44 5 0
        //   57: pop
        //   58: aload 5
        //   60: invokevirtual 47	android/os/Parcel:readException	()V
        //   63: aload 5
        //   65: invokevirtual 54	android/os/Parcel:recycle	()V
        //   68: aload 4
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: return
        //   74: aconst_null
        //   75: astore_1
        //   76: goto -48 -> 28
        //   79: astore_1
        //   80: aload 5
        //   82: invokevirtual 54	android/os/Parcel:recycle	()V
        //   85: aload 4
        //   87: invokevirtual 54	android/os/Parcel:recycle	()V
        //   90: aload_1
        //   91: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	92	0	this	a
        //   0	92	1	parameq	eq
        //   0	92	2	paramLong	long
        //   3	83	4	localParcel1	Parcel
        //   8	73	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	79	finally
        //   21	28	79	finally
        //   28	63	79	finally
      }
      
      /* Error */
      public void a(eq parameq, Bundle paramBundle, int paramInt1, int paramInt2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 6
        //   10: aload 5
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +80 -> 98
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 5
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload_2
        //   35: ifnull +68 -> 103
        //   38: aload 5
        //   40: iconst_1
        //   41: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   44: aload_2
        //   45: aload 5
        //   47: iconst_0
        //   48: invokevirtual 102	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   51: aload 5
        //   53: iload_3
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload 5
        //   59: iload 4
        //   61: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   64: aload_0
        //   65: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   68: sipush 5021
        //   71: aload 5
        //   73: aload 6
        //   75: iconst_0
        //   76: invokeinterface 44 5 0
        //   81: pop
        //   82: aload 6
        //   84: invokevirtual 47	android/os/Parcel:readException	()V
        //   87: aload 6
        //   89: invokevirtual 54	android/os/Parcel:recycle	()V
        //   92: aload 5
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: return
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -72 -> 28
        //   103: aload 5
        //   105: iconst_0
        //   106: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   109: goto -58 -> 51
        //   112: astore_1
        //   113: aload 6
        //   115: invokevirtual 54	android/os/Parcel:recycle	()V
        //   118: aload 5
        //   120: invokevirtual 54	android/os/Parcel:recycle	()V
        //   123: aload_1
        //   124: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	125	0	this	a
        //   0	125	1	parameq	eq
        //   0	125	2	paramBundle	Bundle
        //   0	125	3	paramInt1	int
        //   0	125	4	paramInt2	int
        //   3	116	5	localParcel1	Parcel
        //   8	106	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	112	finally
        //   21	28	112	finally
        //   28	34	112	finally
        //   38	51	112	finally
        //   51	87	112	finally
        //   103	109	112	finally
      }
      
      public void a(eq parameq, IBinder paramIBinder, int paramInt, String[] paramArrayOfString, Bundle paramBundle, boolean paramBoolean, long paramLong)
        throws RemoteException
      {
        int i = 1;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (parameq != null)
            {
              parameq = parameq.asBinder();
              localParcel1.writeStrongBinder(parameq);
              localParcel1.writeStrongBinder(paramIBinder);
              localParcel1.writeInt(paramInt);
              localParcel1.writeStringArray(paramArrayOfString);
              if (paramBundle != null)
              {
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                break label157;
                localParcel1.writeInt(paramInt);
                localParcel1.writeLong(paramLong);
                this.dG.transact(5030, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              parameq = null;
              continue;
            }
            localParcel1.writeInt(0);
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          label157:
          do
          {
            paramInt = 0;
            break;
          } while (!paramBoolean);
          paramInt = i;
        }
      }
      
      /* Error */
      public void a(eq parameq, IBinder paramIBinder, String paramString, boolean paramBoolean, long paramLong)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 7
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 8
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 9
        //   13: aload 8
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +84 -> 105
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 8
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 8
        //   39: aload_2
        //   40: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   43: aload 8
        //   45: aload_3
        //   46: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   49: iload 4
        //   51: ifeq +6 -> 57
        //   54: iconst_1
        //   55: istore 7
        //   57: aload 8
        //   59: iload 7
        //   61: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   64: aload 8
        //   66: lload 5
        //   68: invokevirtual 110	android/os/Parcel:writeLong	(J)V
        //   71: aload_0
        //   72: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   75: sipush 5031
        //   78: aload 8
        //   80: aload 9
        //   82: iconst_0
        //   83: invokeinterface 44 5 0
        //   88: pop
        //   89: aload 9
        //   91: invokevirtual 47	android/os/Parcel:readException	()V
        //   94: aload 9
        //   96: invokevirtual 54	android/os/Parcel:recycle	()V
        //   99: aload 8
        //   101: invokevirtual 54	android/os/Parcel:recycle	()V
        //   104: return
        //   105: aconst_null
        //   106: astore_1
        //   107: goto -76 -> 31
        //   110: astore_1
        //   111: aload 9
        //   113: invokevirtual 54	android/os/Parcel:recycle	()V
        //   116: aload 8
        //   118: invokevirtual 54	android/os/Parcel:recycle	()V
        //   121: aload_1
        //   122: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	123	0	this	a
        //   0	123	1	parameq	eq
        //   0	123	2	paramIBinder	IBinder
        //   0	123	3	paramString	String
        //   0	123	4	paramBoolean	boolean
        //   0	123	5	paramLong	long
        //   1	59	7	i	int
        //   6	111	8	localParcel1	Parcel
        //   11	101	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	110	finally
        //   24	31	110	finally
        //   31	49	110	finally
        //   57	94	110	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5008
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 7
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 8
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 9
        //   13: aload 8
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +92 -> 113
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 8
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 8
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 8
        //   45: iload_3
        //   46: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   49: aload 8
        //   51: iload 4
        //   53: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   56: aload 8
        //   58: iload 5
        //   60: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   63: iload 7
        //   65: istore_3
        //   66: iload 6
        //   68: ifeq +5 -> 73
        //   71: iconst_1
        //   72: istore_3
        //   73: aload 8
        //   75: iload_3
        //   76: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   79: aload_0
        //   80: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   83: sipush 5019
        //   86: aload 8
        //   88: aload 9
        //   90: iconst_0
        //   91: invokeinterface 44 5 0
        //   96: pop
        //   97: aload 9
        //   99: invokevirtual 47	android/os/Parcel:readException	()V
        //   102: aload 9
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload 8
        //   109: invokevirtual 54	android/os/Parcel:recycle	()V
        //   112: return
        //   113: aconst_null
        //   114: astore_1
        //   115: goto -84 -> 31
        //   118: astore_1
        //   119: aload 9
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 8
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramString	String
        //   0	131	3	paramInt1	int
        //   0	131	4	paramInt2	int
        //   0	131	5	paramInt3	int
        //   0	131	6	paramBoolean	boolean
        //   1	63	7	i	int
        //   6	119	8	localParcel1	Parcel
        //   11	109	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	63	118	finally
        //   73	102	118	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 6
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 7
        //   10: aload 6
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +88 -> 106
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 6
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 6
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 6
        //   42: iload_3
        //   43: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   46: aload 6
        //   48: aload 4
        //   50: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   53: aload 5
        //   55: ifnull +56 -> 111
        //   58: aload 6
        //   60: iconst_1
        //   61: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   64: aload 5
        //   66: aload 6
        //   68: iconst_0
        //   69: invokevirtual 102	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   72: aload_0
        //   73: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 5025
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 44 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 47	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 54	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 54	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore_1
        //   108: goto -80 -> 28
        //   111: aload 6
        //   113: iconst_0
        //   114: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   117: goto -45 -> 72
        //   120: astore_1
        //   121: aload 7
        //   123: invokevirtual 54	android/os/Parcel:recycle	()V
        //   126: aload 6
        //   128: invokevirtual 54	android/os/Parcel:recycle	()V
        //   131: aload_1
        //   132: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	133	0	this	a
        //   0	133	1	parameq	eq
        //   0	133	2	paramString	String
        //   0	133	3	paramInt	int
        //   0	133	4	paramIBinder	IBinder
        //   0	133	5	paramBundle	Bundle
        //   3	124	6	localParcel1	Parcel
        //   8	114	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	120	finally
        //   21	28	120	finally
        //   28	53	120	finally
        //   58	72	120	finally
        //   72	95	120	finally
        //   111	117	120	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +89 -> 110
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 7
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 7
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 7
        //   45: iload_3
        //   46: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   49: iload 4
        //   51: ifeq +64 -> 115
        //   54: iconst_1
        //   55: istore_3
        //   56: aload 7
        //   58: iload_3
        //   59: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   62: iload 5
        //   64: ifeq +56 -> 120
        //   67: iload 6
        //   69: istore_3
        //   70: aload 7
        //   72: iload_3
        //   73: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   76: aload_0
        //   77: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   80: sipush 5045
        //   83: aload 7
        //   85: aload 8
        //   87: iconst_0
        //   88: invokeinterface 44 5 0
        //   93: pop
        //   94: aload 8
        //   96: invokevirtual 47	android/os/Parcel:readException	()V
        //   99: aload 8
        //   101: invokevirtual 54	android/os/Parcel:recycle	()V
        //   104: aload 7
        //   106: invokevirtual 54	android/os/Parcel:recycle	()V
        //   109: return
        //   110: aconst_null
        //   111: astore_1
        //   112: goto -81 -> 31
        //   115: iconst_0
        //   116: istore_3
        //   117: goto -61 -> 56
        //   120: iconst_0
        //   121: istore_3
        //   122: goto -52 -> 70
        //   125: astore_1
        //   126: aload 8
        //   128: invokevirtual 54	android/os/Parcel:recycle	()V
        //   131: aload 7
        //   133: invokevirtual 54	android/os/Parcel:recycle	()V
        //   136: aload_1
        //   137: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	138	0	this	a
        //   0	138	1	parameq	eq
        //   0	138	2	paramString	String
        //   0	138	3	paramInt	int
        //   0	138	4	paramBoolean1	boolean
        //   0	138	5	paramBoolean2	boolean
        //   1	67	6	i	int
        //   6	126	7	localParcel1	Parcel
        //   11	116	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	125	finally
        //   24	31	125	finally
        //   31	49	125	finally
        //   56	62	125	finally
        //   70	99	125	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 8
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 9
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 10
        //   13: aload 9
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +115 -> 136
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 9
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 9
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 9
        //   45: iload_3
        //   46: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   49: iload 4
        //   51: ifeq +90 -> 141
        //   54: iconst_1
        //   55: istore_3
        //   56: aload 9
        //   58: iload_3
        //   59: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   62: iload 5
        //   64: ifeq +82 -> 146
        //   67: iconst_1
        //   68: istore_3
        //   69: aload 9
        //   71: iload_3
        //   72: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   75: iload 6
        //   77: ifeq +74 -> 151
        //   80: iconst_1
        //   81: istore_3
        //   82: aload 9
        //   84: iload_3
        //   85: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   88: iload 7
        //   90: ifeq +66 -> 156
        //   93: iload 8
        //   95: istore_3
        //   96: aload 9
        //   98: iload_3
        //   99: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   102: aload_0
        //   103: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   106: sipush 6501
        //   109: aload 9
        //   111: aload 10
        //   113: iconst_0
        //   114: invokeinterface 44 5 0
        //   119: pop
        //   120: aload 10
        //   122: invokevirtual 47	android/os/Parcel:readException	()V
        //   125: aload 10
        //   127: invokevirtual 54	android/os/Parcel:recycle	()V
        //   130: aload 9
        //   132: invokevirtual 54	android/os/Parcel:recycle	()V
        //   135: return
        //   136: aconst_null
        //   137: astore_1
        //   138: goto -107 -> 31
        //   141: iconst_0
        //   142: istore_3
        //   143: goto -87 -> 56
        //   146: iconst_0
        //   147: istore_3
        //   148: goto -79 -> 69
        //   151: iconst_0
        //   152: istore_3
        //   153: goto -71 -> 82
        //   156: iconst_0
        //   157: istore_3
        //   158: goto -62 -> 96
        //   161: astore_1
        //   162: aload 10
        //   164: invokevirtual 54	android/os/Parcel:recycle	()V
        //   167: aload 9
        //   169: invokevirtual 54	android/os/Parcel:recycle	()V
        //   172: aload_1
        //   173: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	174	0	this	a
        //   0	174	1	parameq	eq
        //   0	174	2	paramString	String
        //   0	174	3	paramInt	int
        //   0	174	4	paramBoolean1	boolean
        //   0	174	5	paramBoolean2	boolean
        //   0	174	6	paramBoolean3	boolean
        //   0	174	7	paramBoolean4	boolean
        //   1	93	8	i	int
        //   6	162	9	localParcel1	Parcel
        //   11	152	10	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	161	finally
        //   24	31	161	finally
        //   31	49	161	finally
        //   56	62	161	finally
        //   69	75	161	finally
        //   82	88	161	finally
        //   96	125	161	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, long paramLong)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 6
        //   10: aload 5
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +62 -> 80
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 5
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 5
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 5
        //   42: lload_3
        //   43: invokevirtual 110	android/os/Parcel:writeLong	(J)V
        //   46: aload_0
        //   47: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   50: sipush 5016
        //   53: aload 5
        //   55: aload 6
        //   57: iconst_0
        //   58: invokeinterface 44 5 0
        //   63: pop
        //   64: aload 6
        //   66: invokevirtual 47	android/os/Parcel:readException	()V
        //   69: aload 6
        //   71: invokevirtual 54	android/os/Parcel:recycle	()V
        //   74: aload 5
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: return
        //   80: aconst_null
        //   81: astore_1
        //   82: goto -54 -> 28
        //   85: astore_1
        //   86: aload 6
        //   88: invokevirtual 54	android/os/Parcel:recycle	()V
        //   91: aload 5
        //   93: invokevirtual 54	android/os/Parcel:recycle	()V
        //   96: aload_1
        //   97: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	98	0	this	a
        //   0	98	1	parameq	eq
        //   0	98	2	paramString	String
        //   0	98	3	paramLong	long
        //   3	89	5	localParcel1	Parcel
        //   8	79	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	85	finally
        //   21	28	85	finally
        //   28	69	85	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, long paramLong, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 6
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 7
        //   10: aload 6
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +69 -> 87
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 6
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 6
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 6
        //   42: lload_3
        //   43: invokevirtual 110	android/os/Parcel:writeLong	(J)V
        //   46: aload 6
        //   48: aload 5
        //   50: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   53: aload_0
        //   54: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   57: sipush 7002
        //   60: aload 6
        //   62: aload 7
        //   64: iconst_0
        //   65: invokeinterface 44 5 0
        //   70: pop
        //   71: aload 7
        //   73: invokevirtual 47	android/os/Parcel:readException	()V
        //   76: aload 7
        //   78: invokevirtual 54	android/os/Parcel:recycle	()V
        //   81: aload 6
        //   83: invokevirtual 54	android/os/Parcel:recycle	()V
        //   86: return
        //   87: aconst_null
        //   88: astore_1
        //   89: goto -61 -> 28
        //   92: astore_1
        //   93: aload 7
        //   95: invokevirtual 54	android/os/Parcel:recycle	()V
        //   98: aload 6
        //   100: invokevirtual 54	android/os/Parcel:recycle	()V
        //   103: aload_1
        //   104: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	105	0	this	a
        //   0	105	1	parameq	eq
        //   0	105	2	paramString1	String
        //   0	105	3	paramLong	long
        //   0	105	5	paramString2	String
        //   3	96	6	localParcel1	Parcel
        //   8	86	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	92	finally
        //   21	28	92	finally
        //   28	76	92	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 6
        //   10: aload 5
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +81 -> 99
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 5
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 5
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 5
        //   42: aload_3
        //   43: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   46: aload 4
        //   48: ifnull +56 -> 104
        //   51: aload 5
        //   53: iconst_1
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload 4
        //   59: aload 5
        //   61: iconst_0
        //   62: invokevirtual 102	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   65: aload_0
        //   66: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   69: sipush 5023
        //   72: aload 5
        //   74: aload 6
        //   76: iconst_0
        //   77: invokeinterface 44 5 0
        //   82: pop
        //   83: aload 6
        //   85: invokevirtual 47	android/os/Parcel:readException	()V
        //   88: aload 6
        //   90: invokevirtual 54	android/os/Parcel:recycle	()V
        //   93: aload 5
        //   95: invokevirtual 54	android/os/Parcel:recycle	()V
        //   98: return
        //   99: aconst_null
        //   100: astore_1
        //   101: goto -73 -> 28
        //   104: aload 5
        //   106: iconst_0
        //   107: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   110: goto -45 -> 65
        //   113: astore_1
        //   114: aload 6
        //   116: invokevirtual 54	android/os/Parcel:recycle	()V
        //   119: aload 5
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload_1
        //   125: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	126	0	this	a
        //   0	126	1	parameq	eq
        //   0	126	2	paramString	String
        //   0	126	3	paramIBinder	IBinder
        //   0	126	4	paramBundle	Bundle
        //   3	117	5	localParcel1	Parcel
        //   8	107	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	113	finally
        //   21	28	113	finally
        //   28	46	113	finally
        //   51	65	113	finally
        //   65	88	113	finally
        //   104	110	113	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +62 -> 80
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 4
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 4
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 4
        //   42: aload_3
        //   43: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload_0
        //   47: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   50: sipush 5009
        //   53: aload 4
        //   55: aload 5
        //   57: iconst_0
        //   58: invokeinterface 44 5 0
        //   63: pop
        //   64: aload 5
        //   66: invokevirtual 47	android/os/Parcel:readException	()V
        //   69: aload 5
        //   71: invokevirtual 54	android/os/Parcel:recycle	()V
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: return
        //   80: aconst_null
        //   81: astore_1
        //   82: goto -54 -> 28
        //   85: astore_1
        //   86: aload 5
        //   88: invokevirtual 54	android/os/Parcel:recycle	()V
        //   91: aload 4
        //   93: invokevirtual 54	android/os/Parcel:recycle	()V
        //   96: aload_1
        //   97: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	98	0	this	a
        //   0	98	1	parameq	eq
        //   0	98	2	paramString1	String
        //   0	98	3	paramString2	String
        //   3	89	4	localParcel1	Parcel
        //   8	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	85	finally
        //   21	28	85	finally
        //   28	69	85	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 8
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 9
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 10
        //   13: aload 9
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +102 -> 123
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 9
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 9
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 9
        //   45: aload_3
        //   46: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   49: aload 9
        //   51: iload 4
        //   53: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   56: aload 9
        //   58: iload 5
        //   60: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   63: aload 9
        //   65: iload 6
        //   67: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   70: iload 8
        //   72: istore 4
        //   74: iload 7
        //   76: ifeq +6 -> 82
        //   79: iconst_1
        //   80: istore 4
        //   82: aload 9
        //   84: iload 4
        //   86: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   89: aload_0
        //   90: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   93: sipush 5039
        //   96: aload 9
        //   98: aload 10
        //   100: iconst_0
        //   101: invokeinterface 44 5 0
        //   106: pop
        //   107: aload 10
        //   109: invokevirtual 47	android/os/Parcel:readException	()V
        //   112: aload 10
        //   114: invokevirtual 54	android/os/Parcel:recycle	()V
        //   117: aload 9
        //   119: invokevirtual 54	android/os/Parcel:recycle	()V
        //   122: return
        //   123: aconst_null
        //   124: astore_1
        //   125: goto -94 -> 31
        //   128: astore_1
        //   129: aload 10
        //   131: invokevirtual 54	android/os/Parcel:recycle	()V
        //   134: aload 9
        //   136: invokevirtual 54	android/os/Parcel:recycle	()V
        //   139: aload_1
        //   140: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	141	0	this	a
        //   0	141	1	parameq	eq
        //   0	141	2	paramString1	String
        //   0	141	3	paramString2	String
        //   0	141	4	paramInt1	int
        //   0	141	5	paramInt2	int
        //   0	141	6	paramInt3	int
        //   0	141	7	paramBoolean	boolean
        //   1	70	8	i	int
        //   6	129	9	localParcel1	Parcel
        //   11	119	10	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	128	finally
        //   24	31	128	finally
        //   31	70	128	finally
        //   82	112	128	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +77 -> 98
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 6
        //   45: aload_3
        //   46: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   49: iload 4
        //   51: ifeq +6 -> 57
        //   54: iconst_1
        //   55: istore 5
        //   57: aload 6
        //   59: iload 5
        //   61: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   64: aload_0
        //   65: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   68: sipush 6002
        //   71: aload 6
        //   73: aload 7
        //   75: iconst_0
        //   76: invokeinterface 44 5 0
        //   81: pop
        //   82: aload 7
        //   84: invokevirtual 47	android/os/Parcel:readException	()V
        //   87: aload 7
        //   89: invokevirtual 54	android/os/Parcel:recycle	()V
        //   92: aload 6
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: return
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -69 -> 31
        //   103: astore_1
        //   104: aload 7
        //   106: invokevirtual 54	android/os/Parcel:recycle	()V
        //   109: aload 6
        //   111: invokevirtual 54	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	parameq	eq
        //   0	116	2	paramString1	String
        //   0	116	3	paramString2	String
        //   0	116	4	paramBoolean	boolean
        //   1	59	5	i	int
        //   6	104	6	localParcel1	Parcel
        //   11	94	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	103	finally
        //   24	31	103	finally
        //   31	49	103	finally
        //   57	87	103	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +70 -> 91
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 5
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 5
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: iload_3
        //   44: ifeq +6 -> 50
        //   47: iconst_1
        //   48: istore 4
        //   50: aload 5
        //   52: iload 4
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload_0
        //   58: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   61: sipush 5054
        //   64: aload 5
        //   66: aload 6
        //   68: iconst_0
        //   69: invokeinterface 44 5 0
        //   74: pop
        //   75: aload 6
        //   77: invokevirtual 47	android/os/Parcel:readException	()V
        //   80: aload 6
        //   82: invokevirtual 54	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: invokevirtual 54	android/os/Parcel:recycle	()V
        //   90: return
        //   91: aconst_null
        //   92: astore_1
        //   93: goto -62 -> 31
        //   96: astore_1
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: aload 5
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload_1
        //   108: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	109	0	this	a
        //   0	109	1	parameq	eq
        //   0	109	2	paramString	String
        //   0	109	3	paramBoolean	boolean
        //   1	52	4	i	int
        //   6	97	5	localParcel1	Parcel
        //   11	87	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	96	finally
        //   24	31	96	finally
        //   31	43	96	finally
        //   50	80	96	finally
      }
      
      /* Error */
      public void a(eq parameq, String paramString, boolean paramBoolean, long[] paramArrayOfLong)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +77 -> 98
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: iload_3
        //   44: ifeq +6 -> 50
        //   47: iconst_1
        //   48: istore 5
        //   50: aload 6
        //   52: iload 5
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload 6
        //   59: aload 4
        //   61: invokevirtual 134	android/os/Parcel:writeLongArray	([J)V
        //   64: aload_0
        //   65: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   68: sipush 5011
        //   71: aload 6
        //   73: aload 7
        //   75: iconst_0
        //   76: invokeinterface 44 5 0
        //   81: pop
        //   82: aload 7
        //   84: invokevirtual 47	android/os/Parcel:readException	()V
        //   87: aload 7
        //   89: invokevirtual 54	android/os/Parcel:recycle	()V
        //   92: aload 6
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: return
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -69 -> 31
        //   103: astore_1
        //   104: aload 7
        //   106: invokevirtual 54	android/os/Parcel:recycle	()V
        //   109: aload 6
        //   111: invokevirtual 54	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	parameq	eq
        //   0	116	2	paramString	String
        //   0	116	3	paramBoolean	boolean
        //   0	116	4	paramArrayOfLong	long[]
        //   1	52	5	i	int
        //   6	104	6	localParcel1	Parcel
        //   11	94	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	103	finally
        //   24	31	103	finally
        //   31	43	103	finally
        //   50	87	103	finally
      }
      
      /* Error */
      public void a(eq parameq, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   10: astore 5
        //   12: aload 4
        //   14: ldc 31
        //   16: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   19: aload_1
        //   20: ifnull +62 -> 82
        //   23: aload_1
        //   24: invokeinterface 84 1 0
        //   29: astore_1
        //   30: aload 4
        //   32: aload_1
        //   33: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: iload_2
        //   37: ifeq +5 -> 42
        //   40: iconst_1
        //   41: istore_3
        //   42: aload 4
        //   44: iload_3
        //   45: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   48: aload_0
        //   49: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 5063
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 44 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 47	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 54	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: invokevirtual 54	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore_1
        //   84: goto -54 -> 30
        //   87: astore_1
        //   88: aload 5
        //   90: invokevirtual 54	android/os/Parcel:recycle	()V
        //   93: aload 4
        //   95: invokevirtual 54	android/os/Parcel:recycle	()V
        //   98: aload_1
        //   99: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	100	0	this	a
        //   0	100	1	parameq	eq
        //   0	100	2	paramBoolean	boolean
        //   1	44	3	i	int
        //   5	89	4	localParcel1	Parcel
        //   10	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   12	19	87	finally
        //   23	30	87	finally
        //   30	36	87	finally
        //   42	71	87	finally
      }
      
      public void a(String paramString1, String paramString2, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5051, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public IBinder asBinder()
      {
        return this.dG;
      }
      
      public int b(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeByteArray(paramArrayOfByte);
          localParcel1.writeString(paramString);
          localParcel1.writeStringArray(paramArrayOfString);
          this.dG.transact(5034, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public void b(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5017
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void b(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +82 -> 103
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: iload_2
        //   40: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   43: iload_3
        //   44: ifeq +64 -> 108
        //   47: iconst_1
        //   48: istore_2
        //   49: aload 6
        //   51: iload_2
        //   52: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   55: iload 4
        //   57: ifeq +56 -> 113
        //   60: iload 5
        //   62: istore_2
        //   63: aload 6
        //   65: iload_2
        //   66: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   69: aload_0
        //   70: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   73: sipush 5046
        //   76: aload 6
        //   78: aload 7
        //   80: iconst_0
        //   81: invokeinterface 44 5 0
        //   86: pop
        //   87: aload 7
        //   89: invokevirtual 47	android/os/Parcel:readException	()V
        //   92: aload 7
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: return
        //   103: aconst_null
        //   104: astore_1
        //   105: goto -74 -> 31
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -61 -> 49
        //   113: iconst_0
        //   114: istore_2
        //   115: goto -52 -> 63
        //   118: astore_1
        //   119: aload 7
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 6
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramInt	int
        //   0	131	3	paramBoolean1	boolean
        //   0	131	4	paramBoolean2	boolean
        //   1	60	5	i	int
        //   6	119	6	localParcel1	Parcel
        //   11	109	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	43	118	finally
        //   49	55	118	finally
        //   63	92	118	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5010
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 7
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 8
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 9
        //   13: aload 8
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +92 -> 113
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 8
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 8
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 8
        //   45: iload_3
        //   46: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   49: aload 8
        //   51: iload 4
        //   53: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   56: aload 8
        //   58: iload 5
        //   60: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   63: iload 7
        //   65: istore_3
        //   66: iload 6
        //   68: ifeq +5 -> 73
        //   71: iconst_1
        //   72: istore_3
        //   73: aload 8
        //   75: iload_3
        //   76: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   79: aload_0
        //   80: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   83: sipush 5020
        //   86: aload 8
        //   88: aload 9
        //   90: iconst_0
        //   91: invokeinterface 44 5 0
        //   96: pop
        //   97: aload 9
        //   99: invokevirtual 47	android/os/Parcel:readException	()V
        //   102: aload 9
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload 8
        //   109: invokevirtual 54	android/os/Parcel:recycle	()V
        //   112: return
        //   113: aconst_null
        //   114: astore_1
        //   115: goto -84 -> 31
        //   118: astore_1
        //   119: aload 9
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 8
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramString	String
        //   0	131	3	paramInt1	int
        //   0	131	4	paramInt2	int
        //   0	131	5	paramInt3	int
        //   0	131	6	paramBoolean	boolean
        //   1	63	7	i	int
        //   6	119	8	localParcel1	Parcel
        //   11	109	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	63	118	finally
        //   73	102	118	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 6
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 7
        //   10: aload 6
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +88 -> 106
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 6
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 6
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 6
        //   42: iload_3
        //   43: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   46: aload 6
        //   48: aload 4
        //   50: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   53: aload 5
        //   55: ifnull +56 -> 111
        //   58: aload 6
        //   60: iconst_1
        //   61: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   64: aload 5
        //   66: aload 6
        //   68: iconst_0
        //   69: invokevirtual 102	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   72: aload_0
        //   73: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   76: sipush 7003
        //   79: aload 6
        //   81: aload 7
        //   83: iconst_0
        //   84: invokeinterface 44 5 0
        //   89: pop
        //   90: aload 7
        //   92: invokevirtual 47	android/os/Parcel:readException	()V
        //   95: aload 7
        //   97: invokevirtual 54	android/os/Parcel:recycle	()V
        //   100: aload 6
        //   102: invokevirtual 54	android/os/Parcel:recycle	()V
        //   105: return
        //   106: aconst_null
        //   107: astore_1
        //   108: goto -80 -> 28
        //   111: aload 6
        //   113: iconst_0
        //   114: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   117: goto -45 -> 72
        //   120: astore_1
        //   121: aload 7
        //   123: invokevirtual 54	android/os/Parcel:recycle	()V
        //   126: aload 6
        //   128: invokevirtual 54	android/os/Parcel:recycle	()V
        //   131: aload_1
        //   132: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	133	0	this	a
        //   0	133	1	parameq	eq
        //   0	133	2	paramString	String
        //   0	133	3	paramInt	int
        //   0	133	4	paramIBinder	IBinder
        //   0	133	5	paramBundle	Bundle
        //   3	124	6	localParcel1	Parcel
        //   8	114	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	120	finally
        //   21	28	120	finally
        //   28	53	120	finally
        //   58	72	120	finally
        //   72	95	120	finally
        //   111	117	120	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 6
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 7
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 8
        //   13: aload 7
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +89 -> 110
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 7
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 7
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 7
        //   45: iload_3
        //   46: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   49: iload 4
        //   51: ifeq +64 -> 115
        //   54: iconst_1
        //   55: istore_3
        //   56: aload 7
        //   58: iload_3
        //   59: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   62: iload 5
        //   64: ifeq +56 -> 120
        //   67: iload 6
        //   69: istore_3
        //   70: aload 7
        //   72: iload_3
        //   73: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   76: aload_0
        //   77: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   80: sipush 5501
        //   83: aload 7
        //   85: aload 8
        //   87: iconst_0
        //   88: invokeinterface 44 5 0
        //   93: pop
        //   94: aload 8
        //   96: invokevirtual 47	android/os/Parcel:readException	()V
        //   99: aload 8
        //   101: invokevirtual 54	android/os/Parcel:recycle	()V
        //   104: aload 7
        //   106: invokevirtual 54	android/os/Parcel:recycle	()V
        //   109: return
        //   110: aconst_null
        //   111: astore_1
        //   112: goto -81 -> 31
        //   115: iconst_0
        //   116: istore_3
        //   117: goto -61 -> 56
        //   120: iconst_0
        //   121: istore_3
        //   122: goto -52 -> 70
        //   125: astore_1
        //   126: aload 8
        //   128: invokevirtual 54	android/os/Parcel:recycle	()V
        //   131: aload 7
        //   133: invokevirtual 54	android/os/Parcel:recycle	()V
        //   136: aload_1
        //   137: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	138	0	this	a
        //   0	138	1	parameq	eq
        //   0	138	2	paramString	String
        //   0	138	3	paramInt	int
        //   0	138	4	paramBoolean1	boolean
        //   0	138	5	paramBoolean2	boolean
        //   1	67	6	i	int
        //   6	126	7	localParcel1	Parcel
        //   11	116	8	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	125	finally
        //   24	31	125	finally
        //   31	49	125	finally
        //   56	62	125	finally
        //   70	99	125	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, IBinder paramIBinder, Bundle paramBundle)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 5
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 6
        //   10: aload 5
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +81 -> 99
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 5
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 5
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 5
        //   42: aload_3
        //   43: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   46: aload 4
        //   48: ifnull +56 -> 104
        //   51: aload 5
        //   53: iconst_1
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload 4
        //   59: aload 5
        //   61: iconst_0
        //   62: invokevirtual 102	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
        //   65: aload_0
        //   66: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   69: sipush 5024
        //   72: aload 5
        //   74: aload 6
        //   76: iconst_0
        //   77: invokeinterface 44 5 0
        //   82: pop
        //   83: aload 6
        //   85: invokevirtual 47	android/os/Parcel:readException	()V
        //   88: aload 6
        //   90: invokevirtual 54	android/os/Parcel:recycle	()V
        //   93: aload 5
        //   95: invokevirtual 54	android/os/Parcel:recycle	()V
        //   98: return
        //   99: aconst_null
        //   100: astore_1
        //   101: goto -73 -> 28
        //   104: aload 5
        //   106: iconst_0
        //   107: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   110: goto -45 -> 65
        //   113: astore_1
        //   114: aload 6
        //   116: invokevirtual 54	android/os/Parcel:recycle	()V
        //   119: aload 5
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload_1
        //   125: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	126	0	this	a
        //   0	126	1	parameq	eq
        //   0	126	2	paramString	String
        //   0	126	3	paramIBinder	IBinder
        //   0	126	4	paramBundle	Bundle
        //   3	117	5	localParcel1	Parcel
        //   8	107	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	113	finally
        //   21	28	113	finally
        //   28	46	113	finally
        //   51	65	113	finally
        //   65	88	113	finally
        //   104	110	113	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString1, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +62 -> 80
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 4
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 4
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 4
        //   42: aload_3
        //   43: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload_0
        //   47: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   50: sipush 5038
        //   53: aload 4
        //   55: aload 5
        //   57: iconst_0
        //   58: invokeinterface 44 5 0
        //   63: pop
        //   64: aload 5
        //   66: invokevirtual 47	android/os/Parcel:readException	()V
        //   69: aload 5
        //   71: invokevirtual 54	android/os/Parcel:recycle	()V
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: return
        //   80: aconst_null
        //   81: astore_1
        //   82: goto -54 -> 28
        //   85: astore_1
        //   86: aload 5
        //   88: invokevirtual 54	android/os/Parcel:recycle	()V
        //   91: aload 4
        //   93: invokevirtual 54	android/os/Parcel:recycle	()V
        //   96: aload_1
        //   97: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	98	0	this	a
        //   0	98	1	parameq	eq
        //   0	98	2	paramString1	String
        //   0	98	3	paramString2	String
        //   3	89	4	localParcel1	Parcel
        //   8	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	85	finally
        //   21	28	85	finally
        //   28	69	85	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 8
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 9
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 10
        //   13: aload 9
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +102 -> 123
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 9
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 9
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 9
        //   45: aload_3
        //   46: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   49: aload 9
        //   51: iload 4
        //   53: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   56: aload 9
        //   58: iload 5
        //   60: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   63: aload 9
        //   65: iload 6
        //   67: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   70: iload 8
        //   72: istore 4
        //   74: iload 7
        //   76: ifeq +6 -> 82
        //   79: iconst_1
        //   80: istore 4
        //   82: aload 9
        //   84: iload 4
        //   86: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   89: aload_0
        //   90: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   93: sipush 5040
        //   96: aload 9
        //   98: aload 10
        //   100: iconst_0
        //   101: invokeinterface 44 5 0
        //   106: pop
        //   107: aload 10
        //   109: invokevirtual 47	android/os/Parcel:readException	()V
        //   112: aload 10
        //   114: invokevirtual 54	android/os/Parcel:recycle	()V
        //   117: aload 9
        //   119: invokevirtual 54	android/os/Parcel:recycle	()V
        //   122: return
        //   123: aconst_null
        //   124: astore_1
        //   125: goto -94 -> 31
        //   128: astore_1
        //   129: aload 10
        //   131: invokevirtual 54	android/os/Parcel:recycle	()V
        //   134: aload 9
        //   136: invokevirtual 54	android/os/Parcel:recycle	()V
        //   139: aload_1
        //   140: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	141	0	this	a
        //   0	141	1	parameq	eq
        //   0	141	2	paramString1	String
        //   0	141	3	paramString2	String
        //   0	141	4	paramInt1	int
        //   0	141	5	paramInt2	int
        //   0	141	6	paramInt3	int
        //   0	141	7	paramBoolean	boolean
        //   1	70	8	i	int
        //   6	129	9	localParcel1	Parcel
        //   11	119	10	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	128	finally
        //   24	31	128	finally
        //   31	70	128	finally
        //   82	112	128	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString1, String paramString2, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +77 -> 98
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: aload 6
        //   45: aload_3
        //   46: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   49: iload 4
        //   51: ifeq +6 -> 57
        //   54: iconst_1
        //   55: istore 5
        //   57: aload 6
        //   59: iload 5
        //   61: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   64: aload_0
        //   65: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   68: sipush 6506
        //   71: aload 6
        //   73: aload 7
        //   75: iconst_0
        //   76: invokeinterface 44 5 0
        //   81: pop
        //   82: aload 7
        //   84: invokevirtual 47	android/os/Parcel:readException	()V
        //   87: aload 7
        //   89: invokevirtual 54	android/os/Parcel:recycle	()V
        //   92: aload 6
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: return
        //   98: aconst_null
        //   99: astore_1
        //   100: goto -69 -> 31
        //   103: astore_1
        //   104: aload 7
        //   106: invokevirtual 54	android/os/Parcel:recycle	()V
        //   109: aload 6
        //   111: invokevirtual 54	android/os/Parcel:recycle	()V
        //   114: aload_1
        //   115: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	116	0	this	a
        //   0	116	1	parameq	eq
        //   0	116	2	paramString1	String
        //   0	116	3	paramString2	String
        //   0	116	4	paramBoolean	boolean
        //   1	59	5	i	int
        //   6	104	6	localParcel1	Parcel
        //   11	94	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	103	finally
        //   24	31	103	finally
        //   31	49	103	finally
        //   57	87	103	finally
      }
      
      /* Error */
      public void b(eq parameq, String paramString, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +70 -> 91
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 5
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 5
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: iload_3
        //   44: ifeq +6 -> 50
        //   47: iconst_1
        //   48: istore 4
        //   50: aload 5
        //   52: iload 4
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload_0
        //   58: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   61: sipush 6502
        //   64: aload 5
        //   66: aload 6
        //   68: iconst_0
        //   69: invokeinterface 44 5 0
        //   74: pop
        //   75: aload 6
        //   77: invokevirtual 47	android/os/Parcel:readException	()V
        //   80: aload 6
        //   82: invokevirtual 54	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: invokevirtual 54	android/os/Parcel:recycle	()V
        //   90: return
        //   91: aconst_null
        //   92: astore_1
        //   93: goto -62 -> 31
        //   96: astore_1
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: aload 5
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload_1
        //   108: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	109	0	this	a
        //   0	109	1	parameq	eq
        //   0	109	2	paramString	String
        //   0	109	3	paramBoolean	boolean
        //   1	52	4	i	int
        //   6	97	5	localParcel1	Parcel
        //   11	87	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	96	finally
        //   24	31	96	finally
        //   31	43	96	finally
        //   50	80	96	finally
      }
      
      /* Error */
      public void b(eq parameq, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   10: astore 5
        //   12: aload 4
        //   14: ldc 31
        //   16: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   19: aload_1
        //   20: ifnull +62 -> 82
        //   23: aload_1
        //   24: invokeinterface 84 1 0
        //   29: astore_1
        //   30: aload 4
        //   32: aload_1
        //   33: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: iload_2
        //   37: ifeq +5 -> 42
        //   40: iconst_1
        //   41: istore_3
        //   42: aload 4
        //   44: iload_3
        //   45: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   48: aload_0
        //   49: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 6001
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 44 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 47	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 54	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: invokevirtual 54	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore_1
        //   84: goto -54 -> 30
        //   87: astore_1
        //   88: aload 5
        //   90: invokevirtual 54	android/os/Parcel:recycle	()V
        //   93: aload 4
        //   95: invokevirtual 54	android/os/Parcel:recycle	()V
        //   98: aload_1
        //   99: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	100	0	this	a
        //   0	100	1	parameq	eq
        //   0	100	2	paramBoolean	boolean
        //   1	44	3	i	int
        //   5	89	4	localParcel1	Parcel
        //   10	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   12	19	87	finally
        //   23	30	87	finally
        //   30	36	87	finally
        //   42	71	87	finally
      }
      
      public void bT()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5006, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public d bU()
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   18: sipush 5013
        //   21: aload_2
        //   22: aload_3
        //   23: iconst_0
        //   24: invokeinterface 44 5 0
        //   29: pop
        //   30: aload_3
        //   31: invokevirtual 47	android/os/Parcel:readException	()V
        //   34: aload_3
        //   35: invokevirtual 63	android/os/Parcel:readInt	()I
        //   38: ifeq +21 -> 59
        //   41: getstatic 146	com/google/android/gms/common/data/d:CREATOR	Lcom/google/android/gms/common/data/e;
        //   44: aload_3
        //   45: invokevirtual 152	com/google/android/gms/common/data/e:h	(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;
        //   48: astore_1
        //   49: aload_3
        //   50: invokevirtual 54	android/os/Parcel:recycle	()V
        //   53: aload_2
        //   54: invokevirtual 54	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: areturn
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -12 -> 49
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   48	13	1	locald	d
        //   64	10	1	localObject	Object
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	49	64	finally
      }
      
      public boolean bV()
        throws RemoteException
      {
        boolean bool = false;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5067, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public d bW()
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   18: sipush 5502
        //   21: aload_2
        //   22: aload_3
        //   23: iconst_0
        //   24: invokeinterface 44 5 0
        //   29: pop
        //   30: aload_3
        //   31: invokevirtual 47	android/os/Parcel:readException	()V
        //   34: aload_3
        //   35: invokevirtual 63	android/os/Parcel:readInt	()I
        //   38: ifeq +21 -> 59
        //   41: getstatic 146	com/google/android/gms/common/data/d:CREATOR	Lcom/google/android/gms/common/data/e;
        //   44: aload_3
        //   45: invokevirtual 152	com/google/android/gms/common/data/e:h	(Landroid/os/Parcel;)Lcom/google/android/gms/common/data/d;
        //   48: astore_1
        //   49: aload_3
        //   50: invokevirtual 54	android/os/Parcel:recycle	()V
        //   53: aload_2
        //   54: invokevirtual 54	android/os/Parcel:recycle	()V
        //   57: aload_1
        //   58: areturn
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -12 -> 49
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   48	13	1	locald	d
        //   64	10	1	localObject	Object
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	49	64	finally
      }
      
      /* Error */
      public Bundle ba()
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_0
        //   15: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   18: sipush 5004
        //   21: aload_2
        //   22: aload_3
        //   23: iconst_0
        //   24: invokeinterface 44 5 0
        //   29: pop
        //   30: aload_3
        //   31: invokevirtual 47	android/os/Parcel:readException	()V
        //   34: aload_3
        //   35: invokevirtual 63	android/os/Parcel:readInt	()I
        //   38: ifeq +26 -> 64
        //   41: getstatic 158	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
        //   44: aload_3
        //   45: invokeinterface 77 2 0
        //   50: checkcast 98	android/os/Bundle
        //   53: astore_1
        //   54: aload_3
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: aload_2
        //   59: invokevirtual 54	android/os/Parcel:recycle	()V
        //   62: aload_1
        //   63: areturn
        //   64: aconst_null
        //   65: astore_1
        //   66: goto -12 -> 54
        //   69: astore_1
        //   70: aload_3
        //   71: invokevirtual 54	android/os/Parcel:recycle	()V
        //   74: aload_2
        //   75: invokevirtual 54	android/os/Parcel:recycle	()V
        //   78: aload_1
        //   79: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	80	0	this	a
        //   53	13	1	localBundle	Bundle
        //   69	10	1	localObject	Object
        //   3	72	2	localParcel1	Parcel
        //   7	64	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	54	69	finally
      }
      
      /* Error */
      public void c(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5022
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void c(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +82 -> 103
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: iload_2
        //   40: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   43: iload_3
        //   44: ifeq +64 -> 108
        //   47: iconst_1
        //   48: istore_2
        //   49: aload 6
        //   51: iload_2
        //   52: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   55: iload 4
        //   57: ifeq +56 -> 113
        //   60: iload 5
        //   62: istore_2
        //   63: aload 6
        //   65: iload_2
        //   66: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   69: aload_0
        //   70: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   73: sipush 5048
        //   76: aload 6
        //   78: aload 7
        //   80: iconst_0
        //   81: invokeinterface 44 5 0
        //   86: pop
        //   87: aload 7
        //   89: invokevirtual 47	android/os/Parcel:readException	()V
        //   92: aload 7
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: return
        //   103: aconst_null
        //   104: astore_1
        //   105: goto -74 -> 31
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -61 -> 49
        //   113: iconst_0
        //   114: istore_2
        //   115: goto -52 -> 63
        //   118: astore_1
        //   119: aload 7
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 6
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramInt	int
        //   0	131	3	paramBoolean1	boolean
        //   0	131	4	paramBoolean2	boolean
        //   1	60	5	i	int
        //   6	119	6	localParcel1	Parcel
        //   11	109	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	43	118	finally
        //   49	55	118	finally
        //   63	92	118	finally
      }
      
      /* Error */
      public void c(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5014
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      /* Error */
      public void c(eq parameq, String paramString1, String paramString2)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +62 -> 80
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 4
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 4
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload 4
        //   42: aload_3
        //   43: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   46: aload_0
        //   47: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   50: sipush 5041
        //   53: aload 4
        //   55: aload 5
        //   57: iconst_0
        //   58: invokeinterface 44 5 0
        //   63: pop
        //   64: aload 5
        //   66: invokevirtual 47	android/os/Parcel:readException	()V
        //   69: aload 5
        //   71: invokevirtual 54	android/os/Parcel:recycle	()V
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: return
        //   80: aconst_null
        //   81: astore_1
        //   82: goto -54 -> 28
        //   85: astore_1
        //   86: aload 5
        //   88: invokevirtual 54	android/os/Parcel:recycle	()V
        //   91: aload 4
        //   93: invokevirtual 54	android/os/Parcel:recycle	()V
        //   96: aload_1
        //   97: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	98	0	this	a
        //   0	98	1	parameq	eq
        //   0	98	2	paramString1	String
        //   0	98	3	paramString2	String
        //   3	89	4	localParcel1	Parcel
        //   8	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	85	finally
        //   21	28	85	finally
        //   28	69	85	finally
      }
      
      /* Error */
      public void c(eq parameq, String paramString, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +70 -> 91
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 5
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 5
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: iload_3
        //   44: ifeq +6 -> 50
        //   47: iconst_1
        //   48: istore 4
        //   50: aload 5
        //   52: iload 4
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload_0
        //   58: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   61: sipush 6504
        //   64: aload 5
        //   66: aload 6
        //   68: iconst_0
        //   69: invokeinterface 44 5 0
        //   74: pop
        //   75: aload 6
        //   77: invokevirtual 47	android/os/Parcel:readException	()V
        //   80: aload 6
        //   82: invokevirtual 54	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: invokevirtual 54	android/os/Parcel:recycle	()V
        //   90: return
        //   91: aconst_null
        //   92: astore_1
        //   93: goto -62 -> 31
        //   96: astore_1
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: aload 5
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload_1
        //   108: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	109	0	this	a
        //   0	109	1	parameq	eq
        //   0	109	2	paramString	String
        //   0	109	3	paramBoolean	boolean
        //   1	52	4	i	int
        //   6	97	5	localParcel1	Parcel
        //   11	87	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	96	finally
        //   24	31	96	finally
        //   31	43	96	finally
        //   50	80	96	finally
      }
      
      /* Error */
      public void c(eq parameq, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore_3
        //   2: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   5: astore 4
        //   7: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   10: astore 5
        //   12: aload 4
        //   14: ldc 31
        //   16: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   19: aload_1
        //   20: ifnull +62 -> 82
        //   23: aload_1
        //   24: invokeinterface 84 1 0
        //   29: astore_1
        //   30: aload 4
        //   32: aload_1
        //   33: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   36: iload_2
        //   37: ifeq +5 -> 42
        //   40: iconst_1
        //   41: istore_3
        //   42: aload 4
        //   44: iload_3
        //   45: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   48: aload_0
        //   49: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   52: sipush 6503
        //   55: aload 4
        //   57: aload 5
        //   59: iconst_0
        //   60: invokeinterface 44 5 0
        //   65: pop
        //   66: aload 5
        //   68: invokevirtual 47	android/os/Parcel:readException	()V
        //   71: aload 5
        //   73: invokevirtual 54	android/os/Parcel:recycle	()V
        //   76: aload 4
        //   78: invokevirtual 54	android/os/Parcel:recycle	()V
        //   81: return
        //   82: aconst_null
        //   83: astore_1
        //   84: goto -54 -> 30
        //   87: astore_1
        //   88: aload 5
        //   90: invokevirtual 54	android/os/Parcel:recycle	()V
        //   93: aload 4
        //   95: invokevirtual 54	android/os/Parcel:recycle	()V
        //   98: aload_1
        //   99: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	100	0	this	a
        //   0	100	1	parameq	eq
        //   0	100	2	paramBoolean	boolean
        //   1	44	3	i	int
        //   5	89	4	localParcel1	Parcel
        //   10	79	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   12	19	87	finally
        //   23	30	87	finally
        //   30	36	87	finally
        //   42	71	87	finally
      }
      
      public void clearNotifications(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeInt(paramInt);
          this.dG.transact(5036, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void d(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5026
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void d(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +82 -> 103
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: iload_2
        //   40: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   43: iload_3
        //   44: ifeq +64 -> 108
        //   47: iconst_1
        //   48: istore_2
        //   49: aload 6
        //   51: iload_2
        //   52: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   55: iload 4
        //   57: ifeq +56 -> 113
        //   60: iload 5
        //   62: istore_2
        //   63: aload 6
        //   65: iload_2
        //   66: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   69: aload_0
        //   70: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   73: sipush 6003
        //   76: aload 6
        //   78: aload 7
        //   80: iconst_0
        //   81: invokeinterface 44 5 0
        //   86: pop
        //   87: aload 7
        //   89: invokevirtual 47	android/os/Parcel:readException	()V
        //   92: aload 7
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: return
        //   103: aconst_null
        //   104: astore_1
        //   105: goto -74 -> 31
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -61 -> 49
        //   113: iconst_0
        //   114: istore_2
        //   115: goto -52 -> 63
        //   118: astore_1
        //   119: aload 7
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 6
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramInt	int
        //   0	131	3	paramBoolean1	boolean
        //   0	131	4	paramBoolean2	boolean
        //   1	60	5	i	int
        //   6	119	6	localParcel1	Parcel
        //   11	109	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	43	118	finally
        //   49	55	118	finally
        //   63	92	118	finally
      }
      
      /* Error */
      public void d(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5018
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      /* Error */
      public void d(eq parameq, String paramString, boolean paramBoolean)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_0
        //   1: istore 4
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 5
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 6
        //   13: aload 5
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +70 -> 91
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 5
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 5
        //   39: aload_2
        //   40: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   43: iload_3
        //   44: ifeq +6 -> 50
        //   47: iconst_1
        //   48: istore 4
        //   50: aload 5
        //   52: iload 4
        //   54: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   57: aload_0
        //   58: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   61: sipush 6505
        //   64: aload 5
        //   66: aload 6
        //   68: iconst_0
        //   69: invokeinterface 44 5 0
        //   74: pop
        //   75: aload 6
        //   77: invokevirtual 47	android/os/Parcel:readException	()V
        //   80: aload 6
        //   82: invokevirtual 54	android/os/Parcel:recycle	()V
        //   85: aload 5
        //   87: invokevirtual 54	android/os/Parcel:recycle	()V
        //   90: return
        //   91: aconst_null
        //   92: astore_1
        //   93: goto -62 -> 31
        //   96: astore_1
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: aload 5
        //   104: invokevirtual 54	android/os/Parcel:recycle	()V
        //   107: aload_1
        //   108: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	109	0	this	a
        //   0	109	1	parameq	eq
        //   0	109	2	paramString	String
        //   0	109	3	paramBoolean	boolean
        //   1	52	4	i	int
        //   6	97	5	localParcel1	Parcel
        //   11	87	6	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	96	finally
        //   24	31	96	finally
        //   31	43	96	finally
        //   50	80	96	finally
      }
      
      public ParcelFileDescriptor e(Uri paramUri)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
            if (paramUri != null)
            {
              localParcel1.writeInt(1);
              paramUri.writeToParcel(localParcel1, 0);
              this.dG.transact(6507, localParcel1, localParcel2, 0);
              localParcel2.readException();
              if (localParcel2.readInt() != 0)
              {
                paramUri = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(localParcel2);
                return paramUri;
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramUri = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
      
      /* Error */
      public void e(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5027
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void e(eq parameq, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 5
        //   3: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 6
        //   8: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 7
        //   13: aload 6
        //   15: ldc 31
        //   17: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload_1
        //   21: ifnull +82 -> 103
        //   24: aload_1
        //   25: invokeinterface 84 1 0
        //   30: astore_1
        //   31: aload 6
        //   33: aload_1
        //   34: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   37: aload 6
        //   39: iload_2
        //   40: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   43: iload_3
        //   44: ifeq +64 -> 108
        //   47: iconst_1
        //   48: istore_2
        //   49: aload 6
        //   51: iload_2
        //   52: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   55: iload 4
        //   57: ifeq +56 -> 113
        //   60: iload 5
        //   62: istore_2
        //   63: aload 6
        //   65: iload_2
        //   66: invokevirtual 96	android/os/Parcel:writeInt	(I)V
        //   69: aload_0
        //   70: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   73: sipush 6004
        //   76: aload 6
        //   78: aload 7
        //   80: iconst_0
        //   81: invokeinterface 44 5 0
        //   86: pop
        //   87: aload 7
        //   89: invokevirtual 47	android/os/Parcel:readException	()V
        //   92: aload 7
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: aload 6
        //   99: invokevirtual 54	android/os/Parcel:recycle	()V
        //   102: return
        //   103: aconst_null
        //   104: astore_1
        //   105: goto -74 -> 31
        //   108: iconst_0
        //   109: istore_2
        //   110: goto -61 -> 49
        //   113: iconst_0
        //   114: istore_2
        //   115: goto -52 -> 63
        //   118: astore_1
        //   119: aload 7
        //   121: invokevirtual 54	android/os/Parcel:recycle	()V
        //   124: aload 6
        //   126: invokevirtual 54	android/os/Parcel:recycle	()V
        //   129: aload_1
        //   130: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	131	0	this	a
        //   0	131	1	parameq	eq
        //   0	131	2	paramInt	int
        //   0	131	3	paramBoolean1	boolean
        //   0	131	4	paramBoolean2	boolean
        //   1	60	5	i	int
        //   6	119	6	localParcel1	Parcel
        //   11	109	7	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	20	118	finally
        //   24	31	118	finally
        //   31	43	118	finally
        //   49	55	118	finally
        //   63	92	118	finally
      }
      
      /* Error */
      public void e(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5032
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      public void f(long paramLong)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeLong(paramLong);
          this.dG.transact(5001, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void f(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5047
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void f(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5037
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      public void f(String paramString1, String paramString2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          this.dG.transact(5065, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public void g(long paramLong)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeLong(paramLong);
          this.dG.transact(5059, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void g(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5049
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void g(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5042
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      public String getAppId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5003, localParcel1, localParcel2, 0);
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
      
      public String getCurrentAccountName()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5007, localParcel1, localParcel2, 0);
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
      
      public String getCurrentPlayerId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          this.dG.transact(5012, localParcel1, localParcel2, 0);
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
      
      /* Error */
      public void h(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5056
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void h(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5043
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      /* Error */
      public void i(eq parameq)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_2
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore_3
        //   8: aload_2
        //   9: ldc 31
        //   11: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   14: aload_1
        //   15: ifnull +44 -> 59
        //   18: aload_1
        //   19: invokeinterface 84 1 0
        //   24: astore_1
        //   25: aload_2
        //   26: aload_1
        //   27: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   30: aload_0
        //   31: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   34: sipush 5062
        //   37: aload_2
        //   38: aload_3
        //   39: iconst_0
        //   40: invokeinterface 44 5 0
        //   45: pop
        //   46: aload_3
        //   47: invokevirtual 47	android/os/Parcel:readException	()V
        //   50: aload_3
        //   51: invokevirtual 54	android/os/Parcel:recycle	()V
        //   54: aload_2
        //   55: invokevirtual 54	android/os/Parcel:recycle	()V
        //   58: return
        //   59: aconst_null
        //   60: astore_1
        //   61: goto -36 -> 25
        //   64: astore_1
        //   65: aload_3
        //   66: invokevirtual 54	android/os/Parcel:recycle	()V
        //   69: aload_2
        //   70: invokevirtual 54	android/os/Parcel:recycle	()V
        //   73: aload_1
        //   74: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	75	0	this	a
        //   0	75	1	parameq	eq
        //   3	67	2	localParcel1	Parcel
        //   7	59	3	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   8	14	64	finally
        //   18	25	64	finally
        //   25	50	64	finally
      }
      
      /* Error */
      public void i(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5052
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      public void i(String paramString, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5029, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public int j(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore 4
        //   5: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   8: astore 5
        //   10: aload 4
        //   12: ldc 31
        //   14: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   17: aload_1
        //   18: ifnull +63 -> 81
        //   21: aload_1
        //   22: invokeinterface 84 1 0
        //   27: astore_1
        //   28: aload 4
        //   30: aload_1
        //   31: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   34: aload 4
        //   36: aload_2
        //   37: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   40: aload_0
        //   41: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   44: sipush 5053
        //   47: aload 4
        //   49: aload 5
        //   51: iconst_0
        //   52: invokeinterface 44 5 0
        //   57: pop
        //   58: aload 5
        //   60: invokevirtual 47	android/os/Parcel:readException	()V
        //   63: aload 5
        //   65: invokevirtual 63	android/os/Parcel:readInt	()I
        //   68: istore_3
        //   69: aload 5
        //   71: invokevirtual 54	android/os/Parcel:recycle	()V
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: iload_3
        //   80: ireturn
        //   81: aconst_null
        //   82: astore_1
        //   83: goto -55 -> 28
        //   86: astore_1
        //   87: aload 5
        //   89: invokevirtual 54	android/os/Parcel:recycle	()V
        //   92: aload 4
        //   94: invokevirtual 54	android/os/Parcel:recycle	()V
        //   97: aload_1
        //   98: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	99	0	this	a
        //   0	99	1	parameq	eq
        //   0	99	2	paramString	String
        //   68	12	3	i	int
        //   3	90	4	localParcel1	Parcel
        //   8	80	5	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   10	17	86	finally
        //   21	28	86	finally
        //   28	69	86	finally
      }
      
      public void j(String paramString, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5028, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void k(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5061
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      public void k(String paramString, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          this.dG.transact(5055, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public void l(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 5057
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      /* Error */
      public void m(eq parameq, String paramString)
        throws RemoteException
      {
        // Byte code:
        //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   3: astore_3
        //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   7: astore 4
        //   9: aload_3
        //   10: ldc 31
        //   12: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   15: aload_1
        //   16: ifnull +52 -> 68
        //   19: aload_1
        //   20: invokeinterface 84 1 0
        //   25: astore_1
        //   26: aload_3
        //   27: aload_1
        //   28: invokevirtual 87	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
        //   31: aload_3
        //   32: aload_2
        //   33: invokevirtual 38	android/os/Parcel:writeString	(Ljava/lang/String;)V
        //   36: aload_0
        //   37: getfield 18	com/google/android/gms/internal/er$a$a:dG	Landroid/os/IBinder;
        //   40: sipush 7001
        //   43: aload_3
        //   44: aload 4
        //   46: iconst_0
        //   47: invokeinterface 44 5 0
        //   52: pop
        //   53: aload 4
        //   55: invokevirtual 47	android/os/Parcel:readException	()V
        //   58: aload 4
        //   60: invokevirtual 54	android/os/Parcel:recycle	()V
        //   63: aload_3
        //   64: invokevirtual 54	android/os/Parcel:recycle	()V
        //   67: return
        //   68: aconst_null
        //   69: astore_1
        //   70: goto -44 -> 26
        //   73: astore_1
        //   74: aload 4
        //   76: invokevirtual 54	android/os/Parcel:recycle	()V
        //   79: aload_3
        //   80: invokevirtual 54	android/os/Parcel:recycle	()V
        //   83: aload_1
        //   84: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	85	0	this	a
        //   0	85	1	parameq	eq
        //   0	85	2	paramString	String
        //   3	77	3	localParcel1	Parcel
        //   7	68	4	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   9	15	73	finally
        //   19	26	73	finally
        //   26	58	73	finally
      }
      
      public void setUseNewPlayerNotificationsFirstParty(boolean paramBoolean)
        throws RemoteException
      {
        int i = 0;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
          if (paramBoolean) {
            i = 1;
          }
          localParcel1.writeInt(i);
          this.dG.transact(5068, localParcel1, localParcel2, 0);
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


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\internal\er.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */