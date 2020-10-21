import groovy.transform.TypeChecked

lst = [1, 2, 10]
lst.each {
    println it
}

@TypeChecked
def debugGraphics(List obj) {
    groovy.inspect.swingui.ObjectBrowser.inspect(obj)
}
debugGraphics(lst)