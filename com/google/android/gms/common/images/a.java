package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.cz;
import com.google.android.gms.internal.da;
import com.google.android.gms.internal.db;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.ek;
import java.lang.ref.WeakReference;

public final class a
{
  final a jS;
  private int jT = 0;
  private int jU = 0;
  int jV;
  private int jW;
  private WeakReference<ImageManager.OnImageLoadedListener> jX;
  private WeakReference<ImageView> jY;
  private WeakReference<TextView> jZ;
  private int ka = -1;
  private boolean kb = true;
  private boolean kc = false;
  
  public a(int paramInt)
  {
    this.jS = new a(null);
    this.jU = paramInt;
  }
  
  public a(Uri paramUri)
  {
    this.jS = new a(paramUri);
    this.jU = 0;
  }
  
  private cz a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    if (paramDrawable1 != null)
    {
      localDrawable = paramDrawable1;
      if (!(paramDrawable1 instanceof cz)) {}
    }
    for (Drawable localDrawable = ((cz)paramDrawable1).aS();; localDrawable = null) {
      return new cz(localDrawable, paramDrawable2);
    }
  }
  
  private void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    switch (this.jV)
    {
    }
    Object localObject;
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (paramBoolean2);
          localObject = (ImageManager.OnImageLoadedListener)this.jX.get();
        } while (localObject == null);
        ((ImageManager.OnImageLoadedListener)localObject).onImageLoaded(this.jS.uri, paramDrawable);
        return;
        localObject = (ImageView)this.jY.get();
      } while (localObject == null);
      a((ImageView)localObject, paramDrawable, paramBoolean1, paramBoolean2, paramBoolean3);
      return;
      localObject = (TextView)this.jZ.get();
    } while (localObject == null);
    a((TextView)localObject, this.ka, paramDrawable, paramBoolean1, paramBoolean2);
  }
  
  private void a(ImageView paramImageView, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((!paramBoolean2) && (!paramBoolean3)) {}
    for (int i = 1; (i != 0) && ((paramImageView instanceof da)); i = 0)
    {
      int j = ((da)paramImageView).aU();
      if ((this.jU == 0) || (j != this.jU)) {
        break;
      }
      return;
    }
    paramBoolean1 = a(paramBoolean1, paramBoolean2);
    if (paramBoolean1) {
      paramDrawable = a(paramImageView.getDrawable(), paramDrawable);
    }
    for (;;)
    {
      paramImageView.setImageDrawable(paramDrawable);
      da localda;
      if ((paramImageView instanceof da))
      {
        localda = (da)paramImageView;
        if (!paramBoolean3) {
          break label149;
        }
        paramImageView = this.jS.uri;
        label110:
        localda.d(paramImageView);
        if (i == 0) {
          break label154;
        }
      }
      label149:
      label154:
      for (i = this.jU;; i = 0)
      {
        localda.w(i);
        if (!paramBoolean1) {
          break;
        }
        ((cz)paramDrawable).startTransition(250);
        return;
        paramImageView = null;
        break label110;
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt, Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramBoolean1 = a(paramBoolean1, paramBoolean2);
    Object localObject;
    Drawable localDrawable1;
    if (ek.bO())
    {
      localObject = paramTextView.getCompoundDrawablesRelative();
      localDrawable1 = localObject[paramInt];
      if (!paramBoolean1) {
        break label166;
      }
      paramDrawable = a(localDrawable1, paramDrawable);
    }
    label48:
    label56:
    label64:
    label72:
    label124:
    label133:
    label142:
    label151:
    label166:
    for (;;)
    {
      Drawable localDrawable2;
      Drawable localDrawable3;
      if (paramInt == 0)
      {
        localDrawable1 = paramDrawable;
        if (paramInt != 1) {
          break label124;
        }
        localDrawable2 = paramDrawable;
        if (paramInt != 2) {
          break label133;
        }
        localDrawable3 = paramDrawable;
        if (paramInt != 3) {
          break label142;
        }
        localObject = paramDrawable;
        if (!ek.bO()) {
          break label151;
        }
        paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(localDrawable1, localDrawable2, localDrawable3, (Drawable)localObject);
      }
      for (;;)
      {
        if (paramBoolean1) {
          ((cz)paramDrawable).startTransition(250);
        }
        return;
        localObject = paramTextView.getCompoundDrawables();
        break;
        localDrawable1 = localObject[0];
        break label48;
        localDrawable2 = localObject[1];
        break label56;
        localDrawable3 = localObject[2];
        break label64;
        localObject = localObject[3];
        break label72;
        paramTextView.setCompoundDrawablesWithIntrinsicBounds(localDrawable1, localDrawable2, localDrawable3, (Drawable)localObject);
      }
    }
  }
  
  private boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (this.kb) && (!paramBoolean2) && ((!paramBoolean1) || (this.kc));
  }
  
  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    db.c(paramBitmap);
    a(new BitmapDrawable(paramContext.getResources(), paramBitmap), paramBoolean, false, true);
  }
  
  public void a(ImageView paramImageView)
  {
    db.c(paramImageView);
    this.jX = null;
    this.jY = new WeakReference(paramImageView);
    this.jZ = null;
    this.ka = -1;
    this.jV = 2;
    this.jW = paramImageView.hashCode();
  }
  
  public void a(ImageManager.OnImageLoadedListener paramOnImageLoadedListener)
  {
    db.c(paramOnImageLoadedListener);
    this.jX = new WeakReference(paramOnImageLoadedListener);
    this.jY = null;
    this.jZ = null;
    this.ka = -1;
    this.jV = 1;
    this.jW = dl.hashCode(new Object[] { paramOnImageLoadedListener, this.jS });
  }
  
  void b(Context paramContext, boolean paramBoolean)
  {
    Drawable localDrawable = null;
    if (this.jU != 0) {
      localDrawable = paramContext.getResources().getDrawable(this.jU);
    }
    a(localDrawable, paramBoolean, false, false);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if (!(paramObject instanceof a)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (this == paramObject);
      bool1 = bool2;
    } while (((a)paramObject).hashCode() == hashCode());
    return false;
  }
  
  public int hashCode()
  {
    return this.jW;
  }
  
  void r(Context paramContext)
  {
    Drawable localDrawable = null;
    if (this.jT != 0) {
      localDrawable = paramContext.getResources().getDrawable(this.jT);
    }
    a(localDrawable, false, true, false);
  }
  
  public void v(int paramInt)
  {
    this.jU = paramInt;
  }
  
  public static final class a
  {
    public final Uri uri;
    
    public a(Uri paramUri)
    {
      this.uri = paramUri;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool2 = true;
      boolean bool1;
      if (!(paramObject instanceof a)) {
        bool1 = false;
      }
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (this == paramObject);
        bool1 = bool2;
      } while (((a)paramObject).hashCode() == hashCode());
      return false;
    }
    
    public int hashCode()
    {
      return dl.hashCode(new Object[] { this.uri });
    }
  }
}


/* Location:              C:\Users\shivane\Decompilation\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\images\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */