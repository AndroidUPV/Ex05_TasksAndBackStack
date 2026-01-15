/*
 * Copyright (c) 2022-2026 Universitat Politècnica de València
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
 * CoreActivity with launchMode = "singleTask" and
 * taskAffinity="upv.dadm.ex05_tasksandbackstack.single_task" in the Manifest.
 * A new instance of SingleTaskActivity is created at the root of a new task or
 * onNewIntent() is called for an already existing instance in a task with the same affinity.
 * All activities above it are destroyed.
 */
class SingleTaskActivity : CoreActivity()