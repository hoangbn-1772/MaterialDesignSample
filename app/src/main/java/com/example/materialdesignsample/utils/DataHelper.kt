package com.example.materialdesignsample.utils

import android.content.Context
import android.widget.Filter
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

class DataHelper {

    companion object {
        private val sColorWrappers: List<ColorWrapper> = ArrayList()

        private val sColorSuggestions = ArrayList<ColorsSuggestion>(
                listOf(ColorsSuggestion("green"),
                        ColorsSuggestion("blue"),
                        ColorsSuggestion("pink"),
                        ColorsSuggestion("purple"),
                        ColorsSuggestion("brown"),
                        ColorsSuggestion("gray"),
                        ColorsSuggestion("Granny Smith Apple"),
                        ColorsSuggestion("Indigo"),
                        ColorsSuggestion("Periwinkle"),
                        ColorsSuggestion("Mahogany"),
                        ColorsSuggestion("Maize"),
                        ColorsSuggestion("Mahogany"),
                        ColorsSuggestion("Outer Space"),
                        ColorsSuggestion("Melon"),
                        ColorsSuggestion("Yellow"),
                        ColorsSuggestion("Orange"),
                        ColorsSuggestion("Red"),
                        ColorsSuggestion("Orchid"))
        )

        fun getHistory(context: Context, count: Int): List<ColorsSuggestion> {
            val suggestions = ArrayList<ColorsSuggestion>()
            var colorsSuggestion = ColorsSuggestion()

            for (i in sColorSuggestions) {
                colorsSuggestion = i
                colorsSuggestion.mIsHistory = true
                suggestions.add(colorsSuggestion)
                if (suggestions.size == count) break
            }

            return suggestions
        }

        fun resetSuggestionsHistory() {
            for (colorSuggestion in sColorSuggestions) {
                colorSuggestion.mIsHistory = false
            }
        }

        fun findSuggestions(
                context: Context,
                query: String,
                limit: Int,
                simulatedDelay: Long,
                listener: OnFindSuggestionsListener?) {
            object : Filter() {
                override fun performFiltering(constraint: CharSequence?): FilterResults {
                    try {
                        Thread.sleep(simulatedDelay)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                    resetSuggestionsHistory()
                    val suggestions = ArrayList<ColorsSuggestion>()
                    if (!constraint.isNullOrEmpty()) {
                        for (suggestion in sColorSuggestions) {
                            if (suggestion.getBody().toUpperCase().startsWith(constraint.toString().toUpperCase())) {
                                suggestions.add(suggestion)
                                if (limit != -1 && suggestions.size == limit) {
                                    break
                                }
                            }
                        }
                    }
                    val results = FilterResults()
                    Collections.sort(suggestions, Comparator<ColorsSuggestion> { lhs, rhs ->
                        return@Comparator if (lhs.mIsHistory) -1 else 0
                    })
                    results.values = suggestions
                    results.count = suggestions.size

                    return results
                }

                override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                    listener?.onResults(results?.values as List<ColorsSuggestion>)
                }
            }.filter(query)
        }
    }

    interface OnFindColorsListener {
        fun onResults(results: List<ColorWrapper>)
    }

    interface OnFindSuggestionsListener {
        fun onResults(results: List<ColorsSuggestion>)
    }
}
