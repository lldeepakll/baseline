package com.code.baseline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<ViewBindingGen : ViewBinding> : Fragment() {

    private var _binding: ViewBindingGen? = null
    private val binding get() = checkNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = setupViewBinding(inflater, container)
        return binding.root
    }

    abstract fun setupViewBinding(
        inflater: LayoutInflater, container: ViewGroup?,
    ): ViewBindingGen

}