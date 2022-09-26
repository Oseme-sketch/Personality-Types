package com.example.personalitytypes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.personalitytypes.R
import com.example.personalitytypes.model.Personality

/**
 * Adapter for [RecyclerView] in PersonalityListFragment. Displays [Personality] data object.
 */
class PersonalityAdapter(
    private val dataset: List<Personality>
) : RecyclerView.Adapter<PersonalityAdapter.PersonalityViewHolder>() {
    private lateinit var context: Context

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonalityViewHolder {
        context = parent.context
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.personality_list_item, parent, false)
        return PersonalityViewHolder(adapterLayout)
    }

    /**
     * Get the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: PersonalityViewHolder, position: Int) {
        val personality = dataset[position]
        val separator = ", "
        holder.personalityNameView.text = personality.name
        holder.personalitySociotypeView.text = context.getString(R.string.sociotype)
        holder.personalitySociotypeValueView.text = personality.sociotype
        holder.personalityDescriptionView.text = context.getString(R.string.description)
        holder.personalityDescriptionValueView.text =
            personality.description.joinToString(separator)
        holder.personalityCompatibleView.text = context.getString(R.string.compatible_types)
        holder.personalityCompatibleValueView.text =
            personality.compatibleTypes.joinToString(separator)
    }

    /**
     * Return the size of the dataset (invoked by the layout manager)
     */
    override fun getItemCount() = dataset.size

    /**
     * Provide a reference to the views for the features of each [Personality]
     */
    class PersonalityViewHolder(
        view: View
    ) : RecyclerView.ViewHolder(view) {
        val personalityNameView: TextView =
            view.findViewById(R.id.personality_name)
        val personalitySociotypeView: TextView =
            view.findViewById(R.id.personality_sociotype)
        val personalitySociotypeValueView: TextView =
            view.findViewById(R.id.personality_sociotype_value)
        val personalityDescriptionView: TextView =
            view.findViewById(R.id.personality_description)
        val personalityDescriptionValueView: TextView =
            view.findViewById(R.id.personality_description_value)
        val personalityCompatibleView: TextView =
            view.findViewById(R.id.personality_compatible)
        val personalityCompatibleValueView: TextView =
            view.findViewById(R.id.personality_compatible_value)
    }
}
