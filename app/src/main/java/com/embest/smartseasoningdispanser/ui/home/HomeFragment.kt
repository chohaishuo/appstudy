package com.embest.smartseasoningdispanser.ui.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.embest.smartseasoningdispanser.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private var tall : CharSequence? = ""
    private var weight = 0

    // private, public

    // C lang : String weight = "Text"
    // kotlin lang: var weight: String = ""

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


        val editText = binding.editTextTextPersonName3
        editText.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //Toast.makeText(requireContext(), char.toString(), Toast.LENGTH_SHORT).show()
                tall = char

            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.button1.setOnClickListener {



            Toast.makeText(requireContext(), tall, Toast.LENGTH_SHORT).show()
        }


        binding.button2.setOnClickListener {



            Toast.makeText(requireContext(), tall, Toast.LENGTH_SHORT).show()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}