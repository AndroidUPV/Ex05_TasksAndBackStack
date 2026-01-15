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
 * CoreActivity with Intent flag = Intent.FLAG_ACTIVITY_NEW_TASK.
 * A new instance of FlagNewTaskActivity is created at the root of a new task or
 * the task already holding it goes to foreground in its current state.
 */
class FlagNewTaskActivity : CoreActivity()