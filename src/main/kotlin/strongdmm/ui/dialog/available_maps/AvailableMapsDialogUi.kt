package strongdmm.ui.dialog.available_maps

import strongdmm.Processable
import strongdmm.Ui

class AvailableMapsDialogUi : Ui, Processable {
    private val state = State()
    private val view = View(state)
    private val viewController = ViewController(state)
    private val eventController = EventController(state)

    init {
        view.viewController = viewController
    }

    override fun process() {
        view.process()
    }
}
