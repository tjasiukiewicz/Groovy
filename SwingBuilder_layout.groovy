// SwingBuilder - layout

import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL // BorderLayout, BoxLayout, CardLayout, GridLayout ...

swing = new SwingBuilder()
frame = swing.frame(title:'Layout Demo') {
    panel(layout: new BL()) {
        button(constraints: BL.NORTH,  'North' )
        myTextField = textField(constraints: BL.CENTER, columns:1, 'X', id:'message')
        //button(constraints: BL.CENTER, 'Center')
        button(constraints: BL.SOUTH,  'South & action',
            // By ID 
            //actionPerformed: { event -> println "message: $swing.message.text"}
            // By source
            //actionPerformed: { event -> println "message: $event.source.parent.components[0].text"} 
            // By variable
            actionPerformed: { println "message $myTextField.text" }
        )
        button(constraints: BL.EAST,   'East'  )
        button(constraints: BL.WEST,   'West'  )
    }    
}
frame.pack()
frame.visible = true