package com.anishdubey.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.anishdubey.affirmations.adapter.ItemAdapter
import com.anishdubey.affirmations.data.Datasource
import com.anishdubey.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recyclerView
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        // initialize data
        val dataSet = Datasource().listOfAffirmation()
        // set Adapter
        binding.recyclerView.adapter = ItemAdapter(this@MainActivity,dataSet)
        binding.recyclerView.layoutManager = GridLayoutManager(this,2)
        //binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
    }
}