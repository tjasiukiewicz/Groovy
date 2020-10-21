// SwingBuilder
import groovy.swing.SwingBuilder

swing = new SwingBuilder()
frame = swing.frame(title:'DETONATE!') {
        menuBar {
            menu('Action') {
                menuItem 'New World' 
                menuItem 'Detonate'
                menuItem 'Other destruction'
            }
        }
    panel {
        label 'Time (sec)'
        slider()
        comboBox(items:['TNT','C4','Nitroglyceryn'])
    }    
}
frame.pack()
frame.visible = true