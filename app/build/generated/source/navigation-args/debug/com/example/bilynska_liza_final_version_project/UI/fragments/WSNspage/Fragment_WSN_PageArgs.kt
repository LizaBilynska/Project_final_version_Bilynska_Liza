package com.example.bilynska_liza_final_version_project.UI.fragments.WSNspage

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.bilynska_liza_final_version_project.`data`.models.WSN
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class Fragment_WSN_PageArgs(
  public val wsnNews: WSN
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(WSN::class.java)) {
      result.putParcelable("wsn_news", this.wsnNews as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(WSN::class.java)) {
      result.putSerializable("wsn_news", this.wsnNews as Serializable)
    } else {
      throw UnsupportedOperationException(WSN::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(WSN::class.java)) {
      result.set("wsn_news", this.wsnNews as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(WSN::class.java)) {
      result.set("wsn_news", this.wsnNews as Serializable)
    } else {
      throw UnsupportedOperationException(WSN::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): Fragment_WSN_PageArgs {
      bundle.setClassLoader(Fragment_WSN_PageArgs::class.java.classLoader)
      val __wsnNews : WSN?
      if (bundle.containsKey("wsn_news")) {
        if (Parcelable::class.java.isAssignableFrom(WSN::class.java) ||
            Serializable::class.java.isAssignableFrom(WSN::class.java)) {
          __wsnNews = bundle.get("wsn_news") as WSN?
        } else {
          throw UnsupportedOperationException(WSN::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__wsnNews == null) {
          throw IllegalArgumentException("Argument \"wsn_news\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"wsn_news\" is missing and does not have an android:defaultValue")
      }
      return Fragment_WSN_PageArgs(__wsnNews)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): Fragment_WSN_PageArgs {
      val __wsnNews : WSN?
      if (savedStateHandle.contains("wsn_news")) {
        if (Parcelable::class.java.isAssignableFrom(WSN::class.java) ||
            Serializable::class.java.isAssignableFrom(WSN::class.java)) {
          __wsnNews = savedStateHandle.get<WSN?>("wsn_news")
        } else {
          throw UnsupportedOperationException(WSN::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__wsnNews == null) {
          throw IllegalArgumentException("Argument \"wsn_news\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"wsn_news\" is missing and does not have an android:defaultValue")
      }
      return Fragment_WSN_PageArgs(__wsnNews)
    }
  }
}
