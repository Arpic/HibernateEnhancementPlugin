package ch.namlin.hibernateenhancement

import com.intellij.compiler.server.BuildProcessParametersProvider
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.OrderEnumerator

class BuildClasspathProvider(private val project: Project) : BuildProcessParametersProvider() {

    override fun getClassPath(): MutableIterable<String> {

        return OrderEnumerator.orderEntries(project).librariesOnly().pathsList.pathList
    }
}
