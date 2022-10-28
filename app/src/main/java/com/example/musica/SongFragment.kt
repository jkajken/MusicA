package com.example.musica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.musica.databinding.FragmentSongBinding


class SongFragment : Fragment() {
    private lateinit var binding: FragmentSongBinding
    private lateinit var dataFromPlaylistFragment: Songs


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromPlaylistFragment = arguments?.getSerializable("KEY") as Songs

        binding.SongTv.text = dataFromPlaylistFragment.name
        binding.artistTv.text = dataFromPlaylistFragment.artist
    }

}
