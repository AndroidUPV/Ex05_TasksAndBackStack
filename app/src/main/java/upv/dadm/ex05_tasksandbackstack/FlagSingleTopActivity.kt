/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex05_tasksandbackstack

/**
 * CoreActivity with Intent flag = Intent.FLAG_ACTIVITY_SINGLE_TOP.
 * A new instance of FlagSingleTopActivity is created in the target task or
 * onNewIntent() is called for one already exists at the top of the target task.
 */
class FlagSingleTopActivity : CoreActivity()