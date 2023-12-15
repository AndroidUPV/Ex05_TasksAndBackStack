/*
 * Copyright (c) 2022-2023 Universitat Politècnica de València
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
 * CoreActivity with launchMode = "singleTop" and
 * taskAffinity="upv.dadm.ex05_tasksandbackstack.single_top" in the Manifest.
 * A new instance of SingleTopActivity is created in the target task or
 * onNewIntent() is called for one already exists at the top of the target task.
 */
class SingleTopActivity : CoreActivity()