package com.example.musica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.musica.databinding.FragmentPlaylistBinding


class PlaylistFragment : Fragment() {
    private lateinit var binding: FragmentPlaylistBinding
    private var songList = arrayListOf<Songs>()
    private var fragment: SongFragment = SongFragment()
    private var bundle = Bundle()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaylistBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val songAdapter = SongAdapter(songList, this::onClick)
        binding.SongRecyclerView.adapter = songAdapter
    }

    private fun loadData() {
        songList.add(Songs("Missing You", "2NE1", "3:39", "1"))
        songList.add(Songs("High Hopes", "Dennis van Aarssen", "2:52", "2"))
        songList.add(Songs("Let`s fall in love", "FINNEAS", "3:57", "3"))
        songList.add(Songs("I Won`t Dance", "Oscar Peterson", "3:06", "4"))
        songList.add(Songs("In The Mood", "Swing City", "2:54", "5"))
        songList.add(Songs("Butterfly", "J.una", "3:14", "6"))
        songList.add(Songs("Shelter", "FINNEAS", "3:07", "7"))
        songList.add(Songs("Hotel", "Claire Rosinkranz", "2:14", "8"))
        songList.add(Songs("Until I Found You", "Stephen Sanchez", "2:57", "9"))
        songList.add(Songs("Pink Venom", "BlackPink", "3:06", "10"))
        songList.add(Songs("We Go Up", "NCT DREAM", "3:03", "11"))
        songList.add(Songs("Goodbye", "2NE1", "3:51", "12"))
        songList.add(Songs("JAVA", "Aleksei", "1:01", "13"))
        songList.add(Songs("Kotlin", "Ray Qiwi", "3:03", "14"))
        songList.add(Songs("Going Crazy", "Treasure", "3:44", "15"))
        songList.add(Songs("Pirate", "Everglow", "3:30", "16"))
        songList.add(Songs("odoriko", "Vaundy", "3:50", "17"))
        songList.add(Songs("Love Me Like That", "Sam Kim", "3:31", "18"))
        songList.add(Songs("Some Days", "Stella Jang", "3:20", "19"))
        songList.add(Songs("1,2,3", "Jason Derulo", "3:21", "20"))
        songList.add(Songs("Light Switch", "Harry Styles", "3:06", "21"))

    }

    private fun onClick(position: Int) {
        bundle.putSerializable("KEY", songList[position])
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.Container, fragment).addToBackStack(null).commit()

    }
}