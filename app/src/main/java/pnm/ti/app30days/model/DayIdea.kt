package pnm.ti.app30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 *  @param title title describing motivational idea
 *  @param image an image representing the day's motivational idea
 *  @param reference a reference to the artist of the provided image
 *  @param description small description of the day's motivational idea
 */

data class DayIdea(
    @StringRes val title: Int,
    @DrawableRes val image: Int,
    @StringRes val reference: Int,
    @StringRes val description: Int
)