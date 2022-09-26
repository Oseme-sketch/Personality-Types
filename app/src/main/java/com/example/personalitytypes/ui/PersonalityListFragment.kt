package com.example.personalitytypes.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.personalitytypes.adapter.PersonalityAdapter
import com.example.personalitytypes.databinding.FragmentPersonalityListBinding
import com.example.personalitytypes.model.PersonalityViewModel

/**
 * The second destination in the navigation of SlidingPaneLayout in fragment_category_list.xml.
 */
class PersonalityListFragment : Fragment() {
    private val sharedViewModel: PersonalityViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentPersonalityListBinding.inflate(inflater, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentPersonalityListBinding.bind(view)

        // Attach an observer on the currentPersonalities to update the UI automatically
        // when the data changes.
        sharedViewModel.currentPersonalities.observe(
            this.viewLifecycleOwner,
            Observer {
                val adapter = PersonalityAdapter(it)
                binding.recyclerViewPersonality.adapter = adapter
                binding.recyclerViewPersonality.setHasFixedSize(true)
            }
        )
    }
}
