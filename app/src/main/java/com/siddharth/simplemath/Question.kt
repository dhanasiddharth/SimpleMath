package com.siddharth.simplemath

class Question() {

    var x: Int
    var y: Int

    var operation : Char

    var a: Int
    var b: Int
    var c: Int
    var d: Int
    var e: Int
    var f: Int

    var attempted: Boolean = false;

    var answer: Int

    fun isAnswer(option: String) : Boolean {
        attempted = true;
        return option.toInt() == answer
    }

    fun getQuestion() : String = x.toString() + " " + operation + " " + y.toString()

    init {
        x = 7
        y = 8
        operation = '+'
        a = 0
        b = 20
        c = 4
        d = 49
        e = 99
        f = 15
        answer = 15
    }
}