package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun mapToPictures(view: View) {

        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> findViewById<ImageView>(R.id.image_id).setImageResource(R.drawable.jazz_music)
            R.id.box_two_text -> findViewById<ImageView>(R.id.image_id).setImageResource(R.drawable.pop_music)
            R.id.box_three_text -> findViewById<ImageView>(R.id.image_id).setImageResource(R.drawable.jazz_music)
            R.id.box_four_text -> findViewById<ImageView>(R.id.image_id).setImageResource(R.drawable.pop_music)
            R.id.box_five_text -> findViewById<ImageView>(R.id.image_id).setImageResource(R.drawable.jazz_music)
            else -> findViewById<ImageView>(R.id.image_id).setImageResource(R.drawable.pop_music)
        }
    }


    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootRelativeLayout = findViewById<View>(R.id.relative_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootRelativeLayout)

        for (item in clickableViews) {
            item.setOnClickListener { mapToPictures(it) }
        }
    }
}
