package ch.res_ear.samthiriot.knime.shapefilesaswkt.read.read_from_kml;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentFileChooser;
import org.knime.core.node.defaultnodesettings.SettingsModelString;

/**
 * Dialog to configure this node.
 * 
 * @author Samuel Thiriot
 */
public class ReadKMLAsWKTNodeDialog extends DefaultNodeSettingsPane {


    protected ReadKMLAsWKTNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentFileChooser(
        		new SettingsModelString("filename", null),
        		"KML",
        		".kml" // TODO other extensions?
        		));
                   

    }
}

