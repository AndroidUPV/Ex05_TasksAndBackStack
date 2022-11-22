/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex05_tasksandbackstack

/**
 * CoreActivity with Intent flag = Intent.FLAG_ACTIVITY_CLEAR_TOP.
 * A new instance of FlagClearTopActivity is created in the current task, except if it is already
 * running in the current task, which calls onNewIntent() and destroys all activities above it.
 * If Intent.FLAG_ACTIVITY_SINGLE_TOP is not set, then the activity is finished and recreated.
 */
class FlagClearTopActivity : CoreActivity()