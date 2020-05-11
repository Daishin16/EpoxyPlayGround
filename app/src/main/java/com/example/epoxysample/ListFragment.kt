package com.example.epoxysample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.epoxysample.databinding.FragmentEpoxyBinding

class ListFragment : Fragment(R.layout.fragment_epoxy) {
    lateinit var binding: FragmentEpoxyBinding
    lateinit var controller: MainController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentEpoxyBinding.bind(view)
        binding.lifecycleOwner = viewLifecycleOwner

        controller = MainController()

        binding.recyclerView.also {
            it.setController(controller)
        }

        val contents = listOf(
            SampleModel("header1", listOf("item1","item2")),
            SampleModel("header2", listOf("item3","item4"))
        )

        controller.setData(contents)
    }

}