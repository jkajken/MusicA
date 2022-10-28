package com.example.musica

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.musica.databinding.SongItemBinding

class SongAdapter(
    val songList: List<Songs>,
    val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    inner class SongViewHolder(private val binding: SongItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
            val item = songList[adapterPosition]
            binding.songNameTV.text = item.name
            binding.artistNameTv.text = item.artist
            binding.songTimeTv.text = item.minute
            binding.musicPosNumberTv.text = item.numberOfSong

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        return SongViewHolder(
            SongItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        holder.bind()

    }

    override fun getItemCount() = songList.size
}