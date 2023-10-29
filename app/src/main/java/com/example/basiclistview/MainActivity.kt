package com.example.basiclistview

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import com.example.basiclistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList: ArrayList<User>
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)
        val imageId = intArrayOf(
            R.drawable.cat3,
            R.drawable.cat4,
            R.drawable.kid,
            R.drawable.icon,
            R.drawable.cat2,
            R.drawable.cat4,
            R.drawable.cat1,
            R.drawable.cat2
        )
        val name = arrayOf(
            "The fat cat",
            "Hai san",
            "Giang chan",
            "Tuan sama",
            "bruh boy",
            "gigachad",
            "The fat dog",
            "cat"
        )
        val lastMessage = arrayOf(
            "hey brother",
            "nice to meet you",
            "hello ",
            "hiiii",
            "omae ha moushindeiru",
            "bruh",
            "Lmao",
            "i am cat"
        )
        val lastMsgtime = arrayOf(
            "3:00 AM",
            "3:00 PM",
            "6:35 PM",
            "2:10 PM",
            "2:30 AM",
            "11:15 AM",
            "13: 00 AM",
            "6:45 AM"
        )
        val phoneNo = arrayOf(
            "0123456", "0123456", "0123456", "0123456", "0123456", "0123456","0123456","0123456"
        )
        val country = arrayOf(
            "VN",
            "VN",
            "VN",
            "KR",
            "KR",
            "KR",
            "KR",
            "KR",
        )
        userArrayList = ArrayList()
        for (i in name.indices) {
            val user =
                User(name[i], lastMessage[i], lastMsgtime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }
        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, userArrayList)
//        binding.listview.setOnItemClickListener{ parent, view, position, id ->
//            val name =name[position]
//            val phone =phoneNo[position]
//            val country = country[position]
//            val imageId = imageId[position]
//            val i = Intent(this, UserActivity::class.java)
////            i.putExtra()
//        }
    }
}