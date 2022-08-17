package com.test.sepiacosding.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.test.sepiacosding.R
import com.test.sepiacosding.databinding.FragmentDetaileBinding
import com.test.sepiacosding.viewmodel.FragmentListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetaileFragment : Fragment(R.layout.fragment_detaile) {

    private lateinit var binding: FragmentDetaileBinding
    private val viewModel: FragmentListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetaileBinding.bind(view)

    }


}