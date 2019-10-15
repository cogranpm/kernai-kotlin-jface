import org.eclipse.jface.window.ApplicationWindow
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Label

class MainWindow : ApplicationWindow(null) {

    override fun createContents(parent: Composite?): Control {
        val container: Composite = Composite(parent, SWT.NONE)
        val lblName: Label = Label(container, SWT.NONE)
        lblName.text = "Name"
        return container
    }
}