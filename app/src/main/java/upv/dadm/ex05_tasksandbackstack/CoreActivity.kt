/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex05_tasksandbackstack

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import upv.dadm.ex05_tasksandbackstack.databinding.ActivityCoreBinding

// Constants for sending information to CoreActivity
const val LEVEL = "upv.dadm.ex05_tasksandbackstack.LEVEL"

/**
 * Displays the name of the active activity class and its level (number of previously launched activities).
 * Several buttons let the user launch activities extending CoreActivity with:
 * - launchMode: standard, singleTop, singleTask, singleInstance, or singleInstancePerTask.
 * - Intent flag: FLAG_ACTIVITY_NEW_TASK, FLAG_ACTIVITY_SINGLE_TOP, or FLAG_ACTIVITY_CLEAR_TOP.
 */
open class CoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Get the automatically generated view binding for the layout resource
        val binding = ActivityCoreBinding.inflate(layoutInflater)
        // Set the activity content to the root element of the generated view
        setContentView(binding.root)

        // Current level (default 0)
        val level = intent.getIntExtra(LEVEL, 0)

        // Display the activity class name and its level
        binding.tvCurrentLaunchMode.text =
            getString(R.string.launch_mode_and_level, localClassName, level)

        // Set OnClickListener for all Buttons

        // Launch activity with launchMode = "standard" defined in the Manifest
        binding.bLaunchModeStandard.setOnClickListener {
            launchActivity(
                StandardActivity::class.java,
                level + 1,
                0
            )
        }

        // Launch activity with launchMode = "singleTop" defined in the Manifest
        binding.bLaunchModeSingleTop.setOnClickListener {
            launchActivity(
                SingleTopActivity::class.java,
                level + 1,
                0
            )
        }

        // Launch activity with launchMode = "singleTask" defined in the Manifest
        binding.bLaunchModeSingleTask.setOnClickListener {
            launchActivity(
                SingleTaskActivity::class.java,
                level + 1,
                0
            )
        }

        // Launch activity with launchMode = "singleInstance" defined in the Manifest
        binding.bLaunchModeSingleInstance.setOnClickListener {
            launchActivity(
                SingleInstanceActivity::class.java,
                level + 1,
                0
            )
        }

        // Launch activity with launchMode = "singleInstancePerTask" defined in the Manifest and
        // with FLAG_ACTIVITY_MULTIPLE_TASK set in the Intent
        binding.bLaunchModeSingleInstancePerTask.setOnClickListener {
            launchActivity(
                SingleInstancePerTaskActivity::class.java,
                level + 1,
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK
            )
        }

        // Launch activity with FLAG_ACTIVITY_NEW_TASK set in the Intent
        binding.bFlagActivityNewTask.setOnClickListener {
            launchActivity(
                FlagNewTaskActivity::class.java,
                level + 1,
                Intent.FLAG_ACTIVITY_NEW_TASK
            )
        }

        // Launch activity with FLAG_ACTIVITY_SINGLE_TOP set in the Intent
        binding.bFlagActivitySingleTop.setOnClickListener {
            launchActivity(
                FlagSingleTopActivity::class.java,
                level + 1,
                Intent.FLAG_ACTIVITY_SINGLE_TOP
            )
        }

        // Launch activity with FLAG_ACTIVITY_CLEAR_TOP set in the Intent
        binding.bFlagActivityClearTop.setOnClickListener {
            launchActivity(
                FlagClearTopActivity::class.java,
                level + 1,
                Intent.FLAG_ACTIVITY_CLEAR_TOP
            )
        }
    }

    // Starts the selected activity with a given level and flag in the Intent
    private fun launchActivity(
        activity: Class<out CoreActivity>,
        level: Int,
        flag: Int
    ) {
        startActivity(
            Intent(this@CoreActivity, activity)
                .setFlags(flag)
                .putExtra(LEVEL, level)
        )
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(
            this@CoreActivity,
            getString(R.string.new_intent, localClassName),
            Toast.LENGTH_SHORT
        ).show()
    }
}