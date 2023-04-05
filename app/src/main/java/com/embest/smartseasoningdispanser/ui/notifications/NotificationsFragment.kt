package com.embest.smartseasoningdispanser.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.embest.smartseasoningdispanser.databinding.FragmentNotificationsBinding
import com.embest.smartseasoningdispanser.ui.WebActivity

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    var total1: Int = 0 // 씨리얼 총량 gram*input
    var total2 = 0 // 오트밀 총량
    var contents1 : Int = 0
    var contents2 : Int = 0
    var contents3 : Int = 0
    var contents4 : Int = 0

    //....

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val editText1 = binding.contents1
        editText1.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                try {
                    contents1 = char.toString().toInt() * 60
                    Toast.makeText(requireContext(), contents1.toString(), Toast.LENGTH_SHORT)
                        .show()

                } catch (e: Exception) {
                    contents1 = 0
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        val editText2 = binding.contents2
        editText2.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                try {
                    contents2 = char.toString().toInt() * 60
                    Toast.makeText(requireContext(), contents2.toString(), Toast.LENGTH_SHORT)
                        .show()

                } catch (e: Exception) {
                    contents2 = 0
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        val editText3 = binding.contents3
        editText3.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                try {
                    contents3 = char.toString().toInt() * 60
                    Toast.makeText(requireContext(), contents3.toString(), Toast.LENGTH_SHORT)
                        .show()

                } catch (e: Exception) {
                    contents3 = 0
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        val editText4 = binding.contents4
        editText4.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                try {
                    contents4 = char.toString().toInt() * 60
                    Toast.makeText(requireContext(), contents4.toString(), Toast.LENGTH_SHORT)
                        .show()

                } catch (e: Exception) {
                    contents4 = 0
                }
            }

            override fun afterTextChanged(p0: Editable?) {}
        })

        binding.button.setOnClickListener {
            // 웹페이지를 띄워준다
            val intent = Intent(requireContext(), WebActivity::class.java)
            intent.putExtra("contents1", contents1) //"Map" - key, value
            intent.putExtra("contents2", contents2)
            intent.putExtra("contents3", contents3)
            intent.putExtra("contents4", contents4)
            startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}