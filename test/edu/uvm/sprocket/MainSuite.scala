//-----------------------------------------------------------------------
// FILE    : MainSuite.scala
// SUBJECT : Class to do various testing operations on the Sprocket main.
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.vsc.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import org.scalatest.{Assertions, FunSuite}
import org.scalatest.Matchers

class MainSuite extends FunSuite with Assertions with Matchers {

  test("Dummy Test") {
    println("Hello, World!")
  }

}
