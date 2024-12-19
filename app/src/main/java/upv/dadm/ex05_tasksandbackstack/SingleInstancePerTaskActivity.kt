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
 * CoreActivity with launchMode = "singleInstancePerTask" and
 * taskAffinity="upv.dadm.ex05_tasksandbackstack.single_instance_per_task" in the Manifest and
 * with FLAG_ACTIVITY_MULTIPLE_TASK set in the Intent.
 * SingleTaskActivity can only be running as the root activity of a task and thus
 * there can only be a single instance of this activity in a task.
 * Multiple instances can be created in different tasks if the Intent flags
 * FLAG_ACTIVITY_MULTIPLE_TASK or FLAG_ACTIVITY_NEW_DOCUMENT are set.
 */
class SingleInstancePerTaskActivity : CoreActivity()