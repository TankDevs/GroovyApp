package com.zlh.groovycase

//def clos = {println "Hello ${it}"}
//clos.call("World")
//
//def clos1={a,b->a+b}
//print clos1.call(34,2)

import groovy.text.*
import java.io.*

def file = new File("F:\\GitHub\\TankIdea\\GroovyCase\\Student.template")
def binding = ['name' : 'Joe', 'id' : 1, 'subject' : 'Physics']

def engine = new SimpleTemplateEngine()
def template = engine.createTemplate(file)
def writable = template.make(binding)

println writable