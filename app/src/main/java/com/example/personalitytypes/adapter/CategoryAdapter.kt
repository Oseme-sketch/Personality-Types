package com.example.personalitytypes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.personalitytypes.databinding.CategoryListItemBinding
import com.example.personalitytypes.model.Category

/**
 * Adapter for [RecyclerView] in CategoryListFragment. Displays [Category] data object.
 */
class CategoryAdapter(
    private val onItemClicked: (Category) -> Unit
) : ListAdapter<Category, CategoryAdapter.CategoryViewHolder>(DiffCallback) {

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryViewHolder {
        return CategoryViewHolder(
            CategoryListItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    /**
     * Get the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(
        holder: CategoryViewHolder,
        position: Int
    ) {
        val category = getItem(position)
        holder.itemView.setOnClickListener {
            onItemClicked(category)
        }
        holder.bind(category)
    }

    /**
     * Provide a reference to the views for the name and descriptions of each [Category]
     */
    class CategoryViewHolder(
        private var binding: CategoryListItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(category: Category) {
            binding.categoryName.text = category.name
            binding.categoryDescriptionOne.text = category.description[0]
            binding.categoryDescriptionTwo.text = category.description[1]
            binding.categoryDescriptionThree.text = category.description[2]
        }
    }

    companion object DiffCallback: DiffUtil.ItemCallback<Category>() {
        override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
            return oldItem.name == newItem.name
        }
    }
}
