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
 * CoreActivity with Intent flag = Intent.FLAG_ACTIVITY_SINGLE_TOP.
 * A new instance of FlagSingleTopActivity is created in the target task or
 * onNewIntent() is called for one already existing at the top of the target task.
 */
class FlagSingleTopActivity : CoreActivity()