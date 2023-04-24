package com.code.findapark

import com.code.findapark.databinding.SearchParkFragmentBinding
import android.view.LayoutInflater
import android.view.ViewGroup

class SearchParkFragment : com.code.baseline.BaseFragment<SearchParkFragmentBinding>() {

//    private var _binding: SearchParkFragmentBinding? = null
//    private val binding get() = checkNotNull(_binding)
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        _binding = SearchParkFragmentBinding.inflate(inflater, container, false)
//        return binding.root
//    }

    override fun setupViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): SearchParkFragmentBinding {
        return SearchParkFragmentBinding.inflate(inflater, container, false)
    }
}