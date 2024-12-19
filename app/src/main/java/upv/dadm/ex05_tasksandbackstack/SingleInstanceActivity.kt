/*
 * Copyright (c) 2022-2024 Universitat Politècnica de València
 * Authors: David de Andrés and Juan Carlos Ruiz
 *          Fault-Tolerant Systems
 *          Instituto ITACA
 *          Universitat Politècnica de València
 *
 * Distributed under MIT license
 * (See accompanying file LICENSE.txt)
 */

package upv.dadm.ex05_tasksandbackstack

/**
 * CoreActivity with launchMode = "singleInstance" and
 * taskAffinity="upv.dadm.ex05_tasksandbackstack.single_instance" in the Manifest.
 * A new instance of SingleInstanceActivity is created at the root of a new task or
 * onNewIntent() is called for one already existing in a task with the same affinity.
 * No new activities are launched into the task holding this instance.
 */
class SingleInstanceActivity : CoreActivity()