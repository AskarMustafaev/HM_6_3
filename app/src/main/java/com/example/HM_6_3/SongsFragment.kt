package com.example.HM_6_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.HM_6_3.databinding.FragmentSongsBinding

class SongsFragment : Fragment() {
    private lateinit var binding:FragmentSongsBinding
    private var list= arrayListOf<Song>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter=SongAdapter(list)
        binding.rvSongs.adapter=adapter
    }

    private fun loadData() {
        list.clear()
        list.add(Song(1,"Never Mind","Nezlobin","2:51"))
        list.add(Song(1,"Never Mind","Nezlobin","2:51"))
        list.add(Song(2,"Intro","The xx","2:08"))
        list.add(Song(3,"Новый мерин","Моргенштерн","3:20"))
        list.add(Song(3,"Новый мерин","Моргенштерн","3:20"))
        list.add(Song(4,"Малиновый Рассвет","Эндшпиль","2:56"))
        list.add(Song(5,"Животные","Скриптонит","3:36"))
        list.add(Song(5,"Животные","Скриптонит","3:36"))
        list.add(Song(6,"Stan","Lo fi","3:10"))
        list.add(Song(7,"Sunflower","Post Malone","2:40"))
        list.add(Song(7,"Sunflower","Post Malone","2:40"))
        list.add(Song(8,"Район24","Ulukmanapo","3:00"))
        list.add(Song(9,"Свобода","Эндшпиль","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))
        list.add(Song(10,"Кукушка","Полина Гагарина","3:56"))

    }


}