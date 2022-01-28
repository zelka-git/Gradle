package com.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class GreetingTask extends DefaultTask {

    @TaskAction
    void greet() {
        println getProject().getProperties().get('parent')
        println getProject().getGradle().getGradleVersion()
        println 'hello from GreetingTask from buildSrc'
    }
}