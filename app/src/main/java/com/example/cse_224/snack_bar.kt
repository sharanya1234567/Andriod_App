package com.example.cse_224

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class snack_bar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enables edge-to-edge UI mode
        setContentView(R.layout.activity_snack_bar)

        // Find the button in the layout
        val btn = findViewById<Button>(R.id.button)

        // Set an OnClickListener for the button to show the Snackbar\
        btn.setOnClickListener { view ->
            // Create a Snackbar instance with a message and an undo action
            val snackbar = Snackbar.make(view, "Email sent", Snackbar.LENGTH_LONG)
                .setAction("UNDO") {
                    // Action when the "UNDO" button is clicked (if needed)
                    // Add your undo logic here
                }

            // Add a callback to handle swipe dismiss and other events
            snackbar.addCallback(object : Snackbar.Callback() {
                override fun onDismissed(transientBottomBar: Snackbar?, event: Int) {
                    when (event) {
                        DISMISS_EVENT_SWIPE -> {
                            // Snackbar was swiped away
                            // You can add additional logic here
                            // Example: Logging the event or showing a message
                            println("Snackbar dismissed by swipe!")
                        }
                        DISMISS_EVENT_ACTION -> {
                            // Handle the case where the action button was clicked
                            println("Snackbar action button clicked!")
                        }
                        DISMISS_EVENT_TIMEOUT -> {
                            // Handle case where Snackbar automatically disappears after the set time
                            println("Snackbar timed out.")
                        }
                    }
                }

                override fun onShown(sb: Snackbar?) {
                    // Snackbar is shown
                    println("Snackbar is shown.")
                }
            })

            // Show the Snackbar
            snackbar.show()
        }
    }
}
