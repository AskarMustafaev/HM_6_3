package com.example.HM_6_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.HM_6_3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var list = arrayListOf<Album>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = AlbumAdapter(list,this::onClick)
        binding.rvArtistAlbum.adapter=adapter
    }
    private fun onClick(position:Int){
       requireActivity().supportFragmentManager.beginTransaction()
           .replace(R.id.container, SongsFragment())
           .addToBackStack(null).commit()
    }

    private fun loadData() {
        list.clear()
        list.add(Album(1, "Rare", "Selena Gomez", "2020"))
        list.add(Album(2, "2004", "Скриптонит", "2020"))
        list.add(Album(4,"Малиновый Рассвет","Эндшпиль","2019"))
        list.add(Album(5,"Животные","Скриптонит","2022"))
        list.add(Album(5,"Животные","Скриптонит","2021"))
        list.add(Album(6,"Stan","Lo fi","2020"))
        list.add(Album(7,"Sunflower","Post Malone","2015"))
        list.add(Album(7,"Sunflower","Post Malone","2016"))
        list.add(Album(8,"Район24","Ulukmanapo","2023"))
        list.add(Album(9,"Свобода","Эндшпиль","2021"))
        list.add(Album(3, "After Hours", "The Weeknd", "2020"))
        list.add(Album(4, "Код доступа 996", "Ulukmanapo", "2020"))
        list.add(Album(5, "Hajime, Pt.3", "MiyaGi & Эндшпиль", "2018"))
        list.add(Album(6, "Curtain Call", "Eminem", "2005"))
    }

}