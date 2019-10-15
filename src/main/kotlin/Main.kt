import org.eclipse.swt.widgets.Display

fun main (args: Array<String>){
    val window: MainWindow = MainWindow()
    window.setBlockOnOpen(true)
    window.open()
    Display.getCurrent().dispose()
}