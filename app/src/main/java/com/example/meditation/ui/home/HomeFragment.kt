package com.example.meditation.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.RecyclerView.State
import com.example.meditation.FeelRecycler
import com.example.meditation.MyFeel
import com.example.meditation.MyState
import com.example.meditation.R
import com.example.meditation.databinding.FragmentHomeBinding
import com.example.meditation.recadapters.StateRecycker

class HomeFragment : Fragment() {

    lateinit var firstname: TextView

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        firstname = root.findViewById(R.id.textView5)


        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(), MyFeel().list)

        val state_recucler : RecyclerView = root.findViewById(R.id.state_Rec)
        state_recucler.adapter = StateRecycker(requireContext(), MyState().state_list)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}