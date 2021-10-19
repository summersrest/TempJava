package com.github.summersrest.tempjava.services

import com.intellij.openapi.project.Project
import com.github.summersrest.tempjava.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
