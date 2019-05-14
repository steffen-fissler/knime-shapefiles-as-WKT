package ch.res_ear.samthiriot.knime.shapefilesAsWKT.properties.globalboundingbox;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;

/**
 * This is an example implementation of the node dialog of the
 * "SpatialPropertySurface" node.
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more
 * complex dialog please derive directly from
 * {@link org.knime.core.node.NodeDialogPane}. In general, one can create an
 * arbitrary complex dialog using Java Swing.
 * 
 * @author Samuel Thiriot
 */
public class GlobalBoundingBoxNodeDialog extends DefaultNodeSettingsPane {

	/**
	 * New dialog pane for configuring the node. The dialog created here
	 * will show up when double clicking on a node in KNIME Analytics Platform.
	 */
    protected GlobalBoundingBoxNodeDialog() {
        super();
        
     	
    }
}

