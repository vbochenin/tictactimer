package com.tictactimer

import org.scalatest.FunSuite

class SmokeTest extends FunSuite {

  test("Answer to the Ultimate Question of Life, The Universe, and Everything") {
    assert(DeapThought.getAnswer == 42)
  }
}
