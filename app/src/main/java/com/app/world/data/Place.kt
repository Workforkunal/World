package com.app.world.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.app.world.R

data class Place(
    @StringRes val name: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val briefing: Int
)

val places = listOf(
    Place(R.string.world_name_1, R.drawable.amsterdam, R.string.world_description_1),
    Place(R.string.world_name_2, R.drawable.bali, R.string.world_description_2),
    Place(R.string.world_name_3, R.drawable.banff, R.string.world_description_3),
    Place(R.string.world_name_4, R.drawable.barcelona, R.string.world_description_4),
    Place(R.string.world_name_5, R.drawable.bora_bora, R.string.world_description_5),
    Place(R.string.world_name_6, R.drawable.british_island, R.string.world_description_6),
    Place(R.string.world_name_7, R.drawable.costa_rica, R.string.world_description_7),
    Place(R.string.world_name_8, R.drawable.dubai, R.string.world_description_8),
    Place(R.string.world_name_9, R.drawable.florence, R.string.world_description_9),
    Place(R.string.world_name_10, R.drawable.glacier_national_park, R.string.world_description_10),
    Place(R.string.world_name_11, R.drawable.grand_canyon, R.string.world_description_11),
    Place(R.string.world_name_12, R.drawable.great_barrier_reef, R.string.world_description_12),
    Place(R.string.world_name_13, R.drawable.london, R.string.world_description_13),
    Place(R.string.world_name_14, R.drawable.maldives, R.string.world_description_14),
    Place(R.string.world_name_15, R.drawable.maui, R.string.world_description_15),
    Place(R.string.world_name_16, R.drawable.new_york, R.string.world_description_16),
    Place(R.string.world_name_17, R.drawable.new_zealand, R.string.world_description_17),
    Place(R.string.world_name_18, R.drawable.paris, R.string.world_description_18),
    Place(R.string.world_name_19, R.drawable.phuket, R.string.world_description_19),
    Place(R.string.world_name_20, R.drawable.rio_de_janeiro, R.string.world_description_20),
    Place(R.string.world_name_21, R.drawable.rome, R.string.world_description_21),
    Place(R.string.world_name_22, R.drawable.santorini, R.string.world_description_22),
    Place(R.string.world_name_23, R.drawable.st__lucia, R.string.world_description_23),
    Place(R.string.world_name_24, R.drawable.swiss_alps, R.string.world_description_24),
    Place(R.string.world_name_25, R.drawable.sydney, R.string.world_description_25),
    Place(R.string.world_name_26, R.drawable.tahiti, R.string.world_description_26),
    Place(R.string.world_name_27, R.drawable.tasmania, R.string.world_description_27),
    Place(R.string.world_name_28, R.drawable.tokyo, R.string.world_description_28),
    Place(R.string.world_name_29, R.drawable.tulum, R.string.world_description_29),
    Place(R.string.world_name_30, R.drawable.turks___caicos, R.string.world_description_30)

)