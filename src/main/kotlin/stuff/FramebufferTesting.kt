package stuff

import org.lwjgl.glfw.GLFW.*
import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11.*
import org.lwjgl.system.MemoryUtil.NULL

fun main() {
    glfwInit()
    val window = glfwCreateWindow(600, 500, "Framebuffer testing", NULL, NULL)

    glfwMakeContextCurrent(window)
    GL.createCapabilities()

    while (!glfwWindowShouldClose(window)) {
        glfwPollEvents()

        // Render block
        run {
            glClearColor(1f, 1f, 0f, 1f)
            glClear(GL_COLOR_BUFFER_BIT)
            glfwSwapBuffers(window)
        }
        Thread.sleep(50)
    }

    glfwDestroyWindow(window)
    GL.destroy()
}
