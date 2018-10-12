package com.zlh.groovycase
//https://www.w3cschool.cn/groovy/groovy_meta_object_programming.html

/*class Student {
    private String name = "Joe";

    String getName() {
        return this.name;
    }
}*/

class Student {
    protected dynamicProps = [:]


    @Override
    void setProperty(String pName, val) {
        dynamicProps[pName] = val
    }

    @Override
    Object getProperty(String propertyName) {
        return dynamicProps[propertyName]
    }

    @Override
    def invokeMethod(String name, Object args) {
        println "invokeMethod"
        return "called invokeMethod $name $args"
    }

//    def methodMissing(String name, def args) {
//        println "Missing method"
//    }
}
