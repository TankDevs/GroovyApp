package com.zlh.groovycase

class GroovyExample {
    static void main(String[] args) {
//        Student mst = new Student()
//        println mst.getName()
//        mst.metaClass.setAttribute(mst, 'name', 'Mark')
//        println mst.getName()

        Student mst = new Student()
        mst.Name = "Joe"
        mst.ID = 1

        println(mst.Name)
        println(mst.ID)

        mst.ddd()

    }
}

