package com.example.bilynska_liza_final_version_project.UI.fragments.WSNlist

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.bilynska_liza_final_version_project.R
import com.example.bilynska_liza_final_version_project.`data`.models.WSN
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class Fragment_WallStreetNewsDirections private constructor() {
  private data class ActionFragmentWallStreetNewsToNewsPageFragment(
    public val wsnNews: WSN
  ) : NavDirections {
    public override val actionId: Int = R.id.action_fragment_WallStreetNews_to_newsPageFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionFragmentWallStreetNewsToNewsPageFragment(wsnNews: WSN): NavDirections =
        ActionFragmentWallStreetNewsToNewsPageFragment(wsnNews)
  }
}
