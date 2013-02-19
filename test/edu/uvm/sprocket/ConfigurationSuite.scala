//-----------------------------------------------------------------------
// FILE    : ConfigurationSuite.scala
// SUBJECT : Tests for class ConfigurationSettings
// AUTHOR  : (C) Copyright 2012 by Peter C. Chapin <PChapin@vtc.edu.edu>
//
//-----------------------------------------------------------------------
package edu.uvm.sprocket

import org.scalatest.{Assertions, FunSuite}
import org.scalatest.matchers.ShouldMatchers

class ConfigurationSuite extends FunSuite with Assertions with ShouldMatchers {

  test("Basic configuration") {
    // This test is rather limited. It should be enhanced at some point.

    val configurableItems =
      Map( "StringItem"  -> ConfigurationSettings.basicStringValidator  _,
           "BooleanItem" -> ConfigurationSettings.basicBooleanValidator _,
           "IntegerItem" -> ConfigurationSettings.basicIntegerValidator _,
           "TestItem1"   -> ConfigurationSettings.basicStringValidator  _)

    val currentSettings = new ConfigurationSettings(configurableItems)
    assert(currentSettings("StringItem" ) == None)
    assert(currentSettings("BooleanItem") == None)
    assert(currentSettings("IntegerItem") == None)

    currentSettings.setDefaults(Map("StringItem" -> "Hello", "BooleanItem" -> "F"))
    assert(currentSettings("StringItem" ) == Some("Hello"))
    assert(currentSettings("BooleanItem") == Some("false"))
    assert(currentSettings("IntegerItem") == None)

    currentSettings.readConfigurationFile(
      "testData" + java.io.File.separator + "example.cfg")
    assert(currentSettings("StringItem" ) == Some("Item1"))
    assert(currentSettings("BooleanItem") == Some("true" ))
    assert(currentSettings("IntegerItem") == Some("1234" ))
    assert(currentSettings("TestItem1"  ) == Some("This #string"))
  }

}
