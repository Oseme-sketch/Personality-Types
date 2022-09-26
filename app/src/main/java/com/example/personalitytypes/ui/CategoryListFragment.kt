package com.example.personalitytypes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.slidingpanelayout.widget.SlidingPaneLayout
import com.example.personalitytypes.R
import com.example.personalitytypes.adapter.CategoryAdapter
import com.example.personalitytypes.databinding.FragmentCategoryListBinding
import com.example.personalitytypes.model.PersonalityViewModel

/**
 * The default destination in the navigation of SlidingPaneLayout in fragment_category_list.xml.
 */
class CategoryListFragment : Fragment() {
    private val sharedViewModel: PersonalityViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentCategoryListBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity()
            .findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
            .title = "Categories"

        val binding = FragmentCategoryListBinding.bind(view)
        val slidingPaneLayout = binding.slidingPaneLayout
        slidingPaneLayout.lockMode = SlidingPaneLayout.LOCK_MODE_LOCKED

        // Connect the SlidingPaneLayout to the system back button.
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            CategoryListOnBackPressedCallback(slidingPaneLayout)
        )

        // Initialize the adapter and set it to the RecyclerView.
        val adapter = CategoryAdapter {
            // Update the selected Category as the current Category in the sharedViewModel
            // This will automatically update the dual pane content
            sharedViewModel.updateCurrentCategory(it)
            binding.slidingPaneLayout.openPane()
        }

        binding.recyclerViewCategory.adapter = adapter
        adapter.submitList(sharedViewModel.categoryData)
    }
}

class CategoryListOnBackPressedCallback(
    private val slidingPaneLayout: SlidingPaneLayout
): OnBackPressedCallback(slidingPaneLayout.isSlideable && slidingPaneLayout.isOpen),
    SlidingPaneLayout.PanelSlideListener{

    init {
        slidingPaneLayout.addPanelSlideListener(this)
    }

    override fun handleOnBackPressed() {
        slidingPaneLayout.closePane()
    }

    override fun onPanelSlide(panel: View, slideOffset: Float) {
    }

    override fun onPanelOpened(panel: View) {
        isEnabled = true
    }

    override fun onPanelClosed(panel: View) {
        isEnabled = false
    }
}
