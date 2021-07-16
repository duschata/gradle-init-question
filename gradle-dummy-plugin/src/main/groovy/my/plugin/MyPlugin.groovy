/*
 * Copyright (c) by GiP GmbH
 */

package my.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {

    private Project project

    void apply(Project project) {
        this.project = project


        project.extensions.create('myExtension', MyExtension)

    }
}