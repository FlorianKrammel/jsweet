package def.dom;

@jsweet.lang.Extends({SVGFilterPrimitiveStandardAttributes.class})
public class SVGFEMorphologyElement extends SVGElement {
    public SVGAnimatedString in1;
    public SVGAnimatedEnumeration operator;
    public SVGAnimatedNumber radiusX;
    public SVGAnimatedNumber radiusY;
    public double SVG_MORPHOLOGY_OPERATOR_DILATE;
    public double SVG_MORPHOLOGY_OPERATOR_ERODE;
    public double SVG_MORPHOLOGY_OPERATOR_UNKNOWN;
    native public void addEventListener(java.lang.String type, EventListener listener, java.lang.Boolean useCapture);
    public static SVGFEMorphologyElement prototype;
    public SVGFEMorphologyElement(){}
    public SVGAnimatedLength height;
    public SVGAnimatedString result;
    public SVGAnimatedLength width;
    public SVGAnimatedLength x;
    public SVGAnimatedLength y;
    native public void addEventListener(java.lang.String type, EventListener listener);
    native public void addEventListener(java.lang.String type, EventListenerObject listener, java.lang.Boolean useCapture);
    native public void addEventListener(java.lang.String type, EventListenerObject listener);
}

