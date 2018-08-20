package com.denis.ellipsizeinrecyclerview

/**
 * Created by Denis Vlasov on 17/08/2018.
 */
object Utils {

    // sample events data
    fun getEvents(): List<UIEventModel> {
        return listOf(
                UIEventModel("DAVID GARRETT / ДЭВИД ГАРРЕТТ", "07/11/2018", "7000 \u20BD"),
                UIEventModel("IMAGINE DRAGONS / ВООБРАЗИ ДРАКОНОВ", "29/08/2018", "7500 \u20BD"),
                UIEventModel("LINKIN PARK / ЛИНКИН ПАРК", "07/11/2018", "7000 \u20BD")
        )
    }

    // get english name from model
    fun getEngArtistName(fullArtistName: String): String = fullArtistName.split('/')[0].trim()

    // get russian name from model
    fun getRusArtistName(fullArtistName: String): String = fullArtistName.split('/')[1].trim()

}