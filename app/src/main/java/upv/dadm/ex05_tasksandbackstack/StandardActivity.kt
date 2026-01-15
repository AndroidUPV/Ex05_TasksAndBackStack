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
 * CoreActivity with launchMode = "standard" and
 * taskAffinity="upv.dadm.ex05_tasksandbackstack.standard" in the Manifest.
 * A new instance of StandardActivity is created in the target task.
 */
class StandardActivity : CoreActivity()