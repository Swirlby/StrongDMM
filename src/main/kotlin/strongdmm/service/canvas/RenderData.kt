package strongdmm.service.canvas

/**
 * Class to store render specific variables, like view translation and scale state.
 */
class RenderData(val mapId: Int) {
    var viewScale: Double = 1.0
    var scaleCount: Int = 5
    var viewTranslateX: Double = 0.0
    var viewTranslateY: Double = 0.0
}
