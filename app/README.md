# Ex05_TasksAndBackStack
Lecture 01 - Basics of Android Development:

Activities extending the CoreActivity can be launched with different launchModes and Intent flags.
- StandardActivity (launchMode = "standard"): A new instance is created in the current task.
- SingleTopActivity (launchMode = "singleTop"): A new instance is created in the current task except if it is already the top activity in the task, which calls onNewIntent() instead.
- SingleTaskActivity (launchMode = "singleTask"): If there is a task already running an instance of this activity, onNewIntent() is called. Otherwise, a new instance is created in a new task.
- SingleInstanceActivity (launchMode = "singleInstance"): Like SingleTaskActivity, but no other activities are launched into the task that holds this instance.
- SingleInstancePerTask (launchMode = "singleInstancePerTask" and Intent flag = Intent.FLAG_ACTIVITY_MULTIPLE_TASK or Intent.FLAG_ACTIVITY_NEW_DOCUMENT): A new instance is created in a new task.
- FlagNewTaskActivity (Intent flag = Intent.FLAG_ACTIVITY_NEW_TASK): Like SingleTaskActivity.
- FlagSingleTopActivity (Intent flag = Intent.FLAG_ACTIVITY_SINGLE_TOP): Like SingleTopActivity.
- FlagClearTopActivity (Intent flag = Intent.FLAG_ACTIVITY_CLEAR_TOP): A new instance is created in the current task, except if it is already running in the current task, which calls onNewIntent() and destroys all activities above it.