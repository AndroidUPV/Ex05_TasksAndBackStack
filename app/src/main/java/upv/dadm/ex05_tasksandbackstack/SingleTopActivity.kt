/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex05_tasksandbackstack

/**
 * CoreActivity with launchMode = "singleTop" and
 * taskAffinity="upv.dadm.ex05_tasksandbackstack.single_top" in the Manifest.
 * A new instance of SingleTopActivity is created in the target task or
 * onNewIntent() is called for one already exists at the top of the target task.
 */
class SingleTopActivity : CoreActivity()