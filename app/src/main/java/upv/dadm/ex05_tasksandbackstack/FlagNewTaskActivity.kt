/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex05_tasksandbackstack

/**
 * CoreActivity with Intent flag = Intent.FLAG_ACTIVITY_NEW_TASK.
 * A new instance of FlagNewTaskActivity is created at the root of a new task or
 * onNewIntent() is called for an already existing instance in a  task with the same affinity.
 */
class FlagNewTaskActivity : CoreActivity()