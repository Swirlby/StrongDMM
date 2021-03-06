package strongdmm.util.imgui

import imgui.ImGui
import strongdmm.window.AppWindow

object WindowUtil {
    fun getHeightPercent(percents: Int): Float {
        return AppWindow.windowHeight / 100f * percents
    }

    fun setNextSize(windowWidth: Float, windowHeight: Float) {
        ImGui.setNextWindowSize(windowWidth, windowHeight, AppWindow.defaultWindowCond)
    }

    fun setNextPosAndSize(x: Float, y: Float, windowWidth: Float, windowHeight: Float) {
        ImGui.setNextWindowPos(x, y, AppWindow.defaultWindowCond)
        ImGui.setNextWindowSize(windowWidth, windowHeight, AppWindow.defaultWindowCond)
    }

    fun setNextPosAndSizeCentered(windowWidth: Float, windowHeight: Float) {
        ImGui.setNextWindowPos((AppWindow.windowWidth - windowWidth) / 2, (AppWindow.windowHeight - windowHeight) / 2, AppWindow.defaultWindowCond)
        ImGui.setNextWindowSize(windowWidth, windowHeight, AppWindow.defaultWindowCond)
    }
}
